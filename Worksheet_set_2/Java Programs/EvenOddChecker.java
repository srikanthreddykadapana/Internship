package flip_Robo;
import java.util.Scanner;

public class EvenOddChecker {
	
public static boolean isEven(int number) {
	return number%2==0;
}
public static void main(String[] args) {
	Scanner scr = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number = scr.nextInt();
	scr.close();
	
	if(isEven(number)) {
		System.out.println(number + " is Even");
	}
	else {
		System.out.println(number + " is Odd");
	}
}
}
