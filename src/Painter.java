/**
 * Class Painter extends the abstract class Usage
 * 
 * @author Gruppe222
 * 
 */
public class Painter extends Usage {
	private float paintVolume;

	/**
	 * Standard constructor
	 * 
	 * @param v
	 *            the paintVolume as float
	 */
	public Painter(float v) {
		this.paintVolume = v;
	}

	/**
	 * Getter for the paintVolume
	 * 
	 * @return the paintVolume as float
	 */
	public float getPaintVolume() {
		return this.paintVolume;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Painter:" + paintVolume;
	}

}
