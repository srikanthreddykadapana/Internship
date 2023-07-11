package com.flipRobo.assignment;

public class TryCatchFinally {

	public static void main(String args[]) {
		//The 'try' block is used to enclose a block of code where an exception may occur
		try {
			System.out.println("First statement of try block");
			//This is a valid arithmetic operation, hence no exception.
			int num = 45 / 3;
			System.out.println(num);
			//The following exception block is skipped
		} catch (Exception e) {
			System.out.println("FlipRobo caught Exception");
			//Irrespective of any exception the 'Finally' block will be executed
		} finally {
			System.out.println("finally block");
		}
		//The string in the syso statement will be printed.
		System.out.println("Main method");
	}

}

/* Output: First statement of try block
 *			15
 *			finally block
 *			Main method */ 	 
