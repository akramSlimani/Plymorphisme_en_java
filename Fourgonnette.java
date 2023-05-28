public class Fourgonnette extends Vehicule {

	public static final String type = " Fourgonnette ";
	private int charge;
	
	public Fourgonnette(String immatriculation, int poids) {
		super(immatriculation, 2);
		charge = poids;
	}

	public int vitesseMaximale() {
		if(charge != 0) return 100;
		else return 110;
	}

	public int getCharge() {
		return charge;
	}

	public String getType() {
		return " Fourgonnette ";
	}

}
