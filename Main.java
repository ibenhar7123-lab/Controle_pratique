package evaluation;

public class Main {
 public static void main(String[] args) {
	
		        
		      LivreurMoto moto1 = new LivreurMoto("3747","Karim",20);
		        LivreurMoto moto2 = new LivreurMoto("28383" , "Sara" , 48);
		        LivreurCamion camion1 = new LivreurCamion("38558", "Youssef", 2737);
		        LivreurCamion camion2 = new LivreurCamion("4747" , "Nadia" , 3747);

		      
		        Livreur[] livreurs = { moto1, moto2, camion1, camion2 };

		       
		        Commande cmd1 = new Commande("1", "Alami" );
		        Commande cmd2 = new Commande("2", "Benani");

		       
		        moto2.setResponsable(moto1);
		        camion1.setResponsable(moto1);
		        camion2.setResponsable(camion1);

		      
		        System.out.println("=== Livreurs ===");
		        for (Livreur l : livreurs) {
		            System.out.println(l);
		        }

		       
		        Livraison[] livraisons = new Livraison[livreurs.length];
		        for (int i = 0; i < livreurs.length; i++) {
		            Commande c = (i % 2 == 0) ? cmd1 : cmd2;
		            livraisons[i] = new Livraison(23, livreurs[i], c  );
		        }

		    
		        System.out.println("\n=== Récapitulatif des livraisons ===");
		        for (Livraison liv : livraisons) {
		            liv.afficherRecapitulatif();
		        }

		     
		        double total = 0;
		        for (Livraison liv : livraisons) {
		            total += liv.getMontantTotal();
		        }
		        System.out.printf("%nMontant total des livraisons : %.2f%n", total);

		    
		        int nbSupervises = 0;
		        for (Livreur l : livreurs) {
		            if (l.getResponsable() == moto1) {
		                nbSupervises++;
		            }
		        }
		        System.out.println("Nombre de livreurs directement supervisés par "
		                + moto1.getNom() + " : " + nbSupervises);
		    }
		
	 
	 
	 
	 
}

