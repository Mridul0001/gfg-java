/*Enumerations serve the purpose of representing a group of named constants 
 * in a programming language.
 * 
 * Mridul Mahajan*/
package edu.gfg.basics;

//we can define our own data types in java using enum
//enum can be declared either outside or inside class or we can even have main method inside enum

enum Color{
	//enum implicitly extends java.lang.enum class which is an abstract class
	//enums can have concrete and abstract methods however abstract method should be implemented by each instance of enum
	RED{
		void method1() {
			System.out.println("Red abstract");
		}
	},
	GREEN{
		void method1() {
			System.out.println("Green abstract");
		}
	}, BLUE{
		void method1() {
			System.out.println("Blue abstract");
		}
	};
	abstract void method1();
	void method2() {
		System.out.println("non abstract method");
	}
}
	//enum can have constructors as well but they can't invoked directly from outside
enum UserDataType{
	RED("Stop"), YELLOW, GREEN("GO");
		
	//default constructor
	UserDataType(){
		System.out.println("Default constructor");
	}
	//parameterized constructor
	UserDataType(String s){
		System.out.println(s);
	}
	//main method inside enum
	public static void main(String[] args) {
		Color c = Color.GREEN;
		c.method1();
		c.method2();
		Color c1[] = Color.values();
		for(Color c2:c1) {
			System.out.println(c2.ordinal());//ordinal method return index of the current constant
		}
		System.out.println(Color.valueOf("BLUE"));//valueOf method returns value of constant passed as string
	}
}
