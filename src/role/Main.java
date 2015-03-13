package role;

public class Main {
	
	public static void main(String[] args) {
		Arme marteau = new Arme("marteau", 110, 1);
		Arme jambon = new Arme ("jambon", 100, 2);
		Arme epee = new Arme("epee", 20, 5);
		
		Personnage bertrand = new Personnage("bertrand", 0, 500, jambon, 0);
		Personnage gitanEnerve = new Personnage("gitanEnerve", 0, 500, marteau, 0);
		
		combat(bertrand, gitanEnerve);
			regenPV(bertrand, gitanEnerve);
		combat(bertrand, gitanEnerve);
			regenPV(bertrand, gitanEnerve);
		combat(bertrand, gitanEnerve);
			regenPV(bertrand, gitanEnerve);
		combat(bertrand, gitanEnerve);
			regenPV(bertrand, gitanEnerve);
		combat(bertrand, gitanEnerve);
			regenPV(bertrand, gitanEnerve);
		combat(bertrand, gitanEnerve);
			regenPV(bertrand, gitanEnerve);
		combat(bertrand, gitanEnerve);
			regenPV(bertrand, gitanEnerve);
		combat(bertrand, gitanEnerve);
			regenPV(bertrand, gitanEnerve);	
		combat(bertrand, gitanEnerve);
			regenPV(bertrand, gitanEnerve);
		combat(bertrand, gitanEnerve);
			regenPV(bertrand, gitanEnerve);	
	}

	public static void regenPV(Personnage a, Personnage b){
		a.setPointDeVie(500);
		b.setPointDeVie(500);
	}
	
	public static void combat(Personnage attaquant, Personnage attaqué){
		while ("" != null){
			if (attaquant.getPointDeVie() <=0){
				System.out.println("Le personnage " + attaquant.getNom() + " est mort ! ");
				System.out.println("Le personnage " + attaqué.getNom() + " a gagné le combat ! ");
				attaqué.setExperience(attaqué.getExperience() + 10);
				System.out.println("Le personnage " + attaqué.getNom() + " à maintenant " + attaqué.getExperience() + " xp ! " );
				attaqué.setVictoire(attaqué.getVictoire() + 1 );
				System.out.println(" Victoires de " + attaqué.getNom() + " = " + attaqué.getVictoire());
				System.out.println(" Victoires de " + attaquant.getNom() + " = " + attaquant.getVictoire());
				break;
			}
			if (attaqué.getPointDeVie() <=0 ){
				System.out.println("Le personnage " + attaqué.getNom() + " est mort ! ");
				System.out.println("Le personnage " + attaquant.getNom() + " a gagné le combat ! ");
				attaquant.setExperience(attaquant.getExperience() + 10);
				System.out.println("Le personnage " + attaquant.getNom() + " à maintenant " + attaquant.getExperience() + " xp ! " );
				attaquant.setVictoire(attaquant.getVictoire() + 1 );
				System.out.println(" Victoires de " + attaquant.getNom() + " = " + attaquant.getVictoire());
				System.out.println(" Victoires de " + attaqué.getNom() + " = " + attaqué.getVictoire());					
				break;
			}
			else {
				if (attaquant.getArme().getVitesse() > attaqué.getArme().getVitesse()){
					while (attaquant.getPointDeVie() >= 1 && attaqué.getPointDeVie() >= 1){
						attaquant.attaque(attaqué);
						attaqué.attaque(attaquant);
					}
				}
				else {
					while (attaquant.getPointDeVie() >= 1 && attaqué.getPointDeVie() >= 1){
						attaqué.attaque(attaquant);						
						attaquant.attaque(attaqué);
					}
				}
			}
		}
	}	
}
