package Testrepo1;

import java.util.Scanner;

public class SquareCubeFourthPower {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner obj = new Scanner(System.in);
		double num = obj.nextDouble();
		double squarert = num*num;
		System.out.println("Square root is : " + (squarert));
		System.out.println("Cube root is : " + (squarert*num));
		System.out.println("Fourth root is : " + (squarert*squarert));
	}

}
