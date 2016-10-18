/**
 * 
 */
package matrix;

/**
 * @author aekh
 *
 */
abstract class Component {
	
	protected int size;
	
	public Component(int size) {
		this.size = size;
	}
	
	public Component(Component c) {
		this.size = c.size;
	}

	/**
	 *
	 * @param m Mutator to mutate the component with.
	 */
	public final void mutate(Mutator m, int count) {
		for (int i = 0; i < count; ++i) {
			m.mutate(this);
		}
	}

	/**
	 *
	 * @param m Mutator to demutate the component with.
	 */
	public final void demutate(Mutator m, int count) {
		for (int i = 0; i < count; ++i) {
			m.demutate(this);
		}
	}
	
	public abstract void print();

	/**
	 * @return the size of the component
	 */
	public int getSize() { 
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
}
