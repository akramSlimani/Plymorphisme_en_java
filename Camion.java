package exo2Partiel2022;

public class Camion extends Vehicule{

	public static final String type = " Fourgonnette ";
	private int charge;
	
	public Camion(String immatriculation, int poids) {
		super(immatriculation, 5);
		charge = poids;
	}

	public int vitesseMaximale() {
		if(charge <= 3) return 90;
		if(charge >3) return 80;
		return 110;
	}

	public int getCharge() {
		return charge;
	}

	public String getType() {
		return type;
	}
}
