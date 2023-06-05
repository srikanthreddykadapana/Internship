package flip_Robo;
import java.util.Scanner;

public class NumberTable {
	public static void printNumberTable(int number) {
		for(int i=1; i<=10; i++) {
			System.out.println(number + " X " + i + " = " + number*i );
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number for Table: ");
		int number = sc.nextInt();
		sc.close();
		
		printNumberTable(number);
		}

}
