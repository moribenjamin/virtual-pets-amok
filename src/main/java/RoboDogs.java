
public class RoboDogs extends Dogs implements Robotic  {
	
		protected int oilLevels;

	public RoboDogs(String name, String type, String description, int needsPetting,
			int boredom, int happiness, int overallHealth, boolean isWalking, int oilLevels) {
		super(name, type, description, needsPetting, boredom, happiness, overallHealth, isWalking);
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
