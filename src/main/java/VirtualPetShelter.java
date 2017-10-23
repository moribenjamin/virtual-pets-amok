
import java.util.*;

public class VirtualPetShelter {

	public int litterBox;

	private Map<String, VirtualPet> shelterPets = new HashMap<String, VirtualPet>();

	public Collection<VirtualPet> allThePets() {
		return shelterPets.values();
	}

	public int getSize() {
		return shelterPets.size();
	}

	// returns a specific VirtualPet object that matches the key supplied
	public VirtualPet getAPet(String name) {
		return shelterPets.get(name);
	}

	public void admitPet(VirtualPet newPet) {
		shelterPets.put(newPet.getName(), newPet);
	}

	public VirtualPet adoptPet(String name) {
		return shelterPets.remove(name);
	}

	public void feedAllOrgoPets() {
		for (VirtualPet current : allThePets()) {
			if (current instanceof Organic) {
				((Organic) current).feedOrgoPets();

			}
		}
	}

	public void waterAllOrgoPets() {
		for (VirtualPet current : allThePets()) {
			if (current instanceof Organic) {
				((Organic) current).waterOrgoPets();
			}
		}
	}

	public void oilAllRoboPets() {
		for (VirtualPet current : allThePets()) {
			if (current instanceof Robotic) {
				((Robotic) current).oilRoboPets();
			}
		}
	}

	public void petAPet() {
		for (VirtualPet aPet : allThePets()) {
			aPet.petAPet();
		}
	}

	public void walkAllDogs() {
		for (VirtualPet aDog : allThePets()) {
			((Dogs) aDog).walkDogs();
		}
	}

	public void emptyLitterBox() {
		for (VirtualPet current : allThePets()) {
			if (current instanceof OrgoCats) {
				((OrgoCats) current).emptyWasteInLitterBox();
			}

		}
	}

	public void cleanCages() {
		for (VirtualPet current : allThePets()) {
			if (current instanceof OrgoDogs) {
				((OrgoDogs) current).cleanWasteInCage();
			}
		}
	}

	public void tickAll() {
		for (VirtualPet current : allThePets()) {
			if (current instanceof OrgoCats) {
				((OrgoCats) current).tick();
			}
		}
	}

	public void showOrganicPetStats() {
		System.out.println("------------" + "\nOrganic Cats\n" + "------------");
		for (VirtualPet currentOrgoCats : shelterPets.values()) {
			if (currentOrgoCats instanceof OrgoCats) {
				System.out.println(currentOrgoCats);
			}
		}
		System.out.println("------------" + "\nOrganic Dogs\n" + "------------");
		for (VirtualPet currentOrgoDogs : shelterPets.values()) {
			if (currentOrgoDogs instanceof OrgoDogs) {
				System.out.println(currentOrgoDogs);

			}
		}
	}

	public void showRoboticPetStats() {
		System.out.println("------------" + "\nRobotic Cats\n" + "------------");
		for (VirtualPet currentRoboCats : shelterPets.values()) {
			if (currentRoboCats instanceof RoboCats) {
				System.out.println(currentRoboCats);
			}
		}
		System.out.println("------------" + "\nRobotic Dogs\n" + "------------");
		for (VirtualPet currentRoboDogs : shelterPets.values()) {
			if (currentRoboDogs instanceof RoboDogs) {
				System.out.println(currentRoboDogs);

			}
		}
	}

	public void showDogs() {
		System.out.println("------------" + "\nRobotic Dogs\n" + "------------");
		for (VirtualPet currentRoboDogs : shelterPets.values()) {
			if (currentRoboDogs instanceof RoboDogs) {
				System.out.println(currentRoboDogs);
			}
		}
		System.out.println("------------" + "\nOrganic Dogs\n" + "------------");
		for (VirtualPet currentOrgoDogs : shelterPets.values()) {
			if (currentOrgoDogs instanceof OrgoDogs) {
				System.out.println(currentOrgoDogs);

			}
		}
	}

	public void showLitterBoxCats() {
		System.out.println("------------" + "\nOrganic Cats\n" + "------------");
		for (VirtualPet currentOrgoCats : shelterPets.values()) {
			if (currentOrgoCats instanceof OrgoCats) {
				System.out.println(currentOrgoCats);
			}
		}
	}

	public void showSoiledCages() {
		System.out.println("------------" + "\nOrganic Dogs\n" + "------------");
		for (VirtualPet currentOrgoDogs : shelterPets.values()) {
			if (currentOrgoDogs instanceof OrgoDogs) {
				System.out.println(currentOrgoDogs);
			}
		}
	}

	public void showallPets() {
		System.out.println("------------" + "\nRobotic Cats\n" + "------------");
		for (VirtualPet currentRoboCats : shelterPets.values()) {
			if (currentRoboCats instanceof RoboCats) {
				System.out.println(currentRoboCats);
			}
		}
		System.out.println("------------" + "\nRobotic Dogs\n" + "------------");
		for (VirtualPet currentRoboDogs : shelterPets.values()) {
			if (currentRoboDogs instanceof RoboDogs) {
				System.out.println(currentRoboDogs);

			}
		}
		System.out.println("------------" + "\nRobotic Cats\n" + "------------");
		for (VirtualPet currentRoboCats : shelterPets.values()) {
			if (currentRoboCats instanceof RoboCats) {
				System.out.println(currentRoboCats);
			}
		}
		System.out.println("------------" + "\nRobotic Dogs\n" + "------------");
		for (VirtualPet currentRoboDogs : shelterPets.values()) {
			if (currentRoboDogs instanceof RoboDogs) {
				System.out.println(currentRoboDogs);
			}
		}
	}
}