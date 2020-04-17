/*Program to show use of shutdownhooks in JAVA
 * Mridul Mahajan*/
package edu.gfg.overview;

public class ShutDownHook {
public static void main(String[] args) {
	//adding shutdownhook 
	Runtime.getRuntime().addShutdownHook(new Thread() {
		@Override
		public void run() {
			System.out.println("Shutdown hook 1!");
		}
	});
	Runtime.getRuntime().addShutdownHook(new Thread() {
		//we can add more than one shutdownhook but their execution is not in order
		@Override
		public void run() {
			System.out.println("Shutdown hook 2!");
			Runtime.getRuntime().halt(0); //execution of shutdown hook can be forcefully stopped using halt() method
			System.out.println("This will never be executed");
		}
	});
	System.out.println("Main method");
}
}
