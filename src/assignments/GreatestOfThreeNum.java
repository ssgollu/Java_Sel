package assignments;

import java.util.Scanner;

public class GreatestOfThreeNum {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter first number :");
		int num1 = obj.nextInt();
		System.out.println("Enter second number :");
		int num2 = obj.nextInt();
		System.out.println("Enter third number :");
		int num3 = obj.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println(num1 + " Num1 is greatest of all 3");
		} else if (num2 >= num3 && num2 >= num1) {
			System.out.println(num2 + " Num2 is greatest of all 3");
		}else {
			System.out.println(num3 + " Num3 is greatest of all 3");
		} 
	
	
	}

}
