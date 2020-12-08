
public class compte {
	String nom;
	String Adresse;
	double sold;

	
	
	
	public  double  calculerInterer(double tauxInteret) {  //ex4 
		
		double SoldInteret=sold*tauxInteret;
		return SoldInteret;
		
	}
	
	public void  afficherInfosSolde () {
		System.out.println(nom+" habite à "+Adresse+" - infos solde "+sold+" DH"+" et intérêts "+calculerInterer(7));
	}

	public static void main(String[] args) {
	   
		compte client1=new compte();
		client1.nom="alami Hassan";
		client1.Adresse="Safi";
		client1.sold=14765.80;
		client1. afficherInfosSolde();
		
		compte client2=new compte();
		client2.nom="karim khalid";
		client2.Adresse="casablanca";
		client2.sold=7645;
		client2. afficherInfosSolde();
		
	}

}
