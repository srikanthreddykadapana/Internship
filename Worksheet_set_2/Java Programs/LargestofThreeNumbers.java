package flip_Robo;

import java.util.Scanner;

public class LargestofThreeNumbers {
	
	public static void largestofThree(int a, int b, int c) {
		if(a>b && a>c) {
			System.out.println("The largest number is: " + a);
		}
		if(b>=a && b>=c) {
			System.out.println("The largest number is: " + b);
		}
		else {
			System.out.println("The largest number is: " + c);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input three values");
		int num1 = sc.nextInt();
		System.out.println("value of a is: " + num1);
		int num2 = sc.nextInt();
		System.out.println("value of b is: " + num2);
		int num3 = sc.nextInt();
		System.out.println("value of c is: " + num3);
	sc.close();
	
	
	largestofThree(num1, num2, num3);
	
	}
}
