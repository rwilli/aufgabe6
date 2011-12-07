/**
 * Class SwivelArmRobot extends the class Robot
 * 
 * @author Gruppe222
 * 
 */
public class SwivelArmRobot extends Robot {
	private int rotations;

	/**
	 * First Constructor, calls the super constructor
	 */
	public SwivelArmRobot() {
		super();
	}

	/**
	 * Alternative constructor, calls the super constructor
	 * 
	 * @param hour
	 *            the operating hours
	 */
	public SwivelArmRobot(int hour) {
		super(hour);
	}

	/**
	 * Alternative constructor, calls the super constructor for number and
	 * hours.
	 * 
	 * @param hour
	 *            the operating hours
	 * @param rot
	 *            the rotations as integer
	 * @throws IllegalArgumentException
	 *             if either of the values is < 0
	 */
	// hour >= 0
	// rot >= 0
	public SwivelArmRobot(int hour, int rot) throws IllegalArgumentException {
		super(hour);
		if (rot < 0)
			throw new IllegalArgumentException(
					"Value has to be greater than or 0.");
		this.rotations = rot;
	}

	/**
	 * Getter for the rotations
	 * 
	 * @return rotations as integer
	 */
	public int getRotations() {
		return this.rotations;
	}

	/**
	 * Increments the rotations by 1.
	 */
	public void increaseRotations() {
		this.rotations++;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Robot#uncheckedEqual(Robot)
	 */
	@Override
	protected boolean uncheckedEqual(Robot r) {
		return ((SwivelArmRobot) r).rotations == this.rotations
				&& ((CaterpillaRobot) r).number == this.number
				&& ((CaterpillaRobot) r).operatingHours == this.operatingHours
				&& ((CaterpillaRobot) r).use == this.use;
	}

}
