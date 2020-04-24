/*In JAVA, we have three categories of variables:
 * 1. Local
 * 2. Instance
 * 3. Static*/
package edu.gfg.basics;

public class Variable {
	int b = 2;   //instance variable are outside any method, constructor or block but inside class. Access specifier can be used with them
	static int c = 3; //static variables are declared using static keyword
	Variable(){
		int a = 1;
		System.out.println("Local Variable 'a': " + a);
	}
	public static void main(String[] args) {
		Variable v = new Variable();
		
		System.out.println("Instance Variable 'b': " + v.b);
		System.out.println("Static Variable 'c': " + Variable.c);
		
		/*Instance variable are created when a new object is made and destroyed when object destroys
		 * Static variables are class variables because no matter how objects are created they will be shared
		 * among all objects*/

	}
}
