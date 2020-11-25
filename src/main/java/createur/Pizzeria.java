package createur;
import produit.Pizza;

public abstract class Pizzeria {
	Pizza pizza;

	public abstract Pizza commanderPizza(String nomPizza);

	void preparer() {
		System.out.println("Préparation de " + this.pizza.getNom());
		System.out.println("Étalage de la pâte " + this.pizza.getPate());
		System.out.println("Ajout de la sauce " + this.pizza.getSauce());
		System.out.println("Ajout des garnitures: ");
		for (String garniture : this.pizza.getGarnitures()) {
			System.out.println(garniture);
		}
	}
}
