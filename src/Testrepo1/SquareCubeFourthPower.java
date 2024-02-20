package Testrepo1;

import java.util.Scanner;

public class SquareCubeFourthPower {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner obj = new Scanner(System.in);
		double num = obj.nextDouble();
		System.out.println("Square root is : " + (num*num));
		System.out.println("Cube root is : " + (num*num*num));
		System.out.println("Fourth root is : " + (num*num*num*num));
	}

}
