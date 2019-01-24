package fr.delmaire.zoo.animal.animalSautant;
public class Chat extends AnimalQuipeutSauter {

	public Chat() {
		super();
	}

	public Chat(String nom, String race, int poids, int age, String couleur, boolean griffes) {
		super(nom, race, poids, age, couleur, griffes);
	}

	public void sauter() {
		System.out.println("hop");
	}

}
