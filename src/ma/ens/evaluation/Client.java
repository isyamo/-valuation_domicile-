package ma.ens.evaluation;

public class Client {

	private int id;
	private String nom,prenom;

	

	public Client(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}



	@Override
	public String toString() {
		return " Client son id=" + id + ", nom=" + nom + ", prenom=" + prenom ;
	}
	
	
}
