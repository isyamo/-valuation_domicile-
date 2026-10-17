package ma.ens.evaluation;

public class Location {

	private Client client;
	private Vehicule vehicule;
	private int nbJours;

	public Location(Client client, Vehicule vehicule, int nbJours) {

		this.client = client;
		this.vehicule = vehicule;
		this.nbJours = nbJours;
	}

	public double calculerMontant() {
		return this.vehicule.calculerCout(nbJours);
	}
	
	public void afficherRecapitulatif() {
		
		System.out.println(" \n <<<<<< Recapitulatif >>>>>>  ");
		
		System.out.println( "\n * Les informations  du client sont :  " + this.client);
		System.out.println("\n * Les informations du vehicule : "+this.vehicule);
		System.out.println("\n * La duree est  : " +this.nbJours+ " jrs ");
		System.out.println("\n * Le montant total est : " + this.calculerMontant()+ " DH ");
	}
}
