package produit;

import java.util.ArrayList;

public abstract class Pizza {
	String nom;
	String pate;
	String sauce;
	ArrayList<String> garnitures = new ArrayList<String>();

	public String getNom() {
		return nom;
	}

	public String getPate() {
		return pate;
	}

	public String getSauce() {
		return sauce;
	}

	public ArrayList<String> getGarnitures() {
		return garnitures;
	}
}
