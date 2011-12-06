

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * Erstellen Sie eine Menge von Fabriken von 
		 * jeweils einigen Robotern Ð wirklich eine Menge 
		 * von Fabriken (eine Form von Collection), nicht 
		 * nur eine Ansammlung einzelner Variablen. Jede 
		 * Fabrik in der Menge soll Ÿber ihren eindeutigen 
		 * Namen angesprochen werden kšnnen, und jeder 
		 * Roboter einer Fabrik Ÿber seine eindeutige Nummer. 
		 */
		Map mapFabrics = new Map();
		mapFabrics.add("Fabrik1", new Fabrik("Fabrik1"));
		mapFabrics.add("Fabrik2", new Fabrik("Fabrik2"));
		mapFabrics.add("Fabrik3", new Fabrik("Fabrik3"));
		mapFabrics.add("Fabrik4", new Fabrik("Fabrik4"));
		
		// Fabrik1
		Fabrik tmp = (Fabrik) mapFabrics.getValueByKey("Fabrik1");
		
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
		
		// Fabrik2
		tmp = (Fabrik) mapFabrics.getValueByKey("Fabrik2");
		
		rb = new CaterpillaRobot(1, 4);
		rb.use = new Welder(100);
		
		tmp.addRobot(rb);
		
		rb = new SwivelArmRobot(2, 18, 16);
		rb.use = new Painter(50);
		tmp.addRobot(rb);
		
		rb = new SwivelArmRobot(3, 4, 10);
		rb.use = new Painter(90);
		tmp.addRobot(rb);
		
		rb = new SwivelArmRobot(6, 8, 4);
		rb.use = new Painter(40);
		tmp.addRobot(rb);
		
		// Fabrik3
		tmp = (Fabrik) mapFabrics.getValueByKey("Fabrik3");

		rb = new CaterpillaRobot(1, 4);
		rb.use = new Welder(100);

		tmp.addRobot(rb);

		rb = new CaterpillaRobot(2, 18);
		rb.use = new Painter(50);
		tmp.addRobot(rb);

		rb = new CaterpillaRobot(3, 4);
		rb.use = new Painter(90);
		tmp.addRobot(rb);

		rb = new CaterpillaRobot(6, 8);
		rb.use = new Welder(40);
		tmp.addRobot(rb);

		// Fabrik4
		tmp = (Fabrik) mapFabrics.getValueByKey("Fabrik4");

		rb = new SwivelArmRobot(1, 4, 78);
		rb.use = new Welder(100);

		tmp.addRobot(rb);

		rb = new SwivelArmRobot(2, 18, 45);
		rb.use = new Welder(50);
		tmp.addRobot(rb);

		rb = new SwivelArmRobot(3, 4, 10);
		rb.use = new Painter(90);
		tmp.addRobot(rb);

		rb = new SwivelArmRobot(6, 8, 4);
		rb.use = new Welder(40);
		tmp.addRobot(rb);
		
		/*
		 * get a fabric by key. returns null if the key isn't contained in the map
		 */
		Fabrik temp = (Fabrik) mapFabrics.getValueByKey("Fabrik1");
		System.out.println(temp);
		Iter iter = temp.getRobots().iter();
		
		while (iter.hasNext()) {
			Robot r = (Robot) iter.next();
			
			System.out.println(r);
		}
		
		temp = (Fabrik) mapFabrics.getValueByKey("Fabrik2");
		System.out.println(temp);
		iter = temp.getRobots().iter();
		
		while (iter.hasNext()) {
			Robot r = (Robot) iter.next();
			
			System.out.println(r);
		}
		
		temp = (Fabrik) mapFabrics.getValueByKey("Fabrik3");
		System.out.println(temp);
		iter = temp.getRobots().iter();
		
		while (iter.hasNext()) {
			Robot r = (Robot) iter.next();
			
			System.out.println(r);
		}
		
		temp = (Fabrik) mapFabrics.getValueByKey("Fabrik4");
		System.out.println(temp);
		iter = temp.getRobots().iter();
		
		while (iter.hasNext()) {
			Robot r = (Robot) iter.next();
			
			System.out.println(r);
		}
		
		/*
		 * FŸgen Sie zu einigen Fabriken einzelne Roboter hinzu, 
		 * entfernen Sie einzelne Roboter, und Šndern Sie die 
		 * Informationen zu einzelnen Robotern, wobei Sie Roboter 
		 * und Fabriken nur Ÿber deren Nummern und Namen ansprechen. 
		 */
		// increase robots operating hours from fabrik1
		temp = (Fabrik) mapFabrics.getValueByKey("Fabrik1");
		System.out.println(temp);
		iter = temp.getRobots().iter();
		
		while (iter.hasNext()) {
			Robot r = (Robot) iter.next();
			r.increaseOperatingHours();
			System.out.println(r);
		}
		
		Map robotMap = temp.getRobots();
		System.out.println(robotMap.getValueByKey(1));
		
		// remove robots from fabrik1
		// TODO
		
		/*
		 * Berechnen Sie die statistischen Werte aller 
		 * Fabriken (wie oben beschrieben). 
		 */
		/*tmp.calculateAverageOperationHoursOfAllandUsage();
		tmp.calculateAverageOperationHoursOfType();
		tmp.calculateAverageRotationsOfSwivelsAndOfAllUsages();
		tmp.calculateAverageMinAndMaxTempOfAllWelderAndOfAllTypes();
		tmp.calculateAverageDistanceOfAllCaterpillarAndUsage();
		 */
		
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
		
	}

}
