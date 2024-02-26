package assignments;

import java.util.Scanner;

public class PositiveorNegativeNum {

	public static void main(String[] args) {

		System.out.println("Enter a number:");
		Scanner obj = new Scanner(System.in);
		double num = obj.nextDouble();
		if (num >=0) {
			System.out.println("Entered number is Positive");
		}
		else {
			System.out.println("Entered number is Negative");
		}
	}

}
