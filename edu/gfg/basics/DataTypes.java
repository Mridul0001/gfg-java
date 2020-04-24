/*JAVA has two categories of data types:
 * 1. Primitive
 * 2. Non-primitive*/
package edu.gfg.basics;

public class DataTypes {
public static void main(String[] args) {
	//primitive data types
	byte b = Byte.MAX_VALUE;
	short s = Short.MAX_VALUE;
	int i = Integer.MAX_VALUE;
	long l = Long.MAX_VALUE;
	float f = Float.MAX_VALUE;
	double d = Double.MAX_VALUE;
	char c = 'c';
	boolean bl = false;
	System.out.println(b + "\n" +
			s + "\n" +
			i + "\n" +
			l + "\n" +
			f + "\n" +
			d + "\n" +
			c + "\n" +
			bl);
	
	//non-primitive or reference type
	String str = "Mridul";
	int arr[] = {1,2};
	System.out.println("\n" + str + "\n" + arr);
	
	//class and objects are also reference type
}
}
