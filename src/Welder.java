/**
 * Class Welder extends the abstract class Usage.
 * 
 * @author Gruppe222
 */
public class Welder extends Usage {
	private int temperature;

	/**
	 * Standard constructor
	 * 
	 * @param t
	 *            the temperature as integer
	 */
	public Welder(int t) {
		this.temperature = t;
	}

	/**
	 * Getter for temperature
	 * 
	 * @return the temperature as integer
	 */
	public int getTemperature() {
		return this.temperature;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Welder:" + temperature;
	}

}
