package com.flipRobo.assignment;

public class StaticBlock {

	static int num;
	static String mystr;
	// a constructor which sets the value of num = 100 & mystr = Constructor.
	StaticBlock()
	{
	num = 100;
	mystr = "Constructor";
	}
	
	// First Static block
	static
	{
	//The syso statement is printed on the console	
	System.out.println("Static Block 1");
	
	// below two changes are limited to this block only
	num = 68; // num value is updated
	mystr = "Block1"; // mystr value is updated
	}
	
	// Second static block
	static
	{
	// the syso statement is printed on the console	
	System.out.println("Static Block 2");
	
	// below two changes are limited to this block only
	num = 98; // num value again updated
	mystr = "Block2"; // mystr value is also updated
	}
	public static void main(String args[])
	{
	//a new instance is created for the constructor
	StaticBlock a = new StaticBlock();
	//The values of num and mystr are accessed fron the "StaticBlock"
	System.out.println("Value of num = " + a.num);
	System.out.println("Value of mystr = " + a.mystr);
	}

}

// Output: Static Block 1
//			Static Block 2
//			Value of num = 100
//			Value of mystr = Constructor
