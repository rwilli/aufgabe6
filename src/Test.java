/**
 * Test class
 * 
 * @author Gruppe222
 */

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Erstellen Sie eine Menge von Fabriken von jeweils einigen Robotern Ð
		 * wirklich eine Menge von Fabriken (eine Form von Collection), nicht
		 * nur eine Ansammlung einzelner Variablen. Jede Fabrik in der Menge
		 * soll Ÿber ihren eindeutigen Namen angesprochen werden kšnnen, und
		 * jeder Roboter einer Fabrik Ÿber seine eindeutige Nummer.
		 */
		Map mapFabrics = new Map();
		mapFabrics.add("Fabrik1", new Fabrik("Fabrik1"));
		mapFabrics.add("Fabrik2", new Fabrik("Fabrik2"));
		mapFabrics.add("Fabrik3", new Fabrik("Fabrik3"));
		mapFabrics.add("Fabrik4", new Fabrik("Fabrik4"));

		// Fabrik1
		Fabrik tmp = (Fabrik) mapFabrics.getValueByKey("Fabrik1");

		Robot rb = new CaterpillaRobot(4);
		rb.use = new Welder(100);

		tmp.addRobot(rb);

		rb = new CaterpillaRobot(18);
		rb.use = new Welder(50);
		tmp.addRobot(rb);

		rb = new SwivelArmRobot(4, 10);
		rb.use = new Painter(90);
		tmp.addRobot(rb);

		rb = new SwivelArmRobot(8, 4);
		rb.use = new Welder(40);
		tmp.addRobot(rb);

		// Fabrik2
		tmp = (Fabrik) mapFabrics.getValueByKey("Fabrik2");

		rb = new CaterpillaRobot(4);
		rb.use = new Welder(100);

		tmp.addRobot(rb);

		rb = new SwivelArmRobot(18, 16);
		rb.use = new Painter(50);
		tmp.addRobot(rb);

		rb = new SwivelArmRobot(4, 10);
		rb.use = new Painter(90);
		tmp.addRobot(rb);

		rb = new SwivelArmRobot(8, 4);
		rb.use = new Painter(40);
		tmp.addRobot(rb);

		// Fabrik3
		tmp = (Fabrik) mapFabrics.getValueByKey("Fabrik3");

		rb = new CaterpillaRobot(4);
		rb.use = new Welder(100);

		tmp.addRobot(rb);

		rb = new CaterpillaRobot(18);
		rb.use = new Painter(50);
		tmp.addRobot(rb);

		rb = new CaterpillaRobot(4);
		rb.use = new Painter(90);
		tmp.addRobot(rb);

		rb = new CaterpillaRobot(8);
		rb.use = new Welder(40);
		tmp.addRobot(rb);

		// Fabrik4
		tmp = (Fabrik) mapFabrics.getValueByKey("Fabrik4");

		rb = new SwivelArmRobot(4, 78);
		rb.use = new Welder(100);

		tmp.addRobot(rb);

		rb = new SwivelArmRobot(18, 45);
		rb.use = new Welder(50);
		tmp.addRobot(rb);

		rb = new SwivelArmRobot(4, 10);
		rb.use = new Painter(90);
		tmp.addRobot(rb);

		rb = new SwivelArmRobot(8, 4);
		rb.use = new Welder(40);
		tmp.addRobot(rb);

		/*
		 * get a fabric by key. returns null if the key isn't contained in the
		 * map
		 */
		Fabrik temp = (Fabrik) mapFabrics.getValueByKey("Fabrik1");
		System.out.println(temp);
		Iter iter = temp.getRobots().iter();

		/*
		 * print all Robots contained in the fabric
		 */
		while (iter.hasNext()) {
			Robot r = (Robot) iter.next();

			System.out.println(r);
		}

		temp = (Fabrik) mapFabrics.getValueByKey("Fabrik2");
		System.out.println(temp);
		iter = temp.getRobots().iter();
		/*
		 * print all Robots contained in the fabric
		 */
		while (iter.hasNext()) {
			Robot r = (Robot) iter.next();

			System.out.println(r);
		}

		temp = (Fabrik) mapFabrics.getValueByKey("Fabrik3");
		System.out.println(temp);
		iter = temp.getRobots().iter();
		/*
		 * print all Robots contained in the fabric
		 */
		while (iter.hasNext()) {
			Robot r = (Robot) iter.next();

			System.out.println(r);
		}

		temp = (Fabrik) mapFabrics.getValueByKey("Fabrik4");
		System.out.println(temp);
		iter = temp.getRobots().iter();
		/*
		 * print all Robots contained in the fabric
		 */
		while (iter.hasNext()) {
			Robot r = (Robot) iter.next();

			System.out.println(r);
		}

		/*
		 * FŸgen Sie zu einigen Fabriken einzelne Roboter hinzu, entfernen Sie
		 * einzelne Roboter, und Šndern Sie die Informationen zu einzelnen
		 * Robotern, wobei Sie Roboter und Fabriken nur Ÿber deren Nummern und
		 * Namen ansprechen.
		 */
		// increase robots operating hours from fabrik1
		temp = (Fabrik) mapFabrics.getValueByKey("Fabrik1");
		System.out.println();
		System.out.println("---Increas Robot«s operating hours from: " + temp
				+ "---");
		iter = temp.getRobots().iter();
		/*
		 * increase all roboter«s operating hours and print them
		 */
		while (iter.hasNext()) {
			Robot r = (Robot) iter.next();
			r.increaseOperatingHours();
			System.out.println(r);
		}

		/*
		 * Get one robot by key from all robots in the fabric
		 */
		System.out.println();
		System.out
				.println("---Get one robot by key from all robots in the fabric---");
		System.out.println(temp.getRobots().getValueByKey(1));

		/*
		 * remove robot 2 from fabric 1
		 */
		temp.deleteRobot(2);
		iter = temp.getRobots().iter();
		/*
		 * print fabric1 after robot 2 is removed
		 */
		System.out.println();
		System.out.println("---after robot2 from fabric 1 is removed---");
		while (iter.hasNext()) {
			Robot r = (Robot) iter.next();
			r.increaseOperatingHours();
			System.out.println(r);
		}

		/*
		 * Berechnen Sie die statistischen Werte aller Fabriken (wie oben
		 * beschrieben).
		 */
		System.out.println();
		System.out.println("---Calculate all relevant data---");
		tmp.calculateAverageOperationHoursOfAllandUsage();
		tmp.calculateAverageOperationHoursOfType();
		tmp.calculateAverageRotationsOfSwivelsAndOfAllUsages();
		tmp.calculateAverageMinAndMaxTempOfAllWelderAndOfAllTypes();
		tmp.calculateAverageDistanceOfAllCaterpillarAndUsage();

		/*
		 * add Fabrics to our map and look if they were really added Fabric4 is
		 * already in the map from before and Bob is added twice, so only the
		 * first is really added
		 */
		System.out.println();
		System.out
				.println("---Add fabrics to our map and look if they were really added---");
		System.out.println(tmp.getName() + " Fabrik added? "
				+ mapFabrics.add(tmp.getName(), tmp));
		System.out.println("Bob" + " Fabrik added? "
				+ mapFabrics.add("Bob", new Fabrik("Bob")));
		System.out.println("Water" + " Fabrik added? "
				+ mapFabrics.add("Water", new Fabrik("Water")));
		System.out.println("Wood" + " Fabrik added? "
				+ mapFabrics.add("Wood", new Fabrik("Wood")));
		System.out.println("Bob" + " Fabrik added? "
				+ mapFabrics.add("Bob", new Fabrik("Bob")));

		System.out.println();
		System.out.println("----------current contained Fabrics-------------");
		mapFabrics.printMap();

		mapFabrics.removeByKey("Water");
		System.out.println();
		System.out
				.println("----------current contained Fabrics after Water fabric removed-------------");
		mapFabrics.printMap();

		/*
		 * get a fabric by key. returns null if the key isn't contained in the
		 * map
		 */
		System.out.println();
		System.out
				.println("---get a fabric by key. returns null if the key isn't contained in the map---");
		System.out.println("Get fabric \"4\" by key:  "
				+ mapFabrics.getValueByKey("4"));
		System.out.println("Get fabric \"Fabrik4\" by key:  "
				+ mapFabrics.getValueByKey("Fabrik4"));

		/*
		 * use contains method from map and look if a fabric is in the map
		 */
		System.out.println();
		System.out.println("---look if a fabric is in the map with a key---");
		System.out.println("Is fabric as in the map? : "
				+ mapFabrics.contains("as"));
		System.out.println("Is fabric Bob in the map? : "
				+ mapFabrics.contains("Bob"));
		/*
		 * access a fabrik by key and change a roboter usage by key
		 */
		System.out.println();
		System.out.println("---Change from Fabrik1 Roboter1«s typ---");
		Fabrik fabric1 = (Fabrik) mapFabrics.getValueByKey("Fabrik1");
		System.out.println("Robot before change : " + fabric1.getRobotByKey(1));
		fabric1.changeRobotType(1, new Painter(20));
		System.out.println("Robot after change : " + fabric1.getRobotByKey(1));
	}

}
