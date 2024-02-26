package assignments;

import java.util.Iterator;
import java.util.Scanner;

public class FactorsofaNumber {
	public static void main(String args[]) {
		System.out.println("Enter a number to find it's factors: ");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		System.out.println("Factors for " +num+ " are : ");
		
		for(int i=1;i<=num;i++) {
			if (num%i==0) {
				System.out.print(i + " ");
				
			}
		}
	}

}
