/**
 * Exception class
 * 
 * @author Gruppe222
 */
public class InvalidKeyException extends Exception {

	
	
	/**
	 * generated ID
	 */
	private static final long serialVersionUID = -692884190877829089L;

	/**
	 * Constructor gets the invalid value
	 * @param value the value causing the exception
	 */
	public InvalidKeyException(int key) {
		super("The key " + key + " does not exist in the map");
	}

}