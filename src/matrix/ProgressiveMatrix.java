/**
 * 
 */
package matrix;

/**
 * @author aekh
 *
 */
final class ProgressiveMatrix {

	private int size;
	private Matrix<Component> matrix;
	
	/**
	 * 
	 */
	public ProgressiveMatrix(Class<? extends Component> c) {
		this(c, 3);
	}
	
	/**
	 * 
	 * @param size the size of the matrix
	 */
	public ProgressiveMatrix(Class<? extends Component> c, int size) {
		this.size = size;
		matrix = new Matrix<Component>(size, c);
	}
	
	/**
	 * 
	 * @param m Mutator to mutate matrix with
	 * @param r Rule that mutator will follow
	 */
	public void mutate(Mutator m, Rule r) {
		for (int el = 0; el < size*size; ++el) {
			matrix.getElement(el).mutate(m, r.getEffect(el, size));
		}
	}

	/**
	 * 
	 * @param m Mutator to demutate matrix with
	 * @param r Rule that mutator will follow
	 */
	public void demutate(Mutator m, Rule r) {
		for (int el = 0; el < size*size; ++el) {
			matrix.getElement(el).demutate(m, r.getEffect(el, size));
		}
	}
	
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size of the matrix (size x size) to set.
	 */
	public void setSize(int size) {
		this.size = size;
	}
	
	public void print() {
		matrix.print();
	}

}
