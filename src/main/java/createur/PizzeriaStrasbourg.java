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
		System.out.println("Cuisson 25 minutes a 180 degres");
	}

	private void couper() {
		System.out.println("Decoupage en parts carrees");
	}

	private void emballer() {
		System.out.println("Emballage dans une boite officielle");
	}
}
