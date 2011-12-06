
public class Welder extends Usage {
	private int temperature;
	
	public Welder(int t) {
		this.temperature = t;
	}
	
	public int getTemperature() {
		return this.temperature;
	}

	@Override
	public String toString() {
		return "Welder:" + temperature;
	}
	
}
