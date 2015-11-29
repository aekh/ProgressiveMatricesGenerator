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
		main.run();
	}
	
	public void run() {
		ProgressiveMatrixHandler pmh = new ProgressiveMatrixHandler();
		pmh.generate();
		pmh.print();
	}
}
