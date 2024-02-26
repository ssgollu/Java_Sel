package assignments;

import java.util.Scanner;

public class DisplayWeekdayName {

	public static void main(String[] args) {
		System.out.println("Enter a number between 1-7:");
		Scanner input = new Scanner(System.in);
		int day_num = input.nextInt();
		if (day_num == 1) {
			System.out.println(day_num + "- Sunday");
		} 
		else if (day_num == 2 ) {
			System.out.println(day_num + "- Monday");
		}
		else if (day_num == 3 ) {
			System.out.println(day_num + "- Tuesday");
		}
		else if (day_num == 4 ) {
			System.out.println(day_num + "- Wednesday");
		}
		else if (day_num == 5 ) {
			System.out.println(day_num + "- Thursday");
		}
		else if (day_num == 6 ) {
			System.out.println(day_num + "- Friday");
		}
		else if (day_num == 7 ) {
			System.out.println(day_num + "- Saturday");
		}
		else if (day_num <1 || day_num >7) {
			System.out.println("Invalid Entry");
		}
		
	}

}
