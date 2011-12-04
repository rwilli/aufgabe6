
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Fabric> lstFabrics = new List<Fabric>();
		Fabric tmp = new Fabric("Steel");
		Robot rob = new CaterpillaRobot(1);
		rob.changeType(new Painter(4));
		tmp.addRobot(new CaterpillaRobot(1));
		
	}

}
