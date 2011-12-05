/**
 * Iterator interface with the standard iterator operations.
 * 
 * @author Gruppe222
 * 
 * @param <T>
 *            type variable of the structure to iterate over.
 */
public interface Iter<T> {

	/**
	 * returns the next element in the iteration
	 * 
	 * @return
	 */
	public T next();

	/**
	 * returns true if the iteration has more elements
	 * 
	 * @return
	 */
	public boolean hasNext();

}
