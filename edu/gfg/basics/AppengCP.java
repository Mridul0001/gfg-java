/*appendCodePoint() method of StringBuffer class appends the unicode representation
 * of the integer value passed as argument
 * 
 * Mridul Mahajan*/
package edu.gfg.basics;

public class AppengCP {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("Mridu");
	sb.appendCodePoint(108);  //appending 'l' to the stringbuffer with ascii code of l
	System.out.println(sb);
}
}
