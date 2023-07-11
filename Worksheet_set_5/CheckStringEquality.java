package com.flipRobo.assignment;

public class CheckStringEquality {

	public static void main(String args[]) {
		//s1 & s2 are two string Objects created for same content.
		String s1 = new String("FlipRobo");
		String s2 = new String("FlipRobo");
		// The new keyword explicitly creates two new instances.
		
		// The '==' operator compares the references of the objects, but not the content.
		if (s1 == s2)
		// Both s1 & s2 have different memory address. hence they are not equal.	
			System.out.println("Equal");
		else
			System.out.println("Not equal");
	}

}
