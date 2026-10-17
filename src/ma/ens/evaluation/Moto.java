package ma.ens.evaluation;

public class Moto  extends Vehicule{
	
	private int cylindree;

	public Moto(String immatriculation, String marque, double tarifJournalier, int cylindree) {
		super(immatriculation, marque, tarifJournalier);
		this.cylindree = cylindree;
	}

	@Override
	public double calculerCout(int nbJours) {
		
		 double coutTotal = this.tarifJournalier;
		 
		 if (nbJours >=5 ) {
			 
			 return coutTotal*(1-0.1);
			 
		 }else {
			 
			 return coutTotal;
		 }
	}

	@Override
	public void afficherDetails() {
	
		super.afficherDetails();
		System.out.println(" Cylindree : "+ this.cylindree + " cm³ ");
	}
		
	
	}
	
	


