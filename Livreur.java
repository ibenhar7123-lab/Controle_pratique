package evaluation;

public abstract class Livreur {
	protected static String identifiant ; 
	protected static String nom ;
	protected static double tarifKm  ;
	public Livreur responsable ;
	public Livreur(String identifiant, String nom, double tarifKm) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.tarifKm = tarifKm;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public String getNom() {
		return nom;
	} 
	
	public abstract double calculerFrais(double distance); 
	
	
	public static void afficherDetails() {
		System.out.println("Identifiant : " + identifiant
				+ "nom : " + nom 
				+ "tarifkm" + tarifKm + "DH"
				);
	}
	
	public void setResponsable(Livreur responsable) {
		this.responsable = responsable;
	}

	public Livreur getResponsable() {
		return responsable;
	}

	
	
}

