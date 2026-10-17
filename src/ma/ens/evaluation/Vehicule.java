package ma.ens.evaluation;

public abstract class Vehicule {

	protected String immatriculation;
	protected String marque;
	protected double tarifJournalier;

	public Vehicule(String immatriculation, String marque, double tarifJournalier) {

		this.immatriculation = immatriculation;
		this.marque = marque;
		this.tarifJournalier = tarifJournalier;
	}

	public double getTarifJournalier() {
		return tarifJournalier;
	}

	public abstract double calculerCout(int nbJours);

	public void afficherDetails() {
		System.out.println("  <<<<<<<<<<<<<<   >>>>>>>>>>>>>>   ");
		
		System.out.println(" * L'immatriculation est  : " + immatriculation);
		System.out.println(" * La marque est : " + marque);
		System.out.println(" * Tarif/jour :  " + tarifJournalier);
		
		System.out.println("   <<<<<<<<<<<<<<   >>>>>>>>>>>>>>   ");
	}

	@Override
	public String toString() {
		return "Immatriculation = " + this.immatriculation + " , Marque=" +this.marque + ", TarifJournalier = "	+ this.tarifJournalier ;
	}
	
	
}
