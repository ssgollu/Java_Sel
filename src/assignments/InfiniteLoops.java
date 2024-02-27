package assignments;

import java.util.Scanner;

public class InfiniteLoops {

	public static void main(String[] args) {
		System.out.println("Enter a number between 1,2,3");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		switch(num) {
		case 1:
		
			System.out.println("Invoking Infinite loop 1 :");
			for(int i =0 ;true;i++)
				System.out.println("Loop 1");
		case 2:
		
			System.out.println("Invoking Infinite loop 2 :");
			while(true)
				System.out.println("Loop 2");
		case 3:
		
			System.out.println("Invoking Infinite loop 3 :");
			do {
				System.out.println("Loop 3");
			}
			while(true);	
		default :
			System.out.println("Enter only the valid numbers.");
	}
		
	
	
	}

}
