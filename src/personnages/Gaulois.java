package personnages;

public class Gaulois {
public Gaulois(String name, int force, int effetPotion, int effetPoison, int effetFemme) {
		this.name = name;
		this.force = force;
		this.effetPotion = effetPotion;
		this.effetPoison = effetPoison;
		this.effetFemme = effetFemme;
	}
private String name;
private int force;
private int effetPotion = 1;
private int effetPoison = -1;
private int effetFemme = 1;



}
