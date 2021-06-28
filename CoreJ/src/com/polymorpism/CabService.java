package com.polymorpism;

import java.util.Arrays;

public class CabService {
	private int[] route={1,2,3};
	private String seater[]= {"Four", "Two"};
	private String model[];
	private int price[];
	private int time[];
	private int input;
	
	public String getRoute() {
		return Arrays.toString(route);
	}
	public String getSeater() {
		return Arrays.toString(seater);
	}
	public String getModel(int input) {
		return model[input];
	}
	public int getPrice(int input) {
		return price[input];
	}
	public int getTime(int input) {
		return time[input];
	}
	
		
	public int getInput() {
		return input;
	}
	public void setInput(int input) {
		this.input = input;
	}
	
	@Override
	public String toString() {
		return "CabService [route=" + Arrays.toString(route) + ", seater=" + Arrays.toString(seater) + "]";
	}
	
	
	
	
	
	
	
	

}
