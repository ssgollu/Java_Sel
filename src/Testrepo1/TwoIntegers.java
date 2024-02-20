package Testrepo1;

import java.util.Scanner;
import java.lang.Math;

public class TwoIntegers {

	public static void main(String[] args) {
		System.out.println("Enter first number : ");
		Scanner obj1 = new Scanner(System.in);
		double num1 = obj1.nextDouble();
		System.out.println("Enter second number : ");
		Scanner obj2 = new Scanner(System.in);
		double num2 = obj2.nextDouble();
		
		System.out.println("Sum: " + (num1 + num2) );
		System.out.println("Difference: " + (num1 - num2));
		System.out.println("Product: " + (num1 * num2));
		System.out.println("Average: " + (num1+num2)/2 );
		double dist = (num1 > num2) ? (num1-num2):(num2-num1);
		System.out.println("Distance: " + dist);
		double max = (num1 > num2) ? num1 : num2;
		System.out.println("Max: " + max);
		double min = (num1 < num2) ? num1 : num2;
		System.out.println("Min: " + min);

		//java shell is throwing Input Mismatch exception for test number 3/4,6/9
	}

}
