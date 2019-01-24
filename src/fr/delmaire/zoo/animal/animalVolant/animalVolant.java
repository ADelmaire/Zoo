package fr.delmaire.zoo.animal.animalVolant;

import fr.delmaire.zoo.animal.animalSautant.AnimalQuipeutSauter;

public class animalVolant extends AnimalQuipeutSauter {

	protected int longueurAiles;

	public animalVolant() {
		super();
	}

	public animalVolant(int longueurAiles) {
		super();
		this.longueurAiles = longueurAiles;
	}

	public void voler() {
		System.out.println("flap flap");
	}

	/**
	 * @return the longueurAiles
	 */
	public int getLongueurAiles() {
		return longueurAiles;
	}

	/**
	 * @param longueurAiles the longueurAiles to set
	 */
	public void setLongueurAiles(int longueurAiles) {
		this.longueurAiles = longueurAiles;
	}

}
