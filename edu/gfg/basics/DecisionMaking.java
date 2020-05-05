/*Decision making in programming is similar to decision making in real life
 * We use selection statements in JAVA, JAVA selection statements::
 * - if
 * - if-else
 * - nested-if
 * - if-else-if
 * - switch
 * - jump- break, continue, return*/
package edu.gfg.basics;

public class DecisionMaking {
public static void main(String[] args) {
	int i=1;
	//if statement
	if(i == 1) { //if true then execute following
		System.out.println("Inside if");
	}
	
	//if else
	if(i == 1)
		System.out.println("Inside if");
	else  //if false then execute following
		System.out.println("Inside else");
	
	//else if
	i = 2;
	if(i == 1)
		System.out.println("Inside if");
	else if(i == 2)  //check for another condition if previous is not true
		System.out.println("Inside elif");
	else
		System.out.println("Inside else");
	
	//nested if
	if(true) {
		if(i == 2)
			System.out.println("if inside another if");
	}else {
		System.out.println("Inside else");
	}
	
	//switch statement
	//from JAVA 7 onwards, switch can use Strings, enums and wrapper classes
	switch(i) {
	case 1:
		System.out.println(1);
		break;
	case 2:
		System.out.println(2);
		break;
	default:
		System.out.println("Default");
		break;
	/*break can be omitted but execution will continue until next break or default is found
	 * default is optional and can appear anywhere inside switch but if it is not 
	 * at the end then break needs to be used with it*/	
	}
	
	//jump statements
	System.out.println("Jump statements");
	label1: //goto is not used in java, instead we use jump statements with label(label name can be anything)
	{
		label2:{
			for(int j=0; j<5; j++) {
				if(j == 2)
					continue;  //continue will skip current iteration of loop
				else if(j == 4)
					break label2;  //control will be passed to statement after label2
				System.out.println(j);
			}
	}
	System.out.println("Inside label 1");
	}
}
}
