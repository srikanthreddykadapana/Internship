package com.flipRobo.assignment;

public class MethodOverloading {
	
	
	// Three methods created with same name but different parameters.
	
	// a method FlipRobo which accepts a parameter string type.
	public static void FlipRobo(String s)
	{
	System.out.println("String");
	}
	
	// This method accepts a parameter type Object.
	public static void FlipRobo(Object o)
	{
	System.out.println("Object");
	}
	
	
	public static void main(String args[])
	{
	
		// the FlipRobo method is called with the argument null.
	FlipRobo(null);
	
	/* Since null can refer to both String and Object types, 
	 * Java considers the most specific method that can accept null as the argument.
	 * In this case, the FlipRobo(String s) method is chosen because 
	 * it accepts a String parameter. Therefore, the output of this program will be
	 * "String" printed to the console.*/
	}


}
