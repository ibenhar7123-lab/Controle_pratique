package evaluation;

public class LivreurCamion extends Livreur {
	private double tauxMajoration ; 
	
	public LivreurCamion(String identifiant, String nom, double tarifKm) {
		super(identifiant, nom, tarifKm);
	
	}

	@Override
	public double calculerFrais(double distance) {
		 double MontantBase = tarifKm * distance ;
		 return MontantBase * (1+tauxMajoration);
	}


	

}
