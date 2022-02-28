package week5;

public class LargestDecimal {
	public static void main (String[]args){
	
	
Console console = new Console();

double num1= console.askDouble("Enter the first decimal number:");

double num2 = console.askDouble("Enter the second decimal number:");

double num3 = console.askDouble("Enter the third decimal number:");

double largest=0;

if((num1 > num2) && (num1 > num3)){
	
	largest = num1;

}
else if((num2 > num1) && (num2 > num3)){
	
	largest = num2;
}


else {
	largest = num3;
}

{
System.out.println("The largest of the three decimal numbers is " + largest);
}

}
}
