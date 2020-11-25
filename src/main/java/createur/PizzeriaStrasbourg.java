package createur;

import produit.Pizza;
import produit.PizzaFromageStyleStrasbourg;

public class PizzeriaStrasbourg extends Pizzeria {

	@Override
	public Pizza commanderPizza(String nomPizza) {

		switch (nomPizza) {
		case "fromage":
			this.pizza = new PizzaFromageStyleStrasbourg();
			break;

		default:
			throw new IllegalArgumentException("Il n'existe pas de pizza de ce nom");
		}
		preparer();
		cuire();
		couper();
		emballer();
		return this.pizza;
	}

	private void cuire() {
		System.out.println("Cuisson 25 minutes à 180 degrés");
	}

	private void couper() {
		System.out.println("Découpage en parts carrées");
	}

	private void emballer() {
		System.out.println("Emballage dans une boîte officielle");
	}
}
