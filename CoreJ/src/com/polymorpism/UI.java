package com.polymorpism;

import java.util.Scanner;

public class UI {
	static int route;
	static int seater;
	static int input;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CabService service = null;
		CabService cs=new CabService();
		System.out.println("Please select from available route"+cs.getRoute());
		route=sc.nextInt();
		System.out.println("Please select from available seater option"+cs.getSeater());
		seater=sc.nextInt();
		
		switch(seater) {
		case 4: service = new Car(); 
		break;
		case 2: service= new Bike();
		break;
		default: System.out.println("Invalid Input");
		}
		
		System.out.println("Please select from Available below models");
		for(int i=0; i<2; i++) {
			System.out.print(i+1+":");
			System.out.println(service.getModel(i));
//			System.out.println("Price"+service.getPrice(i));
//			System.out.println("Time"+service.getTime(i)+"min");
		}
		input= sc.nextInt();
		service.setInput(input);
		
		System.out.println("Here is the details for the option you selected");
		service=new UI().cabservices(seater);
		System.out.println("Route:"+route+" Service:"+service.toString());
	}
	
	public CabService cabservices(int seater) {
		if (seater==4) 
			return new Car();
		else 
			return new Bike();
		
		
		
	}

}
