/**
 * Abstract class Robot
 * 
 * @author Gruppe222
 */
public abstract class Robot {
	protected final int number;
	protected int operatingHours;
	protected Usage use;

	/**
	 * First constructor
	 * 
	 * @param nr
	 *            number as integer
	 */
	protected Robot(int nr) {
		this.number = nr;
	}

	/**
	 * Alternative constructor
	 * 
	 * @param nr
	 *            number as integer
	 * @param hour
	 *            operatingHours as integer
	 */
	protected Robot(int nr, int hour) {
		this.number = nr;
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
	 */
	public void changeType(Usage u) {
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
