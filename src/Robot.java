/**
 * Abstract class Robot
 * 
 * @author Gruppe222
 */
public abstract class Robot {

	// static variable necessary to create unique robot IDs
	private static int count = 0;
	protected final int number;
	protected int operatingHours;
	protected Usage use;

	/**
	 * First constructor
	 */
	protected Robot() {
		this.number = ++count;
	}

	/**
	 * Alternative constructor
	 * 
	 * @param hour
	 *            operatingHours as integer
	 * @throws IllegalArgumentException
	 *             if hours is a negative value
	 */
	// hours >= 0
	protected Robot(int hour) throws IllegalArgumentException {

		if (hour < 0)
			throw new IllegalArgumentException(
					"Value has to be greater than or 0.");

		this.number = ++count;
		this.operatingHours = hour;
	}

	/**
	 * Getter for Operating hours
	 * 
	 * @return hours as integer
	 */
	public int getOperatingHours() {
		return this.operatingHours;
	}

	/**
	 * Increases the operating hours by 1.
	 */
	public void increaseOperatingHours() {
		this.operatingHours++;
	}

	/**
	 * Changes the usage type of the robot
	 * 
	 * @param u
	 *            new usage type
	 * @throws IllegalArgumentException
	 *             if u is null
	 */
	public void changeType(Usage u) throws IllegalArgumentException {
		if (u == null)
			throw new IllegalArgumentException("Usage type cannot be null");
		this.use = u;
	}

	/**
	 * Getter for the number
	 * 
	 * @return the number as integer
	 */
	public int getId() {
		return number;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		result = prime * result + operatingHours;
		return result;
	}

	/**
	 * equal method for two robots
	 * 
	 * @param that
	 *            the other robot
	 * @return true or false
	 */
	public final boolean equal(Robot that) {
		if (this.getClass() == that.getClass())
			return uncheckedEqual(that);
		return false;
	}

	/**
	 * Abstract method should be implemented in subtypes.
	 * 
	 * @param r
	 *            the other robot
	 * @return true or false
	 */
	protected abstract boolean uncheckedEqual(Robot r);

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Robot:" + number + ", operatingHours=" + operatingHours
				+ ", use=" + use;
	}

}
