package polymorphisme;

public class Employee extends Personne{

    int salaire;

//Constructor
    public Employee(String nom, String prenom, String ville, int dateDeNaissance, int salaire) {
        super(nom, prenom, ville, dateDeNaissance);
        this.salaire = salaire;
    }


    @Override
    public void Afficher() {
        super.Afficher();
        System.out.println("Salaire: " + salaire + "DH");
    }
}
