

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map mapFabrics = new Map();
	
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
	
		/*
		 * add Fabrics to our map and look if they were really added
		 */
		System.out.println(tmp.getName()+" Fabrik added? " + mapFabrics.add(tmp.getName(), tmp));
		System.out.println("Bob"+" Fabrik added? " + mapFabrics.add("Bob",new Fabrik("Bob")));
		System.out.println("Water"+" Fabrik added? " + mapFabrics.add("Water",new Fabrik("Water")));
		System.out.println("Wood"+" Fabrik added? " + mapFabrics.add("Wood", new Fabrik("Wood")));
		/*
		 * this fabric is already contained in the map so it returns false and isn't added.
		 */
		System.out.println("Bob"+" Fabrik added? " + mapFabrics.add("Bob", new Fabrik("Bob")));
	
		System.out.println("----------current contained Fabrics-------------");
		mapFabrics.printMap();
		
		mapFabrics.removeByKey("Water");
		System.out.println("----------current contained Fabrics after Water fabric removed-------------");
		mapFabrics.printMap();

		/*
		 * get a fabric by key. returns null if the key isn't contained in the map
		 */
		System.out.println(mapFabrics.getValueByKey("4"));
		System.out.println(mapFabrics.contains("as"));
		
		
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
