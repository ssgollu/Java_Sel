package Testrepo1;

public class NumberSwap {

	public static void main(String[] args) {
		int i = 10;
		int j = 7;
		int temp = 0;
		temp = j; // assigning value of j(7) to temp, temp is now 7
		j = i; // assigning value of i(10) to j, j is now 10
		i = temp;//assigning value of temp(7) to i, i is now 7
		System.out.println(i);
		System.out.println(j);

	}

}
