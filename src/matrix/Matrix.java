/**
 * 
 */
package matrix;
import java.util.ArrayList;

/**
 * @author aekh
 *
 */
final class Matrix<Element extends Component>{
	
	private int size;
	private ArrayList<ArrayList<Element>> matrix;
	
	/**
	 * 
	 * @param size Size of the matrix (size x size)
	 * @param e Element to init the matrix with.
	 */
	@SuppressWarnings("unchecked")
	public Matrix(int size, Class<? extends Component> c) {
		this.size = size;
		matrix = new ArrayList<ArrayList<Element>>();
		for (int i = 0; i < size; ++i) {
			ArrayList<Element> row = new ArrayList<Element>();
			for (int j = 0; j < size; ++j) {
				try {
					row.add((Element) c.newInstance());
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			matrix.add(row);
		}
	}

	/**
	 * 
	 * @param row
	 * @param column
	 * @return Element at row row and column column.
	 */
	public Element getElement(int row, int column) {
		row = safeBounds(row);
		column = safeBounds(column);
		
		return matrix.get(row).get(column);
	}
	
	/**
	 * 
	 * @param index Index of matrix starting at top-left
	 * @return Element at index index.
	 */
	public Element getElement(int index) {
		index = safeBounds(index, size*size);
		return getElement(index % size, index / size);
	}
	
	/**
	 * 
	 * @param row
	 * @param column
	 * @param e Element to set at row row and column column
	 */
	public void setElement(int row, int column, Element e) {
		row = safeBounds(row);
		column = safeBounds(column);
		
		matrix.get(row).set(column, e);
	}
	
	/**
	 * 
	 * @param index Index of matrix starting at top-left
	 * @param e Element to set at row row and column column
	 */
	public void setElement(int index, Element e) {
		index = safeBounds(index, size*size);
		setElement(index % size, index / size, e);
	}
	
	public void print() {
		for(ArrayList<Element> row : matrix) {
			for(Element e : row) {
				Component c = (Component) e;
				c.print();
				System.out.print("\t");
			}
			System.out.println();
		}
	}

    public void reflect(Axis axis) {

    }

    public void rotate() {

    }

	private int safeBounds(int index, int size) {
		if (index < 0) {index += size;}
		return index %= size;
	} private int safeBounds(int index) {
		return safeBounds(index, size);
	}
}
