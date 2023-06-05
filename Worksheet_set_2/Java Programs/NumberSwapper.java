package flip_Robo;

import java.util.Scanner;

public class NumberSwapper {

	public static void swapNumbers(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int number1 = scanner.nextInt();
		System.out.print("Enter the second number: ");
		int number2 = scanner.nextInt();
		scanner.close();

		System.out.println("Before swapping: ");
		System.out.println("Number 1: " + number1);
		System.out.println("Number 2: " + number2);

		swapNumbers(number1, number2);
		
/* you will notice that the values of 'a' & 'b' remains same
 * because the swapping operation does not affect the original values*/
		
		System.out.println("After swapping: ");
		System.out.println("Number 1: " + number1);
		System.out.println("Number 2: " + number2);
	
	}

}
