package Exercice1;


public class Chien {
	
	String nom;
	public void aboyer() {
		System.out.println(nom+" dit wwaaaarf.  Je mange de la viande");
	}
	
	public void mange() {
		System.out.println(nom+" dit wwaaaarf.  Je mange de la viande");
	}


	public static void main(String[] args) {
		
			Chien Rex=new Chien();
			
			Rex.nom="Rex";
		    Rex.aboyer();
		    Rex.mange();
		    
		    
		    Chien Max=new Chien();
		    
		    Max.nom="Max";
		    Max.aboyer();
		    Max.mange();
		    
			
	}

}
