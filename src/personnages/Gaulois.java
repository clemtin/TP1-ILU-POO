package personnages;

public class Gaulois {

//attribut
	private String nom;
	private int effetPotion = 1;
	private int force;
	private int nb_trophees;
	private Equipement[] trophees = new Equipement[100];

//constructeur
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getnom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	// private String prendreParole() {
	// return "Le gaulois " + nom + " : ";

	// }

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";

	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] trophees = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++, nb_trophees++) {
			this.trophees[nb_trophees] = trophees[i];
		}
	}

//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
//		romain.recevoirCoup(force / 3);
//	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + "]";
	}

	public static void main(String[] args) {

	}

	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée.");
	}

}
