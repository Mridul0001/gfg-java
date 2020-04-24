//Mridul Mahajan
package edu.gfg.basics;

public class ScopeOfVariables {
	//Class level scope
	int a = 1;
	void methodA() {
		int a = 2;
		System.out.println("Class level scope 'a': " + this.a); // same name class variable are differentiated by this keyword from method variables
		System.out.println("Method level scope: " + a);
	}
	void methodB() {
		for(int a = 0/*Block level scope or loop variable*/; a<3; a++) {
			System.out.println(a);
		}
		//class variable a will be unaffected by the increment made in loop to 'a'
		System.out.println(a);
	}
public static void main(String[] args) {
	ScopeOfVariables sv = new ScopeOfVariables();
	sv.methodA();
	sv.methodB();
}
}
