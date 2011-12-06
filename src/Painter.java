
public class Painter extends Usage {
	private float paintVolume;

	public Painter(float v) {
		this.paintVolume = v;
	}
	
	public float getPaintVolume() {
		return this.paintVolume;
	}

	@Override
	public String toString() {
		return "Painter:" + paintVolume;
	}
	
}
