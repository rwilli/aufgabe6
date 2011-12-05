public class CaterpillaRobot extends Robot {
	private float distance;

	public CaterpillaRobot(int nr) {
		super(nr);
	}

	public CaterpillaRobot(int nr, int hour) {
		super(nr, hour);
	}

	public float getDistance() {
		return this.distance;
	}

	public void increaseDistance() {
		this.distance++;
	}

	protected boolean uncheckedEqual(Robot r) {
		return ((CaterpillaRobot) r).distance == this.distance
				&& ((CaterpillaRobot) r).number == this.number
				&& ((CaterpillaRobot) r).operatingHours == this.operatingHours
				&& ((CaterpillaRobot) r).use == this.use;
	}
}
