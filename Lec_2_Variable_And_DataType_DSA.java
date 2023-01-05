//Variables & Data Types
// 1. Variables A variable is a container (storage area) used to hold data. Each variable should be 
// given a unique name (identiﬁer).
// The value stored in a variable can be changed during program execution.
//Types of Variables in Java
// Local Variables
// Instance Variables
// Static Variables
//These variables are created when the block is entered, or the function is called and destroyed after exiting from the block or when the call returns from the function.
// The scope of these variables exists only within the block in which the variables are declared, i.e., we can access these variables only within that block. 
//
//2. Data Types Data types are declarations for variables. This determines the type and size of data associated with variables which is essential to know since different data types occupy different sizes of memory.
// There are 2 types of Data Types : - Primitive Data types : to store simple values - Non-Primitive Data types : to store complex values
// Primitive Data Types These are the data types of ﬁxed size.
//Non-Primitive Data Types These are of variable size & are usually declaredwith a ‘new’ keyword.
// Eg : String, Arrays
// String name = new String("Aman"); int[] marks = new int[3]; marks[0] = 97; marks[1] = 98; marks[2] = 95; 3. Constants A constant is a variable in Java which has a ﬁxed value i.e. it cannot be assigned a different value once assigned. 
// package com.company;
// import java.io.*;
// class GFG{
//     //Instance VAriable
// public String geek;
// public GFG(){
//     //Default conmstructor 
//     this.geek="Faizan";//Instance Variable 
// }

// public static void main(String[] args) {
// //Object Creation 
// GFG name =new GFG();
// System.out.println("Geek name is "+name.geek); 
    
// }}
/*package whatever //do not write package name here */
// Contributed by Shubham Jain
// import java.io.*;

class GFG {
	public static void main(String[] args)
	{
		int var = 10; // Declared a Local Variable
		// This variable is local to this main method only
		System.out.println("Local Variable: " + var);
	}
}
// /*package whatever //do not write package name here */

// import java.io.*;

// class GFG {

// public static String geek = "Shubham Jain";		 //Declared static variable

// 	public static void main (String[] args) {
		
// 	//geek variable can be accessed without object creation
// 	//Displaying O/P
// 	//GFG.geek --> using the static variable
// 		System.out.println("Geek Name is : "+GFG.geek);
// 	}
// }
