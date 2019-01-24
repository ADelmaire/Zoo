package fr.delmaire.zoo.animal.animalSautant;
public class Vache extends AnimalQuipeutSauter {

	public Vache() {
		super();
	}

	public Vache(String nom, String race, int poids, int age, String couleur, boolean griffes) {
		super(nom, race, poids, age, couleur, griffes);
	}

	public void sauter() {
		System.out.println("hop");
	}

}
