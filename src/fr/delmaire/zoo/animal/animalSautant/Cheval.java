package fr.delmaire.zoo.animal.animalSautant;
public class Cheval extends AnimalQuipeutSauter {

	public Cheval() {
		super();
	}

	public Cheval(String nom, String race, int poids, int age, String couleur, boolean griffes) {
		super(nom, race, poids, age, couleur, griffes);
	}

	public void sauter() {
		System.out.println("hop");
	}

}
