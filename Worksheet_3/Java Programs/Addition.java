package flip_Robo;

public class Addition {

	public int addTwoInt(int a, int b) {
		int sum =0;
		sum = a+ b;
		return sum;
	}
	
	public static void main(String[] args) {
		Addition add = new Addition();
		int sum = add.addTwoInt(45, 55);
		System.out.println("Sum of Two numbers is: " + sum);
	}
}
