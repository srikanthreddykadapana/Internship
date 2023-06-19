package flip_Robo;

public class Example {

	private int number;
	private String name;
	
	// Accessor Methods
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	//Mutator Methods
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//Method to print the details
	public void printDetails() {
		System.out.println("The number is; " + number);
		System.out.println("The name is: " + name);
	}
	
	public static void main(String[] args) {
		Example ex = new Example();
		
		
		//setting the values using the mutator methods
		ex.setNumber(123);
		ex.setName("Srikanth Reddy");
		
		//Retrieving the same values using the accessor methods
		int number = ex.getNumber();
		String name = ex.getName();
		
		//print the details
		ex.printDetails();
	}
}
