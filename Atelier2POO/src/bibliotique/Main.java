package bibliotique;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Ouvrage> ouvrages = new ArrayList<Ouvrage>();
		ArrayList<Abonne> abonnes=new ArrayList<Abonne>();
		
		
		Bibliotique B1=new Bibliotique("titre1", "12/12/2020", false,ouvrages,abonnes);
		ouvrages.add(new Ouvrage("objet1","ddd",false));
		ouvrages.add(new Ouvrage("objet2","ddd",false));
		
		abonnes.add(new Abonne(1,"elmediouny",123));
		abonnes.add(new Abonne(2,"meriem",123));
		
		
		B1.ajoutOuvrage(new Ouvrage("objet1","ddd",false));
		B1.ajoutOuvrage(new Ouvrage("objet1","ddd",false));
		B1.ajoutOuvrage(new Ouvrage("objet1","ddd",false));
		System.out.println("ouvrages List : " +ouvrages);
		B1.afficher();
		
		
	}

}
