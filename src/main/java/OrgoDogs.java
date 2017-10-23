
public class OrgoDogs extends Dogs implements Organic {

	protected int hunger;
	protected int thirst;
	protected int wasteInCage;

	public OrgoDogs(String name, String type, String description, int needsPetting, int boredom, int happiness,
			int overallHealth, boolean isWalking, int hunger, int thirst, int wasteInCage) {
		super(name, type, description, needsPetting, boredom, happiness, overallHealth, isWalking);
		this.hunger = hunger;
		this.thirst = thirst;
		this.wasteInCage = wasteInCage;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getWasteInCage() {
		return wasteInCage;
	}

	public void cleanWasteInCage() {
		wasteInCage = 0;
	}

	public void tick() {
		hunger -= 2;
		thirst += 1;
		wasteInCage += 3;
		needsPetting -= 2;
		boredom += 2;
		overallHealth += 2;
		happiness = 1;
	}

	@Override
	public void feedOrgoPets() {
		hunger -= 2;
		thirst += 2;
		wasteInCage += 3;
		needsPetting -= 2;
		boredom += 2;
		overallHealth += 2;
		happiness = 1;
	}

	@Override
	public void waterOrgoPets() {
		hunger += 2;
		thirst -= 2;
		wasteInCage += 3;
		needsPetting -= 2;
		boredom += 2;
		overallHealth += 2;
		happiness = 1;
	}

	@Override
	public String toString() {
		return super.toString() + "\t" + hunger + "\t" + thirst + "\t" + wasteInCage;
	}
}
