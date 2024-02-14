package Testrepo1;

import java.util.Scanner;

public class ConvertTime {

	public static void main(String[] args) {
		System.out.print("Enter a number:");
		Scanner scan_obj = new Scanner(System.in);
		int user_input = scan_obj.nextInt();
		int seconds = user_input%60;
		int hours = user_input/3600;
		int minutes = (user_input/60)%60 ;
		System.out.println(user_input+" is "+hours+"hours "+minutes+"minutes "+seconds+"seconds"  );
		
//		System.out.println(hours);
//		System.out.println(minutes);
//		System.out.println(seconds);
		
		
	}

}
