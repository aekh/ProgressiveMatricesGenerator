/**
 * 
 */
package matrix;

/**
 * @author aekh
 *
 */
public final class ProgressiveMatrixHandler {

	private ProgressiveMatrix progressiveMatrix;
	private Class<? extends Component> component;
	private Mutator mutator;
	private Rule rule1;
	private Rule rule2;
	
	/**
	 * 
	 */
	public ProgressiveMatrixHandler() {
		component = Number.class;
		progressiveMatrix = new ProgressiveMatrix(component);
		mutator = new Incrementor();
		rule1 = new RuleGeneric(Direction.Horizontal);
		rule2 = new RuleGeneric(Direction.Vertical);
	}
	
	public void generate() {
		progressiveMatrix.mutate(mutator, rule1);
		progressiveMatrix.mutate(mutator, rule2);
	}
	
	public void print() {
		progressiveMatrix.print();
	}

}
