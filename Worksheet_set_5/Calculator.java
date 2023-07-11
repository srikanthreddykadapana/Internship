package com.flipRobo.assignment;

public class Calculator {
	// an instance variable num with value 100
	int num = 100;
	
	// a local variable num in the method
	public void calc(int num) {
		/* here this is pointing to the instance variable, 
		where it will get updated when this method is called.*/
		this.num = num * 10;
	}
	
	// another method which will print the value of an instance variable.
	public void printNum() {
		System.out.println(num);
	}

	public static void main(String[] args) {
		
		// object created for Calculator Class
		Calculator obj = new Calculator();
		// calc() method called with a parameter 2. Therefore the value of num cahnges to 20
		obj.calc(2);
		
		// printNum() method called to print the value of num
		obj.printNum();
	}

}
 // Output is 20
// Had 'this' keyword not been used then the output would have been 100.