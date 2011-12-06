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
	 * 
	 * @param nr
	 *            the number of the robot
	 */
	public SwivelArmRobot(int nr) {
		super(nr);
	}

	/**
	 * Alternative constructor, calls the super constructor
	 * 
	 * @param nr
	 *            the number of the robot
	 * @param hour
	 *            the operating hours
	 */
	public SwivelArmRobot(int nr, int hour) {
		super(nr, hour);
	}

	/**
	 * Alternative constructor, calls the super constructor for number and
	 * hours.
	 * 
	 * @param nr
	 *            the number of the robot
	 * @param hour
	 *            the operating hours
	 * @param rot
	 *            the rotations as integer
	 */
	public SwivelArmRobot(int nr, int hour, int rot) {
		super(nr, hour);
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
