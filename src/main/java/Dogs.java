
public class Dogs extends VirtualPet {

	public Dogs(String name, String type, String description, int needsPetting, int boredom, int happiness,
			int overallHealth, boolean isWalking) {
		super(name, type, description, needsPetting, boredom, happiness, overallHealth);

	}

	public void walkDogs() {

		happiness += 2;
		overallHealth += 4;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
