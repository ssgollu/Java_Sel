package assignments;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
        System.out.println("Enter the number of Fibonacci numbers to generate:");
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("Fibonacci sequence:");

        int n1 = 0;
        int n2 = 1;
        for (int i = 0; i < n; i++) {

            int n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3; 
        }
    }

}
