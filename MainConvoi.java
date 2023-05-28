package exo2Partiel2022;

public class MainConvoi {

	public static int vitesseMaxConvoi(Object[] convoi) throws VehiculeException{
		int mini = 130;
		Vehicule v;
		for (Object o : convoi)
			if (o instanceof Vehicule) {
				v = (Vehicule) o;
				if (v.vitesseMaximale() < mini)
					mini = ((Vehicule) v).vitesseMaximale();
			} else
				throw new VehiculeException("Ce n'est pas un véhicule");
		return mini;
	}
	
	public static void infoConvoi(Object[] convoi) throws VehiculeException {
		for (Object v : convoi)
			if (v instanceof Vehicule)
				System.out.println((Vehicule) v);
			else
				throw new VehiculeException("Ce n'est pas un véhicule");
		System.out.println("Vitesse max du convoi : " + vitesseMaxConvoi(convoi));
	}

	public static void main(String[] args) {
		Vehicule[] convoi1 = { new Camion("FA 122 FX", 3), new Camion("BA 622 JX", 1),
				new Fourgonnette("BV 563 GH", 0) };
		Electrique[] convoiElec = { new FourgonnetteElectrique("BQ 583 GH", 0),
				new FourgonnetteElectrique("AB 583 GH", 3), new FourgonnetteElectrique("HJ 583 GH", 2) };
		try {
			infoConvoi(convoi1);
			infoConvoi(convoiElec);
		} catch (VehiculeException e) {
			e.printStackTrace();
		}
	}

}
