
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
	
}
