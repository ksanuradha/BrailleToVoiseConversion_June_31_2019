package com.edu.msc.sliit.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.edu.msc.sliit.service.BinaryValueCalculation;
import com.edu.msc.sliit.service.BraileeDetect;
import com.edu.msc.sliit.service.CountWhireSpots;
import com.edu.msc.sliit.service.EnglishTextToVoise;
import com.edu.msc.sliit.service.FindXCordinates;
import com.edu.msc.sliit.service.SoundPlay;
import com.edu.msc.sliit.service.UnicodeMApping;

@RestController
@RequestMapping("/api/brailleapplication")
@ComponentScan("com.edu.msc.sliit")
public class BrailleApplicationRestController {
	
	@Autowired
	FindXCordinates findXCordinates;
	
	@Autowired
	CountWhireSpots countWhireSpots;
	
	@Autowired
	EnglishTextToVoise englishTextToVoise;
	
	@Autowired
	UnicodeMApping unicodeMApping;
	
	@Autowired
	SoundPlay soundPlay;
	
	public static HashMap<Integer, double[]> findRectangle;
	
	public static HashMap<Integer, int[]> calculatCordinates;
	
	private String sinhalaWord="";
	
	private HashMap<Integer, String[]> unicodeStringHashMap;
	
	public static Mat image;

	@PostMapping("/uploadFile")
	public void uploadFile(@RequestParam("uploadfile") MultipartFile uploadfile) {
		try {
			// Get the filename and build the local file path (be sure that the
			// application have write permissions on such directory)
			String filename = uploadfile.getOriginalFilename();
			String directory = "./src/main/resources/static/img";
			String filepath = Paths.get(directory, "brailee.jpg").toString();

			// Save the file locally
			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(filepath)));
			stream.write(uploadfile.getBytes());
			stream.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}// method uploadFile

	@PostMapping("/scan")
	public void scanImage() {
		try {
			image = Imgcodecs.imread("./src/main/resources/static/img/brailee.jpg", 1);
			findRectangle = new BraileeDetect(image).findRectangle();//No Problem
			HashMap<Integer, ArrayList<Double>> findAverageXCordinates = findXCordinates.findAverageXCordinates(findRectangle);
			new CountWhireSpots().drawALine(findAverageXCordinates);
			calculatCordinates = BinaryValueCalculation.calculateBanayValuesForEachCordinates(findAverageXCordinates);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@PostMapping(value = "/listen/{imgLanguage}")
	public void listenImage(@PathVariable String imgLanguage) {
			if(imgLanguage.equals("sinhala")){
				unicodeStringHashMap = unicodeMApping.unicodeStringHashMap(calculatCordinates);
				sinhalaWord = unicodeMApping.normalizeHashMap(unicodeStringHashMap);				
				soundPlay.sountPlay(sinhalaWord);
			}
			else {
				// English Braille
				String englishSentence = unicodeMApping.englishSentence(calculatCordinates);
				System.out.println(englishSentence.replaceAll("null", ""));
				EnglishTextToVoise.mySpeak(englishSentence.replaceAll("null", ""));
			}			
			
	}
}


//Testing purpose
//BinaryValueCalculation.printStringHashMap(unicodeStringHashMap);
//System.out.println();
//System.out.println("********Match Binary numbers with Sinhala Letters********");
//System.out.println();
//System.out.println(word);
//System.out.println();
//System.out.println("********Match Binary numbers with Sinhala Letters********");

//System.out.println();
//System.out.println("Original Test");
//System.out.println();
