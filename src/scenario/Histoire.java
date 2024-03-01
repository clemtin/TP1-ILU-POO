package scenario;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Histoire {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Romain minus = new Romain("Minus", 8);
		Druide panoramix = new Druide("Panoramix", 1, 10);

		System.out.print(asterix);

		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		panoramix.preparerPotion();

	}
}
