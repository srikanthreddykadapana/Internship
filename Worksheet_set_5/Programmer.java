package com.flipRobo.assignment;

// The code is an implementation of method overriding
// same method write() is used in all three classes
class Writer {
	public static void write() {
		System.out.println("Writing...");
	}
}
// The static keyword in each method overrides its preceding method.
class Author extends Writer {
	public static void write() {
		System.out.println("Writing book");
	}
}

public class Programmer extends Author {
	public static void write() {
		System.out.println("Writing code");
	}

	public static void main(String[] args) {
		/* a new instance of a Programmer class is created and assigned to a variable
		 * 'a' of type Author.*/
		Author a = new Programmer();
		
		// here a method from Author class is called.
		a.write();
	}
}

// Output: "Writing Book"
