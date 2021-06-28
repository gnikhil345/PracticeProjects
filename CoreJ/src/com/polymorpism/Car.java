package com.polymorpism;

import java.util.Arrays;

public class Car extends CabService {
	private String model[]= {"WagonR", "Swift"};
	private int price[]= {280, 320};
	private int time[] = {40, 35};
	private static int input;
	
	public String getModel(int input) {
		return model[input];
	}
	public int getPrice(int input) {
		return price[input];
	}
	public int getTime(int input) {
		return time[input];
	}
	@Override
	public String toString() {
		return "Car [model=" + getModel(getInput()) + ", price=" + getPrice(getInput()) + ", time="
				+ getTime(getInput()) + "]";
	}
	
	
	
	
	
//	@Override
//	public String toString() {
//		return "Car [model=" + Arrays.toString(model) + ", price=" + Arrays.toString(price) + ", time="
//				+ Arrays.toString(time) + "]";
//	}
	
	
	
	
	
}
