package role;
public class Arme {
	
	private String nom;
	private int degat;
	private int vitesse;



	public Arme(String nom, int degat, int vitesse) {
		super();
		this.nom = nom;
		this.degat = degat;
		this.vitesse = vitesse;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public int getDegat() {
		return degat;
	}



	public void setDegat(int degat) {
		this.degat = degat;
	}



	public int getVitesse() {
		return vitesse;
	}



	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	
}