package flip_Robo;

import java.util.Scanner;

public class PrimeNumber {

	//Define a method to check if a given number is prime or not.
	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");

		int num = sc.nextInt();
		sc.close();

		// Call the method to check if a number is Prime or not.
		boolean check = isPrime(num);

		// Print the result based on the value returned by the method.
		if (check) {
			System.out.println(num + " is a Prime number");
		} else {
			System.out.println(num + " is not a Prime number");
		}

	}
}
