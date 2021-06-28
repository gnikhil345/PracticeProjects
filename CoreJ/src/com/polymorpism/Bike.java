package com.polymorpism;

public class Bike extends CabService{
	private String model[]= {"Activa", "Pulsar"};
	private int price[]= {150, 180};
	private int time[] = {35, 30};
	
	
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
		return "Bike [model=" + getModel(getInput()) + ", price=" + getPrice(getInput()) + ", time="
				+ getTime(getInput()) + "]";
	}
}
