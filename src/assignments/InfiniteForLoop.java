package assignments;

import java.util.Scanner;

public class InfiniteForLoop {

	public static void main(String[] args) {
		System.out.println("Enter a number between 1,2 : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		switch (num) {
		case 1:
			for (int i = 0; true; i++)
				System.out.println("Invoking Infinite for loop 1 ");
		case 2:
			for (;;)
				System.out.println("Invoking Infinite for loop 2 ");		
			
		default:
			System.out.println("Enter only the valid numbers.");
		}

	}
}
