
public class Fabrik {
	@Override
	public String toString() {
		return "Fabrikname: "+name;
	}

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

	private final String name;
	private Map lstRobots = new Map();
	public Fabrik(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addRobot(Robot r) {
		//this.lstRobots.add(r);
	}
	
	public void deleteRobot(Robot r) {
		//this.lstRobots.remove(r);
	}
	
	public Robot getRobot(int nr) {
		return null;
	}
	
	public void changeRobotType() {
		
	}
	
	public void calculateAverageOperationHoursOfAllandUsage() {
		Iter<Robot> iter = this.lstRobots.iter();
		int operatingHoursAll = 0;
		int operatingHoursPainter = 0;
		int operatingHoursWelder = 0;
		int countPainter = 0;
		int countWelder = 0;
		
		while (iter.hasNext()) {
			Robot r = iter.next();
			
			if (r.use instanceof Painter) {
				operatingHoursPainter += r.operatingHours;
				countPainter++;
			} else if (r.use instanceof Welder) {
				operatingHoursWelder += r.operatingHours;
				countWelder++;
			}
		}
		
		operatingHoursAll = operatingHoursPainter + operatingHoursWelder;
		
		System.out.println("OperatingHours All Types: " + (operatingHoursAll/this.lstRobots.size()));
		System.out.println("OperatingHours Painter: " + (operatingHoursPainter/countPainter));
		System.out.println("OperatingHours Welder: " + (operatingHoursWelder/countWelder));
		
	}
	
	public void calculateAverageOperationHoursOfType() {
		Iter<Robot> iter = this.lstRobots.iter();
		int operatingHoursCaterpillaRobot = 0;
		int operatingHoursSwivelArmRobot = 0;
		int countCaterpillaRobot = 0;
		int countSwivelArmRobot = 0;
		
		while (iter.hasNext()) {
			Robot r = iter.next();
			
			if (r instanceof CaterpillaRobot) {
				operatingHoursCaterpillaRobot += r.operatingHours;
				countCaterpillaRobot++;
			} else if (r instanceof SwivelArmRobot) {
				operatingHoursSwivelArmRobot += r.operatingHours;
				countSwivelArmRobot++;
			}
		}
		
		System.out.println("OperatingHours CaterpillaRobot: " + (operatingHoursCaterpillaRobot/countCaterpillaRobot));
		System.out.println("OperatingHours SwivelArmRobot: " + (operatingHoursSwivelArmRobot/countSwivelArmRobot));
	}
	
	public void calculateAverageRotationsOfSwivelsAndOfAllUsages() {
		Iter<Robot> iter = this.lstRobots.iter();
		int rotationsAll = 0;
		int rotationsPainter = 0;
		int rotationsWelder = 0;
		int countPainter = 0;
		int countWelder = 0;
		
		while (iter.hasNext()) {
			Robot r = iter.next();
			
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
		System.out.println("Rotations All: " + (rotationsAll/this.lstRobots.size()));
		System.out.println("Rotations Painter: " + (rotationsPainter/countPainter));
		System.out.println("Rotations Welder: " + (rotationsWelder/countWelder));
	}
	
	public void calculateAverageMinAndMaxTempOfAllWelderAndOfAllTypes() {
		
	}
	
	public void calculateAverageDistanceOfAllCaterpillarAndUsage() {
		Iter<Robot> iter = this.lstRobots.iter();
		float distanceAll = 0;
		float distancePainter = 0;
		float distanceWelder = 0;
		int countPainter = 0;
		int countWelder = 0;
		
		while (iter.hasNext()) {
			Robot r = iter.next();
			
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
		System.out.println("Rotations All: " + (distanceAll/this.lstRobots.size()));
		System.out.println("Rotations Painter: " + (distancePainter/countPainter));
		System.out.println("Rotations Welder: " + (distanceWelder/countWelder));
	}

}
