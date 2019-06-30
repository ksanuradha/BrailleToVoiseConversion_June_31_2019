package com.edu.msc.sliit.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

@Service
public class CountWhireSpots {
	public void drawALine(HashMap<Integer, ArrayList<Double>> avegXYCordinates) {
		//Image A width : 659 height 666
		//Image B 664 height707
		
		Mat image = Imgcodecs.imread("./src/main/resources/static/img/dilate.jpg", 3);
		Iterator hmIterator = avegXYCordinates.entrySet().iterator();
		int a = 0;
		while (hmIterator.hasNext()) {
			Map.Entry mapElement = (Map.Entry) hmIterator.next();
			ArrayList<Double> cordinates = ((ArrayList<Double>) mapElement.getValue());
			if (a == 0) {
				for (int i = 0; i < cordinates.size(); i++) { //height
					// System.out.println("cordinates.get(i) : "+i+" "+cordinates.get(i));
					Point pt1 = new Point(cordinates.get(i), 0);
					Point pt2 = new Point(cordinates.get(i), 750);
					Imgproc.line(image, pt1, pt2, new Scalar(0, 255, 0), 1);
				}
			} else {
				for (int i = 0; i < cordinates.size(); i++) { //Width
					// System.out.println("cordinates.get(i) : "+i+" "+cordinates.get(i));
					Point pt1 = new Point(0, cordinates.get(i));
					Point pt2 = new Point(750, cordinates.get(i));
					Imgproc.line(image, pt1, pt2, new Scalar(0, 255, 0), 1);
				}
			}
			a++;
		}
		Imgcodecs.imwrite("./src/main/resources/static/img/katee.jpg", image);
	}
	
//	public void drawALine(HashMap<Integer, ArrayList<Double>> avegXYCordinates) {
//		//Image A width : 659 height 666
//		//Image B 664 height707
//		
//		Mat image = Imgcodecs.imread("./src/main/resources/static/img/dilate.jpg", 3);
//		Iterator hmIterator = avegXYCordinates.entrySet().iterator();
//		int a = 0;
//		while (hmIterator.hasNext()) {
//			Map.Entry mapElement = (Map.Entry) hmIterator.next();
//			ArrayList<Double> cordinates = ((ArrayList<Double>) mapElement.getValue());
//			if (a == 0) {
//				for (int i = 0; i < cordinates.size(); i++) {
//					// System.out.println("cordinates.get(i) : "+i+" "+cordinates.get(i));
//					Point pt1 = new Point(cordinates.get(i), 0);
//					Point pt2 = new Point(cordinates.get(i), 707);
//					Imgproc.line(image, pt1, pt2, new Scalar(0, 255, 0), 1);
//				}
//			} else {
//				for (int i = 0; i < cordinates.size(); i++) {
//					// System.out.println("cordinates.get(i) : "+i+" "+cordinates.get(i));
//					Point pt1 = new Point(0, cordinates.get(i));
//					Point pt2 = new Point(664, cordinates.get(i));
//					Imgproc.line(image, pt1, pt2, new Scalar(0, 255, 0), 1);
//				}
//			}
//			a++;
//		}
//		Imgcodecs.imwrite("./src/main/resources/static/img/katee.jpg", image);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public void drawALine(HashMap<Integer, ArrayList<Double>> avegXYCordinates) {
//		Mat image = Imgcodecs.imread("./src/main/resources/static/img/dilate.jpg", 3);
//		Iterator hmIterator = avegXYCordinates.entrySet().iterator();
//		int a = 0;
//		while (hmIterator.hasNext()) {
//			Map.Entry mapElement = (Map.Entry) hmIterator.next();
//			ArrayList<Double> cordinates = ((ArrayList<Double>) mapElement.getValue());
//			if (a == 0) {
//				for (int i = 0; i < cordinates.size(); i++) {
//					// System.out.println("cordinates.get(i) : "+i+" "+cordinates.get(i));
//					Point pt1 = new Point(cordinates.get(i), 0);
//					Point pt2 = new Point(cordinates.get(i), 470);
//					Imgproc.line(image, pt1, pt2, new Scalar(0, 255, 0), 1);
//				}
//			} else {
//				for (int i = 0; i < cordinates.size(); i++) {
//					// System.out.println("cordinates.get(i) : "+i+" "+cordinates.get(i));
//					Point pt1 = new Point(0, cordinates.get(i));
//					Point pt2 = new Point(679, cordinates.get(i));
//					Imgproc.line(image, pt1, pt2, new Scalar(0, 255, 0), 1);
//				}
//			}
//			a++;
//		}
//		Imgcodecs.imwrite("./src/main/resources/static/img/katee.jpg", image);
//	}
}
