package assignments;

import java.util.Scanner;

public class SumofDigitsofNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number :");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		int digit_sum = num;
		int sum = 0;
		while(digit_sum!=0)
		{
			int remainder = digit_sum%10;
			sum = sum + remainder;
			digit_sum = digit_sum/10;
			
		}
		System.out.println("Sum of the digits of "+num+ " is : " + sum);
	}

}
