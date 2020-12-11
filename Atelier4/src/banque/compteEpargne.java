package banque;

public class compteEpargne extends compte {
	int tauxInteret;

	public compteEpargne(int Nm, double solde,int taux) {
		super(Nm,solde);
		this.tauxInteret=taux;
	}
	
	public double CalculeInteret() {
		double SoldInteret=solde*tauxInteret/100;	
		return SoldInteret;
	}

}
