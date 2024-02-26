package assignments;

import java.util.Scanner;

public class ReverseDigitsofNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number :");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		int rev_num = 0;
		while(num!=0)
		{
			int remainder = num%10;
			rev_num = (rev_num*10) + remainder;
			num = num/10;
		}
	System.out.println("Reversed digit number is :" + rev_num);
	}
}
