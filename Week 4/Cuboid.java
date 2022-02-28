package week4;

import java.util.Scanner;

public class Cuboid {

	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		double width = 8; 
		double length = 8;
		double height = 9; 
		
		System.out.println("A cuboid has sides" + width + "cm width," + length + "cm," + height + "cm,");
		
		
		double volume = width*length*height;
		
		System.out.println("The volume of the cuboid is " + volume);
		
		System.out.printf("The volume of the cuboid is %.2f", volume);
	}
	
	
}
