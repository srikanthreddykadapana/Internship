package com.flipRobo.assignment;

public class FlipRobo {

	// constructor
	FlipRobo() {
		System.out.println("constructor called");
	}
/*The line declares a static variable a of type 'FlipRobo' and 
	a new instance for 'FlipRobo' class is created.
	this line also triggers the execution of the constructor */
	
	static FlipRobo a = new FlipRobo(); // line 8

	public static void main(String args[]) {
		FlipRobo b; // line 12
	/* Here again a variable 'b' is declared and an instance is created
		for the constructor */
		b = new FlipRobo();
	}

}
// Output: constructor called
//			constructor called
