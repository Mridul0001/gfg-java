/*Can we use predefined class names as name of our class and variables?
 * Yes we can use predefined class names as variable and class names but
 * we can not use keywords as variable name, class names and not even folder or package
 * names.*/
package edu.gfg.overview;


//class named as Number class
class Number{
	int Number = 10;  //variable named Number
}
public class PredifinedAsNames {
public static void main(String[] args) {
	Number Number = new Number();  //reference variable named Number
	System.out.println(Number);
	System.out.println(Number.Number);
}
}

//however if you try to run following code, it will show error
//Comment above code before un-commenting  below code

//class String{}
//public class PredifinedAsNames {
//public static void main(String[] args) {
//	Number Number = new Number();  //reference variable named Number
//	System.out.println(Number);
//	System.out.println(Number.Number);
//}
//}

//This is because Main thread is looking for main method() with predefined String
//class array argument. But here, it got main method() with user defined 
//String class. We can give full path in main method of String class like:
//public static void main(java.lang.String[] args){} to resolve this




