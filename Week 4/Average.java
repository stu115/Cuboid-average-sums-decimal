package week4;

import java.util.Scanner;


public class Average {

	public static void main(String[]args){
	
	Scanner input = new Scanner(System.in);
	
	int A = 8;
	int B = 12;
	int C = 25;
	
	System.out.println("Here are thre numbers: 8,12 and 25. Work out the average of the 3 numbers: ");
	int average = input.nextInt();
	
	int avg = A + B + C/3;
	
	System.out.println("The average of the three numbers is " + avg);
	}

}
