
public class RoboCats extends VirtualPet implements Robotic {

	protected int oilLevels;

	public RoboCats(String name, String type, String description, int needsPetting, int boredom, int happiness,
			int overallHealth, int oilLevels) {		
		super(name, type, description, needsPetting, boredom, happiness, overallHealth);
		this.oilLevels = oilLevels;
	}

	public int getOilLevels() {
		return oilLevels;
	}

	@Override
	public void oilRoboPets() {
		oilLevels += 5;

	}

	@Override
	public String toString() {
		return super.toString() + "\t" + oilLevels;

	}
}
