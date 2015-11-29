/**
 * 
 */
package matrix;

/**
 * @author aekh
 *
 */
final class Number extends Component {
	
	/**
	 * 
	 */
	public Number() {
		super(0);
	}
	
	public Number(Component c) {
		super(c);
	}
	
	@Override
	public void print() {
		System.out.print(size);
	}
}
