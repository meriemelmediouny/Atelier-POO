package heritage;

public class Test {

	public static void main(String[] args) {
		Secretaire S1=new Secretaire("elmediouny","meriem", "hayelamal", "youssoufia", 1996, 07);
		S1.toString();
		S1.modifiePersonne("massira", "safi");
		S1.ecrirePersonne();
		
		Enseignant E1=new Enseignant("ens1", "ensprenom", "hhhh", "fes", 1979, "physique");
		E1.toString();
		E1.modifiePersonne("quartier","casablanca");
		E1.ecrirePersonne();
		
		Etudiant et1=new Etudiant("et1","etPrenom", "hhkkk", "Marrekech", 1998, "developpement informatique");
		et1.modifiePersonne("nouveau", "berrechide");
		et1.ecrirePersonne();

	}

}
