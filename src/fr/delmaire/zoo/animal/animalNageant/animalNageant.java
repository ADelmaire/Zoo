package fr.delmaire.zoo.animal.animalNageant;

import fr.delmaire.zoo.animal.Animal;

public class animalNageant extends Animal {
// extends = "est un"
	public animalNageant() {
		super();
	}

	public animalNageant(String nom, String race, int poids, int age, String couleur, boolean griffes) {
		super(nom, race, poids, age, couleur, griffes);
	}

	public void nager() {
		System.out.println("plouf");
	}

}
