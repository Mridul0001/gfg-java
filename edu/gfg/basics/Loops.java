/*Loops execute a piece of code repeatedly until a certain condition is met
 * 
 * Mridul Mahajan*/
package edu.gfg.basics;

public class Loops {
public static void main(String[] args) {
	//for loop
	System.out.println("For loop::");
	for(int i=1; i<=5; i++) {
		System.out.println(i);
	}
	
	//while loop
	int i=0;
	System.out.println("While loop::");
	while(i<=3) {  //i<=3 is stoping condition
		System.out.println(i);
		i++;  //incrementing i
	}
	
	//both for and while are also known as entry control loops
	
	//do while loop
	i=1;
	System.out.println("Do while loop::");
	do {
		System.out.println(i);
	}while(i<1);
	//in do while loop, code inside do block will be executed once no matter what
	//because condition is checked at end, that's why it is also called exit control loop
	
	//for-each loop was introduced in JAVA 5, which is used to iterate through collection or array
	int arr[] = {1,2,3};
	System.out.println("For-each loop::");
	for(int j:arr) {
		System.out.print(j+" ");
	}
	
	/*there are certain limitations to for-each loop
	 * - it can't traverse backwards
	 * - index based operations can not be performed*/
}
}
