/*Program to show object creation by class loader
 * Mridul Mahajan*/
package edu.gfg.overview;
import java.lang.reflect.*;

public class Jvm {
	//class method and variables
	private int a;
	void classMethod() {}
public static void main(String[] args) {
	//Creating Jvm class objects
	Jvm j1 = new Jvm();
	Jvm j2 = new Jvm();
	//getting hold of Class object created by class loader
	Class c1 = j1.getClass();
	//displaying class level info
	System.out.println(c1.getName());
	Method m[] = c1.getDeclaredMethods();
	for(Method me : m) {
		System.out.println(me);
	}
	
	Field f[] = c1.getDeclaredFields();
	for(Field fi : f) {
		System.out.println(fi);
	}
	
	//only one object of class type is created for a single class file and stored in heap
	Class c2 = j2.getClass();
	System.out.println(c1==c2);
	
	//getting class loader name
	System.out.println(String.class.getClassLoader());
	System.out.println(Jvm.class.getClassLoader());
}
}
