package heritage;

public class Etudiant extends Personne {
	String Diplome;

	public Etudiant(String n, String p, String adr, String v, int anneN,String Diplome) {
		super(n, p, adr, v, anneN);
		this.Diplome=Diplome;
	}
	
	public void ecrirePersonne() {
		System.out.println(nom+" "+prenom+" "+adresse+" "+ville+" "+anneNaissance+" "+Diplome);
		
	}
	
	@Override
	public String toString() {
		return "�tudiant [Diplome=" + Diplome + ", toString()=" + super.toString() + "]";
	}


}
