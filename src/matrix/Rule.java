/**
 * 
 */
package matrix;

/**
 * @author aekh
 *
 */
interface Rule {
	
	/**
	 * 
	 * @param index index of the matrix.
	 * @param size Size of one column of the matrix.
	 * @return The number of this the element of index index should be mutated.
	 */
	public int getEffect(int index, int size);
	
}
