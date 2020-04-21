/*This program shows that JVM does not create object of the class containig main 
 *method
 *Mridul Mahajan*/
package edu.gfg.overview;
//we have declared the class abstract and we know that 
//object of abstract class can't be created
abstract public class Main { 
public static void main(String[] args) {
	System.out.println("Main method called without creating object");
}
}
