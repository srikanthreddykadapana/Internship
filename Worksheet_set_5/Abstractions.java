package com.flipRobo.assignment;

class First {
	
	// a constructor which prints the letter 'a'
	public First() { 
		System.out.println("a"); }
	}
	
	// second Class extends the first Class.
	class Second extends First
	{
	// a constructor which prints the letter 'b'	
	public Second() { 
		System.out.println("b"); }
	}
	
	// third Class extends the second Class, indirectly extends the first Class.
	class Third extends Second
	{
	// a constructor which prints the letter 'c'	
	public Third() { 
		System.out.println("c"); }
	}

	public class Abstractions
	{
	public static void main(String[] args)
	{
	// an object is created for Third Class. which by default calls all three methods.
		Third c = new Third();
	}
}
	
	//Output is a b c

