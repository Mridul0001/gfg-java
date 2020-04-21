/*Let's see if we can have different class and file name
 * Mridul Mahajan*/
package edu.gfg.overview;

//public class Different {
//public static void main(String[] args) {
//	
//}

/*if you uncomment above lines of code than it will give error error
 * and ask you to change the name of class or rename the file*/

//but here's the catch, you can have different file name and class name by removing public
class Different{
	static {
		System.out.println("Static block executes before main method");
	}
	public static void main(String[] args) {
		System.out.println("Different class name");
	}
}

//and you can also have two classes with main method of its own
class MultiMain{
	public static void main(String[] args) {
		System.out.println("Another class with main method");
	}
}

//in this case java compiler will create two separate .class files 
//each with its own main method 

//but it is recommended to go with the conventional method
