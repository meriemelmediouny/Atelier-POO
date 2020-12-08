
public class testcompte {

	public static void main(String[] args) {
		  compte2 myObj = new compte2();
	        myObj.setNom("Karimi Khalid");

	        compte2 myObje = new compte2();
	        myObje.setAdresse("Safi");

	        compte2 myObjec = new compte2();
	        myObjec.setSolde( 14765.8 );
	        
	        System.out.println(myObj.getNom() +" habite à " + myObje.getAdresse()+" - infos solde "+myObjec.getSolde());
	        myObjec.retirer(150000);

	}



}
