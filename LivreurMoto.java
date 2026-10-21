package evaluation;

public class LivreurMoto extends Livreur {
	private int anciennete ;
	public LivreurMoto(String identifiant, String nom, double tarifKm) {
		super(identifiant, nom, tarifKm);
		
	}
	

	@Override
	public double calculerFrais(double distance) {
		if(anciennete < 3) {
		double cout = tarifKm  * distance ;
		return cout;
		}
		
		else {
		double cout =+ 2 * tarifKm ; 
		return cout;
		}
	
	}
}
