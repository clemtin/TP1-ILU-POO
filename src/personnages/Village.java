package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] Villageois;
	private int nbrVillageois = 0;
	private int nbrVillageoisMaximum;

	public Village(String nom) {
		this.nom = nom;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public Village(String nom, int nbrVillageoisMaximum) {
		this.nbrVillageoisMaximum = nbrVillageoisMaximum;
		this.nom = nom;
		this.Villageois = new Gaulois[nbrVillageoisMaximum];
	}

	public void ajouterHabitant(Gaulois gaulois, int place) {
		nbrVillageoisMaximum = this.nbrVillageoisMaximum;
		if (this.nbrVillageois > nbrVillageoisMaximum) {
			System.out.println("Village plein");
		}
		Villageois[place] = gaulois;
		this.nbrVillageois += 1;
	}

	public Gaulois trouverHabitant(int place) {
		return Villageois[place];

	}

	public void afficherVillageois() {
		System.out.println("Dans le village du chef" + chef + " vivent les legendaires gaulois :");
		for (int i = 0; i < nbrVillageois; i++) {
			System.out.println(Villageois[i].getnom());
		}
	}

	public static void main(String[] args) {
		Village village = new Village("Villages des indestructibe", 30);
		// Gaulois gaulois = village.trouverHabitant(30);
		// Index 30 out of bounds for length 30
		Chef abra = new Chef("Abraracourcix", 6, village);
		village.setChef(abra);
		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterHabitant(asterix, 0);
//		Gaulois asterix = village.trouverHabitant(1);
//		System.out.println(gaulois);
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(obelix, 1);
		village.afficherVillageois();

	}
}
