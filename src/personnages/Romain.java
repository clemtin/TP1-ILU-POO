package personnages;

public class Romain {
	private String nom;
	private int force;
	private int nbEquipement = 0;
	private Equipement equipements[] = new Equipement[2];

	public Romain(String nom, int force) {
		assert force >= 0;
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");

			assert force < this.force;
		}
	}

	public void donner(Equipement equipement, int a) {
		equipements[a] = equipement;
		nbEquipement++;
		System.out.println("Le soldat" + nom + "s'equipe d'un" + equipement + "!");

	}

	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat" + nom + " est desja bien protégé");
			break;

		case 1:
			if (equipements[0] == equipement) {
				System.out.println(" Le soldat" + nom + " possède déjà un " + equipement + " !");
			} else {
				donner(equipement, 1);
			}
			break;

		case 0:
			donner(equipement, 0);
			break;
		}
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		System.out.println(minus.getNom());
		System.out.println(minus);
		minus.prendreParole();
		minus.parler("Yo");
		minus.recevoirCoup(5);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);

	}
}
