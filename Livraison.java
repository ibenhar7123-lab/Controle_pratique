package evaluation;

public class Livraison {
	private double distance;
	public Livreur livreur;
	public Commande commande;
	
	
	public Livraison(double distance, Livreur livreur, Commande commande) {
		this.distance = distance;
		this.livreur = livreur;
		this.commande = commande;
	}
		public double calculerMontant() {
			return distance;
			
		}
		 public void  afficherRecapitulatif() {
		    Livreur.afficherDetails();
		    System.out.println("Commande : "  );
		 }
		 public double getMontantTotal() {
			
			return 0;
		 }
		 
			
		 
	
}
