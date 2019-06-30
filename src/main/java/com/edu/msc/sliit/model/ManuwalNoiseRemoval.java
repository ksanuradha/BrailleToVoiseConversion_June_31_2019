package com.edu.msc.sliit.model;

import java.util.HashMap;

public class ManuwalNoiseRemoval {

	public static HashMap<Integer, Boolean> SinDoc1 = new HashMap<Integer, Boolean>();

	public static HashMap<Integer, Boolean> englishDoc1 = new HashMap<Integer, Boolean>();

	static {
		SinDoc1.put(33, true);
		SinDoc1.put(34, true);
		SinDoc1.put(266, true);

		englishDoc1.put(331, true);
		englishDoc1.put(332, true);
	}

	public static boolean noisereport(int width, int height, int findcount) {

		System.out.println("noisereport : width "+width+" Height "+height);
		System.out.println("( width == 679 && height == 714 ) : "+( width == 679 && height == 714 ));
		if ( width == 679 && height == 714 ) {  
			try {
				if (SinDoc1.get(findcount)) {
					System.out.println("Noise no : "+SinDoc1.get(findcount));
					return false;
				} else {
					System.out.println("Not a noise");
					return true;
				}
			} catch (Exception e) {
				System.out.println("Exception Block is Run");
				return true;
			}
		} else {//Otherdocuments
			System.out.println("Widh and height not matchedd");
			return true;
		}
	}
}
