

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map mapFabrics = new Map();
	/*
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
	*/	
		
		mapFabrics.add("1",new Fabrik("1"));
		mapFabrics.add("2",new Fabrik("2"));
		mapFabrics.add("3",new Fabrik("3"));
		mapFabrics.add("4", new Fabrik("4"));
		
		
		mapFabrics.printMap();
		
		mapFabrics.remove("3");

		mapFabrics.printMap();

		System.out.println(mapFabrics.getValueByKey("4"));
		
		
		//lstFabrics.remove(new Fabrik("3"));
		
	//	Iter iter = MapFabrics.iter();
		
//		while(iter.hasNext()){
//			
//			System.out.println(iter.next());
//		}
//		
		
		/*Robot rob = new CaterpillaRobot(1);
		rob.changeType(new Painter(4));
		tmp.addRobot(new CaterpillaRobot(1));
		*/
	}

}
