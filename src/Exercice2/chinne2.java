package Exercice2;


public class chinne2 {
	
	
	String nom;
	void aboyer(String sens) {
		System.out.println(nom+" "+sens);
	}
	
	void mange(String qlqc ) {
		System.out.println(nom+" "+qlqc);
	}


	public static void main(String[] args) {
		
		chinne2 Rex=new chinne2();
		Rex.nom="Rex";
	    Rex.aboyer("Je suis en colère. Ghhhhhhhhhh !!! WWWWOARF !! WWWWOARF !! - Je mange de la viande");
	    Rex.mange("Je suis en colère. Ghhhhhhhhhh !!! WWWWOARF !! WWWWOARF !! - Je mange de la viande");
	    chinne2 Max=new chinne2();
		Max.nom="Max";
	    Max.aboyer("Je ne suis pas du tout en colère. Iwiw !! awaw !! - Je mange du poisson");
	    Max.mange("Je ne suis pas du tout en colère. Iwiw !! awaw !! - Je mange du poisson");
		
	}

}

