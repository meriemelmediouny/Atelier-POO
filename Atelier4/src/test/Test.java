package test;

import employe.Employe;

public class Test {

	public static void main(String[] args) {
		Employe employe1=new Employe("El alami","Mohammad","Casablanca",1963);
		employe1.afficherInfosClient();
		
		Employe employe2=new Employe("El wahabi","Khalid","Safi",1990);
		employe2.afficherInfosClient();
		
		
		Employe employe3=new Employe("Sbai","Fouad","Sal�",2006);
		employe3.afficherInfosClient();
	}

}
