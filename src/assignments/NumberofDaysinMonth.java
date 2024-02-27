package assignments;

import java.util.Scanner;

public class NumberofDaysinMonth {

	public static void main(String[] args) {
		System.out.println("Enter a number between 1 to 12 :");
		Scanner obj = new Scanner(System.in);
		int num_entered = obj.nextInt();
		int num_of_days = 0;
		System.out.println("Enter the year :");
		int year = obj.nextInt();
		switch (num_entered) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8: 
		case 10:
		case 12:
		num_of_days = 31;	
		System.out.println("Num of days are " + num_of_days);
		break;
		case 2:
			if((year%4==0 && year%100!=0) || year%400 ==0) {
			num_of_days = 29;
			System.out.println("Num of days are " + num_of_days);
			}
			else {
				num_of_days = 28;
				System.out.println("Num of days are " + num_of_days);
			}
		break;
		default:
			num_of_days = 30;
			System.out.println("Num of days are " + num_of_days);
		break;
		}
	}

}
