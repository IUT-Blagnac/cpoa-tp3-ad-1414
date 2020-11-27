import static org.junit.Assert.assertEquals;

import org.junit.Test;

import createur.Pizzeria;
import createur.PizzeriaBrest;
import createur.PizzeriaStrasbourg;
import produit.Pizza;

public class PizzaTest {
	
	@Test
    public void testPizzaBrest() {
		Pizzeria boutiqueBrest = new PizzeriaBrest();
		Pizza pizza = boutiqueBrest.commanderPizza("fromage");
		
		String expected = "Pizza sauce style Brest et fromage";
		assertEquals(expected, pizza.getNom());
    }
	
	@Test
    public void testPizzaStrasbourg() {
		Pizzeria boutiqueStrasbourg = new PizzeriaStrasbourg();
		Pizza pizza = boutiqueStrasbourg.commanderPizza("fromage");
		
		String expected = "Pizza pate Strasbourg et fromage";
		assertEquals(expected, pizza.getNom());
    }
	
	@Test
    public void testPateBrest() {
		Pizzeria boutiqueBrest = new PizzeriaBrest();
		Pizza pizza = boutiqueBrest.commanderPizza("fromage");
		
		String expected = "PateB";
		assertEquals(expected, pizza.getPate());
    }	
	
	@Test
    public void testPateStrasbourg() {
		Pizzeria boutiqueStrasbourg = new PizzeriaStrasbourg();
		Pizza pizza = boutiqueStrasbourg.commanderPizza("fromage");
		
		String expected = "PateS";
		assertEquals(expected, pizza.getPate());
    }
	
	@Test
    public void testSauceBrest() {
		Pizzeria boutiqueBrest = new PizzeriaBrest();
		Pizza pizza = boutiqueBrest.commanderPizza("fromage");
		
		String expected = "SauceB";
		assertEquals(expected, pizza.getSauce());
    }
	
	@Test
    public void testSauceStrasbourg() {
		Pizzeria boutiqueStrasbourg = new PizzeriaStrasbourg();
		Pizza pizza = boutiqueStrasbourg.commanderPizza("fromage");
		
		String expected = "SauceS";
		assertEquals(expected, pizza.getSauce());
    }
}