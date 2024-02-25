package assignments;
import java.util.Scanner;


public class CelsiusTemperatureConversion {

	public static void main(String[] args) {
		
		System.out.print("Enter temperature in Celsius : ");
		Scanner obj = new Scanner(System.in);
		double Celsius = obj.nextDouble();
		System.out.println(Celsius + " Celsius = " + ((1.8*Celsius)+32) + " Farenheit");
		System.out.println(Celsius + " Celsius = " + (Celsius+273) + " Kelvin");

		
		}
		
	}

