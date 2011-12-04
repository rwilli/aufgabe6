
public class SwivelArmRobot extends Robot {
	private int rotations;

	public SwivelArmRobot(int nr) {
		super(nr);
	}
	
	public int getRotations() {
		return this.rotations;
	}
	
	public void increaseRotations() {
		this.rotations++;
	}
	
}
