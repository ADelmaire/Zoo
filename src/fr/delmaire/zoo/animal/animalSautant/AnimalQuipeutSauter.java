package fr.delmaire.zoo.animal.animalSautant;

import fr.delmaire.zoo.animal.Animal;

public class AnimalQuipeutSauter extends Animal {

	public AnimalQuipeutSauter() {
		super();
	}

	public AnimalQuipeutSauter(String nom, String race, int poids, int age, String couleur, boolean griffes) {
		super(nom, race, poids, age, couleur, griffes);
	}

	public void sauter() {
		System.out.println("hop!");
	}

}
