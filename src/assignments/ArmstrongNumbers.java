package assignments;

import java.util.Scanner;

public class ArmstrongNumbers {

    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 0 and 999:");

        for (int num = 0; num <= 999; num++) {
            int originalNum = num;
            int sum = 0;

            while (originalNum > 0) {
                int digit = originalNum % 10;
                sum = sum + (digit * digit * digit);
                originalNum = originalNum/10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}

