package ma.ens.evaluation;

public class Main {
	public static void main(String[] args) {
		
		// Creation de 2 clients 
		Client c1 = new Client(1, "Dupont", "Adel");
		Client c2 = new Client(2, "Kartin", "Jean");

		// Création de deux voitures et une moto.
		Voiture v1 = new Voiture("67890-B-1","fiat 500" , 300, 5);
		Voiture v2 = new Voiture("54321-D-33","ford fiesta " , 400, 7);
		Moto m = new Moto("1234-A-6", "Yamaha", 150, 125);
		
		// Stocker les trois véhicules dans le  tableau
		Vehicule [] vehicule= new Vehicule[3];
				vehicule[0]=v1;
				vehicule[1]=v2;
				vehicule[2]=m;
				
		// Parcourir le tableau et afficher les détails de chaque véhicule.	
		for(Vehicule v :vehicule){
			
			v.afficherDetails();
		}
		
		// Création de  trois locations associant chacune un client à un véhicule
		Location l1=new Location(c1,v2,2);
		Location l2=new Location(c2,v1,3);
		Location l3=new Location(c2,m,6);
		
		// Stocker les trois locations dans le tableau 
		Location[] location = new Location[3];
			location[0]=l1;
			location[1]=l2;
			location[2]=l3;
			
		for( Location l: location) {
			
			l.afficherRecapitulatif();
		}
		
		double montantTotalLocation=0.0;
		
		for(Location l: location) {
			
			montantTotalLocation += l.calculerMontant();
		}
		
		System.out.println("\n <<<<<<<< Total >>>>>>>>");
		System.out.println("\n Le montant total de location est : " +montantTotalLocation);
		
	}

}
