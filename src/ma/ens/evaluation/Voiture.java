package ma.ens.evaluation;

public class Voiture extends Vehicule {

	private int nbPlaces;

	public Voiture(String immatriculation, String marque, double tarifJournalier, int nbPlaces) {
		super(immatriculation, marque, tarifJournalier);
		this.nbPlaces = nbPlaces;
	}

	@Override
	public double calculerCout(int nbJours) {
		if (this.nbPlaces <= 5) {
			return this.tarifJournalier * nbJours;

		} else {

			return (this.tarifJournalier + 50) * nbJours;
		}

	}

	@Override
	public void afficherDetails() {
		super.afficherDetails();
		System.out.println(" Caractéristique : " + this.nbPlaces + " places ");
	}

	
}
