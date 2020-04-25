/*Java Generics supports multiple bounds also, i.e . In this case A can be an 
 * interface or class. If A is class then B and C should be interfaces. 
 * We can’t have more than one class in multiple bounds. 
 * 
 * Mridul Mahajan*/
package edu.gfg.basics;

//example of multiple bounds
class BoundM<T extends A1 & B1>{
	private T obj;
	BoundM(T obj){
		this.obj = obj;
	}
	void display() {
		obj.displayMethod();
	}
}
interface B1{
	void displayMethod();
}
class A1 implements B1{
	public void displayMethod() {
		System.out.println("Class A1 method");
	}
}
public class MultipleBound {
public static void main(String[] args) {
	BoundM<A1> b = new BoundM<A1>(new A1());
	b.display();
}
}
