package fr.delmaire.zoo;

import fr.delmaire.zoo.animal.Elephant;
import fr.delmaire.zoo.animal.animalNageant.Tortue;
import fr.delmaire.zoo.animal.animalSautant.Chat;
import fr.delmaire.zoo.animal.animalSautant.Cheval;
import fr.delmaire.zoo.animal.animalSautant.Chien;
import fr.delmaire.zoo.animal.animalVolant.Aigle;

public class Main {
	public static void main(String[] args) {
		Chien rex = new Chien("Rex", "Berger", 15, 12, "Jaune", true);

		System.out.println(rex.getRace());

		Chat tom = new Chat("Tom", "Birman", 8, 6, "Rouge", true);
		System.out.println(tom.getNom());

		Cheval ch = new Cheval("Cheval", "cheval de course", 120, 10, "blanc", false);

		ch.manger();
		ch.jouer();

		Elephant dumbo = new Elephant("Dumbo", "Elephant d'afrique", 500, 50, "gris", false);
		dumbo.dormir();
		rex.sauter();

		// en java impossible d'hériter de deux classes
		// pas d'héritage multiple

		Tortue george = new Tortue("George", "tortue de mer", 35, 98, "vert", false);
		george.nager();
		george.manger();

		Aigle grandAigle = new Aigle("Grand Aigle", "aigle", 48, 12, "blanc", false);

	}

}
