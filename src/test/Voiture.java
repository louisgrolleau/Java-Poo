package test;

public class Voiture {

	private String color;
	private int vitesseMax;
	private String forme;
	private String marque;
	private int distanceParcourue;
	
	public Voiture(String color, int vitesseMax, String forme, String marque, int distanceParcourue) {
		super();
		this.color = color;
		this.vitesseMax = vitesseMax;
		this.forme = forme;
		this.marque = marque;
		this.distanceParcourue = distanceParcourue;
	}

	public void avancer(){
		System.out.println(distanceParcourue+=10);
		
	}
	
	public void reculer(){
		System.out.println(distanceParcourue-=10);
		
	}
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVitesseMax() {
		return vitesseMax;
	}

	public void setVitesseMax(int vitesseMax) {
		this.vitesseMax = vitesseMax;
	}

	public String getForme() {
		return forme;
	}

	public void setForme(String forme) {
		this.forme = forme;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	
}
