/**
 * 
 */
package matrix;

/**
 * @author aekh
 *
 */
class Incrementor implements Mutator {
	
	private int increment;

	/**
	 * 
	 * @param increment Increment value
	 */
	public Incrementor(int increment) {
		this.increment = increment;
	}

	/**
	 * 
	 */
	public Incrementor() {
		this(1);
	}
	
	@Override
	public void mutate(Component component) {
		component.setSize(component.getSize() + increment);
	}

	@Override
	public void demutate(Component component) {
		component.setSize(component.getSize() - increment);
	}

}
