/*When we want to restrict the types that can be used as type arguments, then we use 
 * bounded type parameters
 * 
 * Mridul Mahajan*/
package edu.gfg.basics;

//example of single bounded type parameter
class Bound<T extends A>{   //A type and all of A's child class types are accepted
	private T obj;
	Bound(T obj){
		this.obj = obj;
	}
	
	void display() {
		this.obj.methodDisplay();
	}
}
class A{
	void methodDisplay() {
		System.out.println("A class method");
	}
}
class B extends A{
	void methodDisplay() {
		System.out.println("B class method");
	}
}
public class BoundedType {
public static void main(String[] args) {
	Bound<A> b = new Bound<A>(new A());
	b.display();
	Bound<B> b1 = new Bound<B>(new B());
	b1.display();
}
}
