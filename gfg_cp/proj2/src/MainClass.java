//MainClass in gfg_cp/proj2/src
public class MainClass{
   public static void main(String[] args){
	System.out.println("In main class");
	A a = new A();
	a.test();
   }
}

//use -cp during compilation and execution to include path of A class in proj1.
// javac -d ../classes -cp ../../proj1/classes MainClass.java
//change directory to classes using cd ../classes
// java -cp ../../proj1/classes: MainClass
