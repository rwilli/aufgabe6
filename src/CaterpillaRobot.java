/**
 * Class CaterpillaRobot extends the class Robots
 * 
 * @author Gruppe222
 * 
 */
public class CaterpillaRobot extends Robot {
	private float distance;

	/**
	 * First constructor, calls the super constructors
	 */
	public CaterpillaRobot() {
		super();
	}

	/**
	 * Alternative constructor, calls the super constructor
	 * @param hour
	 *            the operating hours
	 */
	public CaterpillaRobot(int hour) {
		super(hour);
	}

	/**
	 * Getter for the distance
	 * 
	 * @return the distance as float
	 */
	public float getDistance() {
		return this.distance;
	}

	/**
	 * Increments the distance by 1.
	 */
	public void increaseDistance() {
		this.distance++;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Robot#uncheckedEqual(Robot)
	 */
	@Override
	protected boolean uncheckedEqual(Robot r) {
		return ((CaterpillaRobot) r).distance == this.distance
				&& ((CaterpillaRobot) r).number == this.number
				&& ((CaterpillaRobot) r).operatingHours == this.operatingHours
				&& ((CaterpillaRobot) r).use == this.use;
	}
}
