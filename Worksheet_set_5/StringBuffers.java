package com.flipRobo.assignment;

public class StringBuffers {

	public static void main(String args[]) {
		String s1 = "abc";
		String s2 = s1;
		/* a new char is assigned to s1 after s1 values are assigned to s2.
		  hence the content of s1 and s2 will not be equal*/
		s1 += "d";
		
		System.out.println(s1 + " " + s2 + " " + (s1 == s2));
		/* first s1 is appended with letter 'd'. s2 will remain same as "abc".
		 * in comparison of s1 == s2 it throws false because both s1 & s2 are
		 * referring to two different memory locations. The output will be 'abcd abc false' */
		
		// StringBuffer is a mutable class
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = sb1;
		
		/* here when ever a new char are appended, sb1 calls the object StringBuffer
		  and performs the action. Therefore the s2 values are automatically updated.*/
		sb1.append("d");
		
		System.out.println(sb1 + " " + sb2 + " " + (sb1 == sb2));
		/* The expression (sb1 == sb2) compares the references of sb1 and sb2. 
		 * In this case, it will print 'abcd abcd true' because sb1 and sb2 refer to the 
		 * same object in memory */
		 
	}

}

// Output
// abcd abc false
// abcd abcd true

