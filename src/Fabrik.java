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
	public void addRobot(Robot r) throws IllegalArgumentException {
		if (r == null)
			throw new IllegalArgumentException(
					"null cannot be added to the map");
		this.mapRobots.add(r.getId(), r);
	}

	/**
	 * Deletes a robot from the factory.
	 * 
	 * @param r
	 *            the robot to delete
	 */
	public void deleteRobot(int r) throws IllegalArgumentException {
		if (r < 0)
			throw new IllegalArgumentException(
					"Key has to be greater than or 0.");
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
	 * @throws InvalidKeyException
	 *             if the key does not exist
	 */
	public Robot getRobotByKey(int key) throws InvalidKeyException {
		Robot r = (Robot) this.mapRobots.getValueByKey(key);
		if (r == null) {
			throw new InvalidKeyException(key);
		}
		return r;
	}

	/**
	 * Changes the type of a robot
	 * 
	 * @param key
	 *            the key in the map as integer
	 * @param typ
	 *            the new type
	 * @throws InvalidKeyException
	 *             if the key does not exist
	 */
	public void changeRobotType(int key, Usage typ) throws InvalidKeyException {
		Robot tmp = (Robot) this.mapRobots.getValueByKey(key);
		if (tmp == null)
			throw new InvalidKeyException(key);
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
			throw new IllegalArgumentException("Divide by 0 error");
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
			throw new IllegalArgumentException("Divide by 0 error");
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
			throw new IllegalArgumentException("Divide by 0 error");
		}
	}

	// TODO
	public void calculateMinAndMaxTempOfAllWelderAndOfAllTypes() {

		Iter iter = this.mapRobots.iter();
		int maxTemperatureWelderS = 0;
		int minTemperatureWelderS = 0;
		int maxTemperatureWelderC = 0;
		int minTemperatureWelderC = 0;

		while (iter.hasNext()) {

			Robot r = (Robot) iter.next();
			if (r instanceof SwivelArmRobot) {

				if (r.use instanceof Welder) {

					SwivelArmRobot s = (SwivelArmRobot) r;
					Welder w = (Welder) s.use;

					if (w.getTemperature() > maxTemperatureWelderS)
						maxTemperatureWelderS = w.getTemperature();
					if (w.getTemperature() < minTemperatureWelderS)
						minTemperatureWelderS = w.getTemperature();
				}
			} else if (r instanceof CaterpillaRobot) {

				if (r.use instanceof Welder) {

					SwivelArmRobot s = (SwivelArmRobot) r;
					Welder w = (Welder) s.use;

					if (w.getTemperature() > maxTemperatureWelderC)
						maxTemperatureWelderC = w.getTemperature();
					if (w.getTemperature() < minTemperatureWelderC)
						minTemperatureWelderC = w.getTemperature();
				}

			}

		}
		if (this.mapRobots.size() != 0) {

			if (minTemperatureWelderS < minTemperatureWelderC)
				System.out.println("MinTemp of all Welder: "
						+ minTemperatureWelderS);
			else
				System.out.println("MinTemp of all Welder:: "
						+ minTemperatureWelderC);
			if (maxTemperatureWelderS < maxTemperatureWelderC)
				System.out.println("MaxTemp of all Welder:: "
						+ maxTemperatureWelderC);
			else
				System.out.println("MaxTemp of all Welder: "
						+ maxTemperatureWelderS);

			System.out
					.println("MinTemp of SwivelArm: " + minTemperatureWelderS);
			System.out
					.println("MaxTemp of SwivelArm: " + maxTemperatureWelderS);
			System.out.println("MinTemp of Caterpilla: "
					+ minTemperatureWelderC);
			System.out.println("MaxTemp of Caterpilla: "
					+ maxTemperatureWelderC);

		} else {
			throw new IllegalArgumentException("Divide by 0 error");
		}
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
			System.out.println("Distance All: "
					+ (distanceAll / this.mapRobots.size()));
			System.out.println("Distance Painter: "
					+ (distancePainter / countPainter));
			System.out.println("Distance Welder: "
					+ (distanceWelder / countWelder));
		} else {
			throw new IllegalArgumentException("Divide by 0 error");
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
