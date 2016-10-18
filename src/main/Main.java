/**
 * 
 */
package main;

import matrix.ProgressiveMatrixHandler;

/**
 * @author aekh
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Main main = new Main();
		for (int i = 0; i < 10; ++i) {
			main.run();
		}
	}
	
	public void run() {
		ProgressiveMatrixHandler pmh = new ProgressiveMatrixHandler();
		pmh.generate();
		pmh.print();
		System.out.println("---");
	}
}
