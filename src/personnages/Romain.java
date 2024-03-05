package personnages;

public class Romain {
	private String nom;
	private int force;
	private int nbEquipement = 0;
	private Equipement[] equipements = new Equipement[2];

	public Romain(String nom, int force) {
		if (force >= 0) {
			this.nom = nom;
			this.force = force;
		}
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

	// public void recevoirCoup(int forceCoup) {
	// force -= forceCoup;
	// if (force > 0) {
	// parler("Aïe");
	// } else {
	// parler("J'abandonne...");

	// assert force < this.force;
	// }
	// }

	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom.toString() + "s'envole sous la force du coup.");
		// TODO
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] == null) {
			} else {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
		return equipementEjecte;

	}

	private int calculResistanceEquipement(int forceCoup) {
		String texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement;) {
				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
				i++;
			}
			texte += resistanceEquipement + "!";

		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}

	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		// if (force > 0) {
		// parler("Aïe");
		// } else {
		// equipementEjecte = ejecterEquipement();
		// parler("J'abandonne...");
		// }
		if (force == 0) {
			parler("Aïe");
		} else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}
		// post condition la force a diminuée
		assert force < oldForce;
		return equipementEjecte;
	}

	public void donner(Equipement equipement, int a) {
		equipements[a] = equipement;
		nbEquipement++;
		System.out.println("Le soldat" + nom + "s'equipe d'un" + equipement + "!");

	}

	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 0:
			donner(equipement, 0);
			break;

		case 1:
			if (equipements[0] == equipement) {
				System.out.println(" Le soldat" + nom + " possède déjà un " + equipement + " !");
			} else {
				donner(equipement, 1);
			}
			break;

		case 2:
			System.out.println("Le soldat" + nom + " est desja bien protégé");
			break;

		default:
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

	public int getForce() {
		return this.force;
	}
}
