import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;

public class VirtualPetShelterApp {

	static String selection;
	static String newName;
	static String newType;
	static String newDesc;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		VirtualPetShelter atTheShelter = new VirtualPetShelter();

		RoboCats spike = new RoboCats("Spike", "Robotic", "May have lost some screws", 22, 33, 12, 26, 18);
		RoboCats felix = new RoboCats("Felix", "Robotic", "Short circuits at times", 13, 20, 18, 14, 27);
		OrgoCats thom = new OrgoCats("Thom", "Organic", "Calm, cool, and collective", 12, 15, 22, 14, 33, 22, 18);
		OrgoCats pete = new OrgoCats("Pete", "Organic", "He is electrifying", 20, 31, 29, 18, 10, 23, 12);
		RoboDogs butch = new RoboDogs("Butch", "Robotic", "He is big on RAM", 23, 12, 19, 25, true, 10);
		RoboDogs trek = new RoboDogs("Trek", "Robotic", "He is electrifying", 14, 21, 26, 18, true, 21);
		OrgoDogs lady = new OrgoDogs("Lady", "Organic", "She's a man's gal", 22, 17, 31, 28, true, 10, 11, 29);
		OrgoDogs pappy = new OrgoDogs("Pappy", "Organic", "He can be bossy", 15, 26, 12, 13, true, 18, 14, 25);

		atTheShelter.admitPet(spike);
		atTheShelter.admitPet(felix);
		atTheShelter.admitPet(thom);
		atTheShelter.admitPet(pete);
		atTheShelter.admitPet(butch);
		atTheShelter.admitPet(trek);
		atTheShelter.admitPet(lady);
		atTheShelter.admitPet(pappy);

		System.out.println("Thank you for volunterring at Mori's Virtual Pet Shelter and Hair Salon!\n"
				+ "The only place were you can get a perm and a pooch to match!");

		petStatus(atTheShelter);

		listOptions();

		int choice = input.nextInt();

		do {

			if (choice == 1) {
				atTheShelter.feedAllOrgoPets();
				System.out.println("Ok, so you want to feed the organic pets.\n");
				atTheShelter.showOrganicPetStats();
				System.out.println("Thank you for feeding the organic pets.");
				petStatus(atTheShelter);
				listOptions();
				choice = input.nextInt();

			} else if (choice == 2) {
				atTheShelter.waterAllOrgoPets();
				System.out.println("Cool. So you'd like to water the pets.\n");
				atTheShelter.showOrganicPetStats();
				System.out.println("Thank you for watering the pets.");
				petStatus(atTheShelter);
				listOptions();
				choice = input.nextInt();

			} else if (choice == 3) {
				atTheShelter.oilAllRoboPets();
				System.out.println("Ok, so  you want to oil the robotic pets?\n");
				atTheShelter.showRoboticPetStats();
				System.out.println("Thank you for oiling the robotic pets.");
				petStatus(atTheShelter);
				listOptions();
				choice = input.nextInt();

			} else if (choice == 4) {
				atTheShelter.petAPet();
				System.out.println("Ok, so  you want to pet one of the pets?\t");
				for (VirtualPet current : atTheShelter.allThePets()) {
					System.out.println(
							"[" + current.getName() + "]" + current.getType() + "\t" + current.getDescription() + "\t");
				}
				System.out.println("Which one? Enter their name");
				selection = input.next();
				System.out.println("Ok, go ahead and pet " + selection);
				petStatus(atTheShelter);
				listOptions();
				choice = input.nextInt();

			} else if (choice == 5) {
				System.out.println("That's Great!\n");
				atTheShelter.showDogs();
				System.out.println("Thank you. I hope they didn't wear you out too much.");
				petStatus(atTheShelter);
				listOptions();
				choice = input.nextInt();

			} else if (choice == 6) {
				atTheShelter.emptyLitterBox();
				System.out.println("PeeeeU! Well, Ok.\n");
				atTheShelter.showLitterBoxCats();
				System.out.println("Thank you so much for doing tat.");
				petStatus(atTheShelter);
				listOptions();
				choice = input.nextInt();

			} else if (choice == 7) {
				atTheShelter.cleanCages();
				System.out.println("PuuuuuuE! You know...I don't know who's worse.");
				atTheShelter.showSoiledCages();
				System.out.println("Thank you again.");
				petStatus(atTheShelter);
				listOptions();
				choice = input.nextInt();

			} else if (choice == 8) {
				System.out.println("That's Great!\n");
				atTheShelter.showallPets();
				System.out.println("Which one?  Enter their name.");
				selection = input.next();
				atTheShelter.adoptPet(selection);
				System.out.println("I'm sure you will provide a wonderful home for " + selection + ".");
				petStatus(atTheShelter);
				listOptions();
				choice = input.nextInt();

			} else if (choice == 9) {
				System.out.println("Ok, so tell us a little about him/her.");
				System.out.print("What's their name?");
				newName = input.next();
				System.out.println("What type of pet is he/she?");
				System.out.println("Is it a:\n" + "RoboCat\n" + "\nRoboDog\n" + "OrgoCat\n" + "OrgoDog\n");
				System.out.println("The type here.");
				newType = input.next();
				System.out.println("What are they like?");
				newDesc = input.next();
				VirtualPet newPet = new VirtualPet(newName, newType, newDesc);
				atTheShelter.admitPet(newName, newType, newDesc);
				atTheShelter.showallPets();

				System.out.println("Thank you. We will try to place him/her in a good home");
				atTheShelter.tickAll();
				petStatus(atTheShelter);
				listOptions();
				choice = input.nextInt();

			} else if (choice == 10) {
				System.out.println("It's been a pleasure.");
				System.out.println("Thank you for your visit. Please come again soon.");
				break;
			} else {
				System.out.println("OH! COME ON!");
				System.out.println("THis is not a zoo!");
				break;
			}
		} while (choice != 10);
	}

	public static void petStatus(VirtualPetShelter shelterPets) {
		System.out.println("\nThis is the status of all the pets in our shelter:\n");
		System.out.println("Name    |Type   |Needs  |Boredom|Happy  |Health");
		System.out.println("        |       |Petting|       |       |      ");
		System.out.println("--------|-------|-------|-------|-------|-------");
		for (VirtualPet current : shelterPets.allThePets()) {
			System.out.println(current.getName() + "\t|" + current.getType() + "|" + current.getNeedsPetting() + "\t|"
					+ current.getBoredom() + "\t|" + current.getHappiness() + "\t|" + current.getOverallHealth());

		}
	}

	public static void listOptions() {
		System.out.println("\n1. Feed the organic pets");
		System.out.println("2. Water the organic pets");
		System.out.println("3. Oil the robotic pets");
		System.out.println("4. Pet a pet");
		System.out.println("5. Walk all the dogs");
		System.out.println("6. Clean the litter box ");
		System.out.println("7. Clean all the cages");
		System.out.println("8. Adopt one of these pets");
		System.out.println("9. Admit a pet");
		System.out.println("10. Quit");
		System.out.println("\nWhat would you like to do?");

	}

}
