/**
 * 
 */
package matrix;

/**
 * @author aekh
 *
 */
class RuleGeneric implements Rule {

	private Direction dir;
	
	/**
	 * 
	 * @param direction Direction of rule
	 */
	public RuleGeneric(Direction dir) {
		this.dir = dir;
	}
	
	public RuleGeneric() {
		this(Direction.Horizontal);
	}

	@Override
	public int getEffect(int index, int size) {
		if (Direction.Horizontal == dir) {
			return index % size;
		}
		if (Direction.Vertical == dir) {
			return index / size;
		}
		return 0;
	}
	
	/**
	 * @return the direction
	 */
	public Direction getDirection() {
		return dir;
	}

	/**
	 * @param direction the direction to set
	 */
	public void setDirection(Direction dir) {
		this.dir = dir;
	}

}
