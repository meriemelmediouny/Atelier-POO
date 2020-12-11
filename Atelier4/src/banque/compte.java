package banque;

public class compte {
	protected int NumeroCompt;
	protected double solde;
	
	
	public compte(int Nm,double solde) {
		this.NumeroCompt=Nm;
		this.solde=solde;
	}
	


	public double ajouter(double souldeAjout) {
		
		 solde=+souldeAjout;
		 return solde;
		
	}
	
	public void retirer(double solderetire)
	{
		if(solderetire<=solde)
			System.out.println("le solde retirer est "+solderetire);
		else
			System.out.println("vous pouvez pas de retirer");
	}
	
	public void afficher() {
		System.out.println("les informations de votre compte est: le numero de compte est  "+NumeroCompt+" et votre solde "+solde);
	}

}
