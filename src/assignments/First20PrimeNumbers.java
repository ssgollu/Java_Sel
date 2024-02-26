package assignments;

public class First20PrimeNumbers {

	public static void main(String[] args) {
		int count = 0;
		int num = 2;
		System.out.println("First twenty prime numbers:");

		while (count < 20) {
			boolean isPrime = true;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
			}

			}
			if(isPrime) {
				System.out.print(num +" ");
				count++;
			}
			num++;
		}
	}
}