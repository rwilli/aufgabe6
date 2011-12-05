
public class Fabrik {
	private final String name;
	private List<Robot> lstRobots = new List<Robot>();
	
	public Fabrik(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addRobot(Robot r) {
		this.lstRobots.add(r);
	}
	
	public void deleteRobot(Robot r) {
		this.lstRobots.remove(r);
	}
	
	public Robot getRobot(int nr) {
		return null;
	}
	
	public void changeRobotType() {
		
	}
	
	public void calculateAverageOperationHoursOfAllandTypes() {
		
	}
	
	public void calculateAverageOperationHoursOfType() {
		
	}
	
	public void calculateAverageRotationsOfSwivelsAndOfAllUsages() {
		
	}
	
	public void calculateAverageMinAndMaxTempOfAllWelderAndOfAllTypes() {
		
	}
	
	public void calculateAverageDistanceOfAllCaterpillarAndUsage() {
		
	}
	
	public void calculateAverageDistanceOfAllCaterpiallarAndTypes() {
		
	}

}
