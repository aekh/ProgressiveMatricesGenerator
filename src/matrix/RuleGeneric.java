/**
 * 
 */
package matrix;

/**
 * @author aekh
 *
 */
class RuleGeneric implements Rule {

	private Axis dir;
	
	/**
	 * 
	 * @param direction Axis of rule
	 */
	public RuleGeneric(Axis dir) {
		this.dir = dir;
	}
	
	public RuleGeneric() {
		this(Axis.Horizontal);
	}

	@Override
	public int getEffect(int index, int size) {
		if (Axis.Horizontal == dir) {
			return index % size;
		}
		if (Axis.Vertical == dir) {
			return index / size;
		}
		return 0;
	}
	
	/**
	 * @return the direction
	 */
	public Axis getDirection() {
		return dir;
	}

	/**
	 * @param direction the direction to set
	 */
	public void setDirection(Axis dir) {
		this.dir = dir;
	}

}
