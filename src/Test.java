
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Fabrik> lstFabrics = new List<Fabrik>();
		Fabrik tmp = new Fabrik("Steel");
		Robot rob = new CaterpillaRobot(1);
		rob.changeType(new Painter(4));
		tmp.addRobot(new CaterpillaRobot(1));
		
	}

}
