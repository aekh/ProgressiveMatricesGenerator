/**
 * 
 */
package matrix;

import java.util.Random;

/**
 * @author aekh
 *
 */
public final class ProgressiveMatrixHandler {

	private ProgressiveMatrix progressiveMatrix;
	private Class<? extends Component> component;
    private Mutator mutator1;
    private Mutator mutator2;
	private Rule rule1;
	private Rule rule2;
	
	/**
	 * 
	 */
	public ProgressiveMatrixHandler() {
		component = Number.class;
		progressiveMatrix = new ProgressiveMatrix(component);

		Random ran = new Random();
        mutator1 = new Incrementor(ran.nextInt(9)+1);
        mutator2 = new Incrementor(ran.nextInt(9)+1);
		rule1 = new RuleGeneric(Axis.Horizontal);
		rule2 = new RuleGeneric(Axis.Vertical);
	}
	
	public void generate() {
        progressiveMatrix.mutate(mutator1, rule1);
		progressiveMatrix.mutate(mutator2, rule2);
	}
	
	public void print() {
		progressiveMatrix.print();
	}

}
