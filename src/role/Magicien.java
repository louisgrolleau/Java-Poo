package role;

public class Magicien extends Personnage{
	private int pointDeMagie;
	private int intelligence;

	public Magicien(String nom, int experience, int pointDeVie, Arme arme, int victoire, int pointDeMagie, int intelligence) {
		super(nom, experience, pointDeVie, arme, victoire);
		
		
		
	}

	public int getPointDeMagie() {
		return pointDeMagie;
	}

	public void setPointDeMagie(int pointDeMagie) {
		this.pointDeMagie = pointDeMagie;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

}
