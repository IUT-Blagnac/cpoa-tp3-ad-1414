package application;

import createur.Pizzeria;
import createur.PizzeriaBrest;
import createur.PizzeriaStrasbourg;
import produit.Pizza;

public class PizzaTestDrive {
	public static void main(String[] args) {
		Pizzeria boutiqueBrest = new PizzeriaBrest();
	    Pizzeria boutiqueStrasbourg = new PizzeriaStrasbourg();

	    Pizza pizza = boutiqueBrest.commanderPizza("fromage");
	    System.out.println("JMB a commande une " + pizza.getNom() + "\n");

	    pizza = boutiqueStrasbourg.commanderPizza("fromage");
	    System.out.println("JMB a commande une " + pizza.getNom() + "\n");
	}
}
