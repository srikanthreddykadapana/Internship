package flip_Robo;
import java.util.Scanner;

public class SimpleInterest {

	public static double calculateSI(double principle, float ROI, int time) {
		double SI = ((principle * ROI * time)/100);
		return SI;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principle amount: ");
		double principle = sc.nextDouble();
		
		System.out.println("Enter the Rate of Interest: ");
		float ROI = sc.nextFloat();
		
		System.out.println("Enter time period in months: ");
		int time = sc.nextInt();
		
		sc.close();
		
		double SI = calculateSI(principle, ROI, time);
		System.out.println("The simple interest calculated is: " + SI);
		
	}
}
