package fr.delmaire.zoo.animal;

public class Animal {
	protected String nom;
	protected String race;
	protected int poids;
	protected int age;
	protected String couleur;
	protected boolean griffes;
	// privé sauf pour les classes qui héritent

	public Animal() {
		super();
	}

	public Animal(String nom, String race, int poids, int age, String couleur, boolean griffes) {
		super();
		this.nom = nom;
		this.race = race;
		this.poids = poids;
		this.age = age;
		this.couleur = couleur;
		this.griffes = griffes;
	}

	public void manger() {
		System.out.println("miam");
	}

	public void boire() {
		System.out.println("soif");
	}

	public void courir() {
		System.out.println("on fait la course");

	}

	public void dormir() {
		System.out.println("dodo");
	}

	public void jouer() {
		System.out.println("on joue");
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the race
	 */
	public String getRace() {
		return race;
	}

	/**
	 * @param race the race to set
	 */
	public void setRace(String race) {
		this.race = race;
	}

	/**
	 * @return the poids
	 */
	public int getPoids() {
		return poids;
	}

	/**
	 * @param poids the poids to set
	 */
	public void setPoids(int poids) {
		this.poids = poids;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the couleur
	 */
	public String getCouleur() {
		return couleur;
	}

	/**
	 * @param couleur the couleur to set
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	/**
	 * @return the griffes
	 */
	public boolean isGriffes() {
		return griffes;
	}

	/**
	 * @param griffes the griffes to set
	 */
	public void setGriffes(boolean griffes) {
		this.griffes = griffes;
	}

}
