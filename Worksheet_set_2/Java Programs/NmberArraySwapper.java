package flip_Robo;

import java.util.Scanner;

public class NmberArraySwapper {
	public static void swapArrayNumbers(int[] num) {
		int temp_ar = num[0];
		num[0] = num[1];
		num[1] = temp_ar;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");

		int size = sc.nextInt();
		int[] num = new int[size];
		System.out.println("The Array elements before swapping");
		for (int i = 0; i < num.length; i++) {
			System.out.println("Element " + (i + 1) + ": ");
			num[i] = sc.nextInt();
		}
		sc.close();

		swapArrayNumbers(num);
		System.out.println("The Array elements After swapping");

		System.out.println("the element 1 is: " + num[0]);
		System.out.println("the element 2 is: " + num[1]);

	}
}
