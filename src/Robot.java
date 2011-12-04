
public abstract class Robot {
	protected final int number;
	protected int operatingHours;
	protected Usage use;
	
	protected Robot(int nr) {
		this.number = nr;
	}

	public int getOperatingHours() {
		return this.operatingHours;
	}
	
	public void setOperatingHours(int hours) {
		this.operatingHours = hours;
	}
	
	//TODO
	//public void changeType(RobotType tp)
}
