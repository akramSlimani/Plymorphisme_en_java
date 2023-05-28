package exo2Partiel2022;

public abstract class Vehicule {

	private String immatriculation;
	private int poids;
	
	public Vehicule(String immat, int p) {
		immatriculation = immat;
		poids = p;
	}
	
	public int getPoids() {
		return poids;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	
	public abstract int vitesseMaximale();
	public abstract int getCharge();
	public abstract String getType();
	
	public String toString() {
		return "- "  + getType() + " : (poids = " + getPoids() 
		+ ") (charge = " + getCharge() 
		+ ")(immatriculation = " + getImmatriculation() 
		+ ") (vitesse maximale = " + vitesseMaximale() + ")";
	}
}
