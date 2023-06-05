package flip_Robo;

import java.util.Scanner;

public class RectangleCalculator {

	public static double calculateArea(double length, double width) {
		double area = length * width;
		return area;
	}

	public static double calculatePerimeter(double length, double width) {
		double perimeter = 2 * (length + width);
		return perimeter;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the length of the rectangle: ");
		double length = scanner.nextDouble();

		System.out.print("Enter the width of the rectangle: ");
		double width = scanner.nextDouble();

		scanner.close();

		double area = calculateArea(length, width);
		double perimeter = calculatePerimeter(length, width);

		System.out.println("Area of the rectangle: " + area);
		System.out.println("Perimeter of the rectangle: " + perimeter);
	}

}
