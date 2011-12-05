
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Fabrik> lstFabrics = new List<Fabrik>();
		Fabrik tmp = new Fabrik("Steel");
		lstFabrics.add(new Fabrik("1"));
		lstFabrics.add(new Fabrik("2"));
		lstFabrics.add(new Fabrik("3"));
		lstFabrics.add(new Fabrik("4"));
		lstFabrics.remove(new Fabrik("3"));
		/*Robot rob = new CaterpillaRobot(1);
		rob.changeType(new Painter(4));
		tmp.addRobot(new CaterpillaRobot(1));
		*/
	}

}
