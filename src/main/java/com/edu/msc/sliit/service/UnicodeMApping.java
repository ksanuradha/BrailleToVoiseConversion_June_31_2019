package com.edu.msc.sliit.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.springframework.stereotype.Service;

import com.edu.msc.sliit.model.BraileeToEnglishText;
import com.edu.msc.sliit.model.BraileeToNumaricPunctuation;
import com.edu.msc.sliit.model.BraileeToSinhalaText;

@Service
public class UnicodeMApping {

	public static HashMap<Integer, String[]> sinhalaUnicodes = new HashMap<Integer, String[]>();

	public HashMap<Integer, String[]> unicodeStringHashMap(
			HashMap<Integer, int[]> calculateBanayValuesForEachCordinates) {
		int row = 0;
		boolean flag = false;
		HashMap<Integer, int[]> testOne = calculateBanayValuesForEachCordinates;
		Iterator hmIterator = testOne.entrySet().iterator(); // test one should replace with
																// calculateBanayValuesForEachCordinates
		while (hmIterator.hasNext()) {
			Map.Entry mapElement = (Map.Entry) hmIterator.next();
			int[] cordinates = ((int[]) mapElement.getValue());
			String sinRowUnicodes[] = new String[cordinates.length];
			l1: for (int i = 0; i < cordinates.length; i++) {
				if (cordinates[i] == 60) {
					flag = true;
					continue l1;
				} else if (cordinates[i] == 48) {
					flag = false;
					continue l1;
				} else if (cordinates[i] == 0) {
					flag = false;
				}

				if (flag) {
					sinRowUnicodes[i] = BraileeToNumaricPunctuation.numaricAndPunctuation.get(cordinates[i]) + "*";
				} else {
					sinRowUnicodes[i] = BraileeToSinhalaText.sinhalaLetters.get(cordinates[i]) + "*";
					// System.out.println(BraileeToSinhalaText.sinhalaLetters.get(cordinates[i]));
					if (sinRowUnicodes[i].equals(null + "*".toString())) {
						sinRowUnicodes[i] = BraileeToNumaricPunctuation.numaricAndPunctuation.get(cordinates[i]) + "*";
					}
				}

			}
			sinhalaUnicodes.put(row, sinRowUnicodes);
			row++;
		}
		// printHashMap(sinhalaUnicodes);
		return sinhalaUnicodes;
		// System.out.println(Arrays.toString(cordinates));
	}

	public String normalizeHashMap(HashMap<Integer, String[]> unicodeStringHashMap) {
		String word = "";
		Iterator hmIterator = unicodeStringHashMap.entrySet().iterator();
		while (hmIterator.hasNext()) {
			Map.Entry mapElement = (Map.Entry) hmIterator.next();
			String[] cordinates = ((String[]) mapElement.getValue());
			for (int i = 0; i < cordinates.length; i++) {
//				 writer.println(cordinates[i]);
//				 writer.println("***************");
				word = Normalization.sinhalaNormalization(word + cordinates[i]);
//				 writer.println(word);

			}
			// System.out.println();
			word = word + "\n";
		}
//		writer.close();
		return word;
	}

	//English Test generation
	public String englishSentence(HashMap<Integer, int[]> calculateBanayValuesForEachCordinates) {		
		String letter = "";
		String englishSentence = "";
		boolean flag = false;
		HashMap<Integer, int[]> testOne = calculateBanayValuesForEachCordinates;
		Iterator hmIterator = testOne.entrySet().iterator(); // test one should replace with
																// calculateBanayValuesForEachCordinates
		while (hmIterator.hasNext()) {
			Map.Entry mapElement = (Map.Entry) hmIterator.next();
			int[] cordinates = ((int[]) mapElement.getValue());
			l1: for (int i = 0; i < cordinates.length; i++) {
				if (cordinates[i] == 60) {
					flag = true;
					continue l1;
				} else if (cordinates[i] == 48) {
					flag = false;
					continue l1;
				} else if (cordinates[i] == 0) {
					flag = false;
				}

				if (flag) {
					letter =BraileeToNumaricPunctuation.numaricAndPunctuation.get(cordinates[i]);
				} else {
					letter = BraileeToEnglishText.englishLetters.get(cordinates[i]);
					// System.out.println(BraileeToSinhalaText.sinhalaLetters.get(cordinates[i]));
					if (letter==null) {
						letter = BraileeToNumaricPunctuation.numaricAndPunctuation.get(cordinates[i]);
					}
				}
				englishSentence =englishSentence+letter;
			}
			englishSentence=englishSentence+"\n";
		}
		return englishSentence;
	}

	// Test Purpose
	private void printHashMap(HashMap<Integer, String[]> calculateBanayValuesForEachCordinates) {
		Iterator hmIterator = calculateBanayValuesForEachCordinates.entrySet().iterator();
		while (hmIterator.hasNext()) {
			Map.Entry mapElement = (Map.Entry) hmIterator.next();
			String[] cordinates = ((String[]) mapElement.getValue());
			System.out.println(Arrays.toString(cordinates));
		}
	}

	// Test Purpose
	private void printHashMap2(HashMap<Integer, int[]> calculateBanayValuesForEachCordinates) {
		Iterator hmIterator = calculateBanayValuesForEachCordinates.entrySet().iterator();
		while (hmIterator.hasNext()) {
			Map.Entry mapElement = (Map.Entry) hmIterator.next();
			int[] cordinates = ((int[]) mapElement.getValue());
			System.out.println(Arrays.toString(cordinates));
		}
	}
}
