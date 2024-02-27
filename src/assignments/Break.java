package assignments;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		System.out.println("Enter a number :");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		while(true)
		{
			if (num <0)
				{
				System.out.println("Break loop");
				break;
				}
			else {
				System.out.println("Infinite loop");
			}
		}
	}

}
