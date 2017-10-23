
public class OrgoCats extends VirtualPet implements Organic {

	protected int hunger;
	protected int thirst;
	protected int wasteInLitterBox;

	public OrgoCats(String name, String type, String description, int needsPetting, int boredom, int happiness,
			int overallHealth, int hunger, int thirst, int wasteInLitterBox) {
		super(name, type, description, needsPetting, boredom, happiness, overallHealth);
		this.hunger = hunger;
		this.thirst = thirst;
		this.wasteInLitterBox = wasteInLitterBox;

	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getWasteLitterBoxWaste() {
		return wasteInLitterBox;
	}

	public void emptyWasteInLitterBox() {
		wasteInLitterBox = 0;
	}

	public void tick() {
		hunger -= 2;
		thirst += 1;
		wasteInLitterBox += 3;
		needsPetting -= 2;
		overallHealth += 2;
		happiness = 1;

	}

	@Override
	public void feedOrgoPets() {
		hunger -= 2;
		thirst += 2;
		wasteInLitterBox += 3;

	}

	@Override
	public void waterOrgoPets() {
		hunger += 2;
		thirst -= 2;
		wasteInLitterBox += 2;

	}

	@Override
	public String toString() {
		return super.toString() + "\t" + hunger + "\t" + thirst + "\t" + wasteInLitterBox;
	}
}