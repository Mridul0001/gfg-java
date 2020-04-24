/*Final variables are the variables declared using final keyword.
 * Final variables can only be initialized once either during declaration or later.
 * Blank final variable is the variable which is not initialized during declaration
 * 
 * Mridul Mahajan*/
package edu.gfg.basics;

public class FinalVar {
	final int i;  //blank final
	FinalVar(int a){   //blank final class variable can only be initialized through constructor
		this.i=a;
	}
	//if we are overloading constructor than we have to initialize blank final in all of them
	FinalVar(){
		this(10);  //passing value to parameterized constructor
	}
public static void main(String[] args) {
	FinalVar f = new FinalVar(20);
	System.out.println("Value of blank final variable 'i': " + f.i);
}
}
