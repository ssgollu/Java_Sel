package assignments;

public class NumberSwapNoThirdVar {

	public static void main(String[] args) {
		int i = 10;
		int j = 7;
		i = i+j; // value of i is now 17 and j is 7
		j = i-j; // value of i is 17 and j is 7; 17-7 is 10, j is now assigned value 10
		i = i-j; // value of i is 17 and j is 10; 17-10 is 7, is now assigned value 7
		System.out.println(i);
		System.out.println(j);

	}

}