package com.flipRobo.assignment;

public class StringBuilders {

	public static void main(String[] args) {
		//object s1 initializing with the string "Java".
		StringBuilder s1 = new StringBuilder("Java");
		// an immutable string is assigned to s2
		String s2 = "Love";
		// s2 value is appended to s1, but it is not stored in any other variable
		s1.append(s2);
		/* below statement prints the appended value "JavaLove" */
		//System.out.println(s1.append(s2));
		
		s1.substring(4);
		/* below statement prints the substring attached to the s1. 
		 * hence it prints "Love" */
		//System.out.println(s1.substring(4));
		
		int foundAt = s1.indexOf(s2);
		//it prints at which index the string s2 is found.
		System.out.println(foundAt);
	}

}
//Output is 4
