package com.edu.msc.sliit.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Service
public class FindXCordinates {
	
	ArrayList<Double> dupicates =null;
	ArrayList<Double> dupicatesX =null;

	// Geting X and Y Cordinates with no duplicates and Assending Order
	public HashMap<Integer, ArrayList<Double>> findAverageXCordinates(HashMap<Integer, double[]> findRectangle) {
		HashMap<Integer, ArrayList<Double>> xyCordinates = new HashMap<Integer, ArrayList<Double>>();
		dupicates=new ArrayList<>();
		dupicatesX = new ArrayList<>();
		Iterator hmIterator = findRectangle.entrySet().iterator();
		while (hmIterator.hasNext()) {
			Map.Entry mapElement = (Map.Entry) hmIterator.next();
			double[] cordinates = ((double[]) mapElement.getValue());
			dupicates.add(cordinates[1]);// Getting Y cordinates
			dupicatesX.add(cordinates[0]);// Getting X cordinates
		}
		Collections.sort(dupicates);// Sorting the Array
		Collections.sort(dupicatesX);// Sorting the Array
		xyCordinates.put(0, dupicatesX);// Draw top To Bottom
		xyCordinates.put(1, dupicates);// Draw left to Right
		return getAvegXYCordinates(xyCordinates);
	}

	// Getting X and Y Cordinates Averages
	public HashMap<Integer, ArrayList<Double>> getAvegXYCordinates(
			HashMap<Integer, ArrayList<Double>> findAverageXCordinates) {
		Iterator hmIterator = findAverageXCordinates.entrySet().iterator();
		int a = 0;
		HashMap<Integer, ArrayList<Double>> averageXYCordinates = new HashMap<Integer, ArrayList<Double>>();
		ArrayList<Double> avegXYCordinates = null;
		while (hmIterator.hasNext()) {
			Map.Entry mapElement = (Map.Entry) hmIterator.next();
			ArrayList<Double> cordinates = ((ArrayList<Double>) mapElement.getValue());// 1 St iteratin get X cordinates
																						// 2nd Y cordinates
			if (a == 0) { // a==0 for Y a==1 for x
				//averageXYCordinates.put(0, getColumnAverage(getAvegXYCordinates(cordinates, 1.5)));// X Cordinates->||
				averageXYCordinates.put(0, getAvegXYCordinates(cordinates, 1.5));																					// lines
			} else {
				averageXYCordinates.put(1, getAvegXYCordinates(cordinates, 1.9));// Y Cordinates ->-- lines
			}
			a++;
		}
		return averageXYCordinates;
	}
	// Calculate Average
	private ArrayList<Double> getAvegXYCordinates(ArrayList<Double> cordinates, double nextIndex) {
		int startPosition = 0;
		double priviousValue = cordinates.get(0), sum = 0, avg = 0;
		ArrayList<Double> avgCordinates = new ArrayList<>();// store Avg Values
		for (int i = 0; i < cordinates.size(); i++) {
			sum = sum + cordinates.get(i); // Wrong
			startPosition++;
			// System.out.println("privious : "+priviousValue+" Current :
			// "+cordinates.get(i)+ " Difference : "+(cordinates.get(i)-priviousValue) );
			if ((priviousValue + nextIndex) < cordinates.get(i)) {
				// Do the Average Calculation
				sum = sum - cordinates.get(i);
				avg = sum / (startPosition - 1);
				avgCordinates.add(avg);
				avg = 0;
				startPosition = 1;// Start next Episode here
				sum = cordinates.get(i);// Start next Episode here
			}
			priviousValue = cordinates.get(i);
		}
		// Final iterations does not find priviousValue+2.8
		avg = sum / startPosition;
		avgCordinates.add(avg);
		return avgCordinates;
	}

	// Testing purpose prinyt Array List
	private void arrayListPrint(ArrayList<Double> cordinates) {
		for (int i = 0; i < cordinates.size(); i++) {
			System.out.print(cordinates.get(i) + ",");
		}
	}
}
