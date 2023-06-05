package flip_Robo;
import java.util.Scanner;

public class AverageCalculator {

	public static double calculateAverage(double num1, double num2) {
		return (num1+num2)/2;
	}
	
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double num1 = scr.nextDouble();
		
		System.out.println("Enter the Second number: ");
		double num2 = scr.nextDouble();
		scr.close();
		
		double average = calculateAverage(num1, num2);
		System.out.println("The average of two numbers is: " + average);
	}
}
