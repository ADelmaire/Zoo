package fr.delmaire.zoo.animal.animalVolant;

import fr.delmaire.zoo.animal.animalSautant.AnimalQuipeutSauter;

public class animalVolant extends AnimalQuipeutSauter {

	protected int longueurAiles;

	public animalVolant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public animalVolant(String nom, String race, int poids, int age, String couleur, boolean griffes) {
		super(nom, race, poids, age, couleur, griffes);
		// TODO Auto-generated constructor stub
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
