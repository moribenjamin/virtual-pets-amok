
public abstract class VirtualPet {

	// Instance Variables
	protected String name;
	protected String type;
	protected String description;
	protected int needsPetting;
	protected int boredom;
	protected int happiness;
	protected int overallHealth;

	// Constructor
	public VirtualPet(String name, String type, String description, int needsPetting, int boredom, int happiness,
			int overallHealth) {
		this.name = name;
		this.type = type;
		this.description = description;
		this.needsPetting = needsPetting;
		this.boredom = boredom;
		this.happiness = happiness;
		this.overallHealth = overallHealth;

	}

	public String getName() {
		return name;

	}

	public String getDescription() {
		return description;

	}

	public String getType() {
		return type;

	}

	public int getNeedsPetting() {
		return needsPetting;

	}

	public int getBoredom() {
		return boredom;

	}

	public int getHappiness() {
		return happiness;

	}

	public int getOverallHealth() {
		return overallHealth;

	}

	public void petAPet() {

		needsPetting -= 2;
		boredom += 3;
		overallHealth += 2;
		happiness = 1;
	}

	public void tick() {
		happiness += 2;
		overallHealth += 4;
	}

	@Override
	public String toString() {
		return name + "\t" + type + "\t" + description + "\t" + needsPetting + "\t" + boredom + "\t" + happiness + "\t"
				+ overallHealth;
	}

}
