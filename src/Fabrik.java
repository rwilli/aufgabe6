/**
 * Class Fabrik
 * 
 * @author Gruppe222
 */
public class Fabrik {
	private final String name;
	private Map mapRobots = new Map();

	/**
	 * Standard constructor
	 * 
	 * @param name
	 *            the name of the Fabrik as string
	 */
	public Fabrik(String name) {
		this.name = name;
	}

	/**
	 * Getter for the name
	 * 
	 * @return the name as string
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Adds a robot to the factory
	 * 
	 * @param r
	 *            the robot to add
	 */
	public void addRobot(Robot r) {
		this.mapRobots.add(r.getId(), r);
	}

	/**
	 * Deletes a robot from the factory.
	 * 
	 * @param r
	 *            the robot to delete
	 */
	public void deleteRobot(int r) {
		this.mapRobots.removeByKey(r);
	}

	/**
	 * Getter for all robots of the factory
	 * 
	 * @return a Map containing all robots
	 */
	public Map getRobots() {
		return this.mapRobots;
	}

	/**
	 * Find a robot by key.
	 * 
	 * @param key
	 *            as integer
	 * @return a robot
	 */
	public Robot getRobotByKey(int key) {
		return (Robot) this.mapRobots.getValueByKey(key);
	}

	/**
	 * Changes the type of a robot
	 * 
	 * @param key
	 *            the key in the map as integer
	 * @param typ
	 *            the new type
	 */
	public void changeRobotType(int key, Usage typ) {
		Robot tmp = (Robot) this.mapRobots.getValueByKey(key);
		tmp.changeType(typ);
	}

	/**
	 * Calculates and prints the average operating hours of all robots and
	 * usages.
	 */
	public void calculateAverageOperationHoursOfAllandUsage() {
		Iter iter = this.mapRobots.iter();
		int operatingHoursAll = 0;
		int operatingHoursPainter = 0;
		int operatingHoursWelder = 0;
		int countPainter = 0;
		int countWelder = 0;

		while (iter.hasNext()) {
			Robot r = (Robot) iter.next();

			if (r.use instanceof Painter) {
				operatingHoursPainter += r.operatingHours;
				countPainter++;
			} else if (r.use instanceof Welder) {
				operatingHoursWelder += r.operatingHours;
				countWelder++;
			}
		}

		operatingHoursAll = operatingHoursPainter + operatingHoursWelder;

		// mapRobots.size() > 0 and countPainter > 0 and countWelder > 0
		if (this.mapRobots.size() != 0 && countPainter != 0 && countWelder != 0) {
			System.out.println("OperatingHours All Types: "
					+ (operatingHoursAll / this.mapRobots.size()));
			System.out.println("OperatingHours Painter: "
					+ (operatingHoursPainter / countPainter));
			System.out.println("OperatingHours Welder: "
					+ (operatingHoursWelder / countWelder));

		} else {
			System.out.println("Divide by 0 error.");
		}
	}

	/**
	 * Calculates and prints the average operatingHours by type
	 */
	public void calculateAverageOperationHoursOfType() {
		Iter iter = this.mapRobots.iter();
		int operatingHoursCaterpillaRobot = 0;
		int operatingHoursSwivelArmRobot = 0;
		int countCaterpillaRobot = 0;
		int countSwivelArmRobot = 0;

		while (iter.hasNext()) {
			Robot r = (Robot) iter.next();

			if (r instanceof CaterpillaRobot) {
				operatingHoursCaterpillaRobot += r.operatingHours;
				countCaterpillaRobot++;
			} else if (r instanceof SwivelArmRobot) {
				operatingHoursSwivelArmRobot += r.operatingHours;
				countSwivelArmRobot++;
			}
		}

		// countCaterpillaRobot > 0 and countSwivelArmRobot > 0
		if (countCaterpillaRobot != 0 && countSwivelArmRobot != 0) {
			System.out.println("OperatingHours CaterpillaRobot: "
					+ (operatingHoursCaterpillaRobot / countCaterpillaRobot));
			System.out.println("OperatingHours SwivelArmRobot: "
					+ (operatingHoursSwivelArmRobot / countSwivelArmRobot));
		} else {
			System.out.println("Divide by 0 error.");
		}
	}

	/**
	 * Calculates and prints the average rotations of SwivelArmRobots and all
	 * usages.
	 */
	public void calculateAverageRotationsOfSwivelsAndOfAllUsages() {
		Iter iter = this.mapRobots.iter();
		int rotationsAll = 0;
		int rotationsPainter = 0;
		int rotationsWelder = 0;
		int countPainter = 0;
		int countWelder = 0;

		while (iter.hasNext()) {
			Robot r = (Robot) iter.next();

			if (r instanceof SwivelArmRobot) {
				if (r.use instanceof Painter) {
					rotationsPainter += ((SwivelArmRobot) r).getRotations();
					countPainter++;
				} else if (r.use instanceof Welder) {
					rotationsWelder += ((SwivelArmRobot) r).getRotations();
					countWelder++;
				}
			}
		}

		rotationsAll = rotationsPainter + rotationsWelder;
		if (this.mapRobots.size() != 0 && countPainter != 0 && countWelder != 0) {
			System.out.println("Rotations All: "
					+ (rotationsAll / this.mapRobots.size()));
			System.out.println("Rotations Painter: "
					+ (rotationsPainter / countPainter));
			System.out.println("Rotations Welder: "
					+ (rotationsWelder / countWelder));
		} else {
			System.out.println("Divide by 0 error.");
		}
	}

	// TODO
	public void calculateAverageMinAndMaxTempOfAllWelderAndOfAllTypes() {

		/*
		 * Iter iter = this.mapRobots.iter(); int temperatureWelder = 0; int
		 * countWelder = 0;
		 * 
		 * while (iter.hasNext()) {
		 * 
		 * Robot r = (Robot) iter.next();
		 * 
		 * if (r instanceof SwivelArmRobot) { if (r.use instanceof Welder) {
		 * temperatureWelder += ((SwivelArmRobot) r). countWelder++; } } }
		 * 
		 * 
		 * 
		 * if (this.mapRobots.size() != 0) { } else {
		 * System.out.println("Divide by 0 error."); }
		 */
	}

	/**
	 * Calculates and prints the average distance of all CaterpillarRobots and
	 * usages.
	 * 
	 */
	public void calculateAverageDistanceOfAllCaterpillarAndUsage() {
		Iter iter = this.mapRobots.iter();
		float distanceAll = 0;
		float distancePainter = 0;
		float distanceWelder = 0;
		int countPainter = 0;
		int countWelder = 0;

		while (iter.hasNext()) {
			Robot r = (Robot) iter.next();

			if (r instanceof CaterpillaRobot) {
				if (r.use instanceof Painter) {
					distancePainter += ((CaterpillaRobot) r).getDistance();
					countPainter++;
				} else if (r.use instanceof Welder) {
					distanceWelder += ((CaterpillaRobot) r).getDistance();
					countWelder++;
				}
			}
		}

		distanceAll = distancePainter + distanceWelder;
		if (this.mapRobots.size() != 0 && countPainter != 0 && countWelder != 0) {
			System.out.println("Rotations All: "
					+ (distanceAll / this.mapRobots.size()));
			System.out.println("Rotations Painter: "
					+ (distancePainter / countPainter));
			System.out.println("Rotations Welder: "
					+ (distanceWelder / countWelder));
		} else {
			System.out.println("Divide by 0 error");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Fabrikname: " + name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fabrik other = (Fabrik) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
