
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Fabrik> lstFabrics = new List<Fabrik>();
		Fabrik tmp = new Fabrik("Steel");
		Robot rb = new CaterpillaRobot(1, 4);
		rb.use = new Welder(100);
		tmp.addRobot(rb);
		rb = new CaterpillaRobot(2, 18);
		rb.use = new Welder(50);
		tmp.addRobot(rb);
		rb = new SwivelArmRobot(3, 4, 10);
		rb.use = new Painter(90);
		tmp.addRobot(rb);
		rb = new SwivelArmRobot(6, 8, 4);
		rb.use = new Welder(40);
		tmp.addRobot(rb);
		
		tmp.calculateAverageOperationHoursOfAllandUsage();
		tmp.calculateAverageOperationHoursOfType();
		tmp.calculateAverageRotationsOfSwivelsAndOfAllUsages();
		tmp.calculateAverageMinAndMaxTempOfAllWelderAndOfAllTypes();
		tmp.calculateAverageDistanceOfAllCaterpillarAndUsage();
		
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
