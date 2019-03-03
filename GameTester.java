import java.util.Scanner;

public class GameTester {
	String[] Character = {"Magic User", "Fighter", "Thief", "Druid"};
	String[] Armor = {"Steel Plate", "Chain Mail", "Leather", "Robe"};
	String[] Weapon = {"Sword", "Short Sword", "Scimitar", "Dagger"};
	Scanner jarvis = new Scanner(System.in);
	
	public static void main(String[] args) {
		GameTester cc = new GameTester();
		String name = cc.getName();
		String character = cc.Character(name);
		String armor = cc.Armor(name, character);
		String weapon = cc.Weapon(name, character);
		System.out.println(cc.toString(name, character, armor, weapon));
		
		
	}
	public String getName() {
		System.out.println("What is your name");
		String name = jarvis.nextLine();
		return name;
	}
	public String Character(String name) {
		System.out.println(name + " please select the character you wish to play");
		for(int i =0; i< Character.length; i++) {
			System.out.println((i+1)+ " " + Character[i]);
		}
		int charac = jarvis.nextInt();
		if(!(charac == 1 || charac == 2 || charac == 3 || charac ==4)) {
			System.out.println("Invalid character choice.");
		}
		return Character[charac-1];
		
		
	}
	public String Armor(String name, String charac) {
		System.out.println(name + " please select the armor for your character");
		for(int i = 0; i < Armor.length; i++) {
			System.out.println((i+1) + ". " + Armor[i]);
		}
		int armor = jarvis.nextInt();
		if(charac.equals(Character[0])) {
			while(armor != 4) {
				System.out.println(name + " please select the armor for your character");
				for(int i = 0; i < Armor.length; i++) {
					System.out.println((i+1) + ". " + Armor[i]);
				}
				armor = jarvis.nextInt();
			}
			return Armor[armor -1];
		}
		else if(charac.equals(Character[1])) {
			return Armor[armor-1];
		}
		else if(charac.equals(Character[2])) {
			while(!(armor == 3 || armor == 4)) {
				System.out.println(name + " please select the armor for your character");
				for(int i = 0; i < Armor.length; i++) {
					System.out.println((i+1) + ". " + Armor[i]);
				}
				armor = jarvis.nextInt();
			}
			return Armor[armor -1];
		}
		else {
			while(!(armor == 2 || armor == 3 || armor == 4)) {
				System.out.println(name + " please select the armor for your character");
				for(int i = 0; i < Armor.length; i++) {
					System.out.println((i+1) + ". " + Armor[i]);
				}
				armor = jarvis.nextInt();
			}
			return Armor[armor -1];
		}
		
	}
	public String Weapon(String name, String charac) {
		if(charac.equals(Character[0])) {
			System.out.println(name + " please select the weapon for your character");
			for(int i =0; i < Weapon.length; i++) {
				System.out.println((i+1)+ ". "+ Weapon[i]);
			}
			int weapon = jarvis.nextInt();
			while(weapon != 4) {
				System.out.println(name + " please select the weapon for your character");
				for(int i =0; i < Weapon.length; i++) {
					System.out.println((i+1)+ ". "+ Weapon[i]);
				}
				weapon = jarvis.nextInt();
			}
			return Weapon[weapon-1];
		}
		else {
			System.out.println(name + " please select the weapon for your character");
			for(int i =0; i < Weapon.length; i++) {
				System.out.println((i+1)+ ". "+ Weapon[i]);
			}
			int weapon = jarvis.nextInt();
			return Weapon[weapon -1];
		}
	}
	public String toString(String name, String charac,String armor, String weap) {
		return name + ", thank you for using our character creator." + "\n" + "You have chosen to play as a " + charac + "\n" + "You will be wearing " + armor + " armor and using a " + weap;
	}
}
