package test;

public class Main {

	public static void main(String[] args) {
		
		Voiture maVoiture = new Voiture("blue", 180, "ronde", "peugeot",0); 
		

		System.out.println(maVoiture.getColor());
		maVoiture.setColor("red");
		System.out.println(maVoiture.getColor());
		maVoiture.avancer();
		maVoiture.reculer();
		maVoiture.avancer();
		maVoiture.avancer();
	}

}
