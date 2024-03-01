package scenario;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Histoire {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Romain minus = new Romain("Minus", 6);
		Druide panoramix = new Druide("Panoramix", 1, 10);
		Gaulois obelix = new Gaulois("Obelix", 25);

		panoramix.parler("Bonjour, je suis le druide Panoramix et ma potion peut aller d'une force 5 à 10");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);

	}
}
