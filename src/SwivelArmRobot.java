
public class SwivelArmRobot extends Robot {
	private int rotations;

	public SwivelArmRobot(int nr) {
		super(nr);
	}
	
	public SwivelArmRobot(int nr, int hour) {
		super(nr, hour);
	}
	
	public SwivelArmRobot(int nr, int hour, int rot) {
		super(nr, hour);
		this.rotations = rot;
	}
	
	public int getRotations() {
		return this.rotations;
	}
	
	public void increaseRotations() {
		this.rotations++;
	}
	
}
