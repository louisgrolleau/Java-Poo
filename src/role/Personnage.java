package role;

public class Personnage {

	
	private String nom;
	private int experience;
	private int pointDeVie;
	private Arme arme;
	private int victoire;

		public Personnage(String nom, int experience, int pointDeVie, Arme arme, int victoire) {
			super();
			this.nom = nom;
			this.experience = experience;
			this.pointDeVie = pointDeVie;
			this.arme = arme;
			this.victoire = victoire;
		}
				
		public void attaque(Personnage cible){
			double doo = Math.random();	
			if (this.getExperience() < cible.getExperience()){
				if ( doo < 0.1 ){
					System.out.println(doo);
					System.out.println(" le personnage " + this.nom + " attaque la cible " + cible.getNom());
					System.out.println(this.nom + " inflige un COUP CRITIQUE de " + this.getArme().getDegat() * 2 + " dégats à " + cible.getNom());
					cible.setPointDeVie(cible.getPointDeVie()-this.getArme().getDegat() * 2);
					System.out.println(cible.getNom() + " n'a plus que " + cible.getPointDeVie() + " PV ! ");
				}
				else{
					System.out.println(" le personnage " + this.nom + " attaque la cible " + cible.getNom());
					System.out.println(this.nom + " inflige " + this.getArme().getDegat() + " dégats à " + cible.getNom());
					cible.setPointDeVie(cible.getPointDeVie()-this.getArme().getDegat());
					System.out.println(cible.getNom() + " n'a plus que " + cible.getPointDeVie() + " PV ! ");
				}
			}
			else{
				System.out.println(" le personnage " + this.nom + " attaque la cible " + cible.getNom());
				System.out.println(this.nom + " inflige " + this.getArme().getDegat() + " dégats à " + cible.getNom());
				cible.setPointDeVie(cible.getPointDeVie()-this.getArme().getDegat());
				System.out.println(cible.getNom() + " n'a plus que " + cible.getPointDeVie() + " PV ! ");
			}
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public int getExperience() {
			return experience;
		}

		public void setExperience(int experience) {
			this.experience = experience;
		}

		public int getPointDeVie() {
			return pointDeVie;
		}

		public void setPointDeVie(int pointDeVie) {
			this.pointDeVie = pointDeVie;
		}

		public Arme getArme() {
			return arme;
		}

		public void setArme(Arme arme) {
			this.arme = arme;
		}

		public int getVictoire() {
			return victoire;
		}

		public void setVictoire(int victoire) {
			this.victoire = victoire;
		}		
}
