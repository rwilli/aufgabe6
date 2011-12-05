
public abstract class Robot {
	protected final int number;
	protected int operatingHours;
	protected Usage use;
	
	protected Robot(int nr) {
		this.number = nr;
	}
	
	protected Robot(int nr, int hour) {
		this.number = nr;
		this.operatingHours = hour;
	}

	public int getOperatingHours() {
		return this.operatingHours;
	}
	
	public void increaseOperatingHours() {
		this.operatingHours++;
	}
	
	public void changeType(Usage u) {
		this.use = u;
	}

	/* (non-Javadoc)
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

	public final boolean equal (Robot that) {
		if (this.getClass() == that.getClass())
			return uncheckedEqual(that);
		return false;
	}
	
	protected abstract boolean uncheckedEqual(Robot r);
	
	
}
