package polymorphisme;

public class Chef extends Employee{

    String service;


//Constructor

    public Chef(String nom, String prenom, String ville, int dateDeNaissance, int salaire, String service) {
        super(nom, prenom, ville, dateDeNaissance, salaire);
        this.service = service;
    }




    @Override
    public void Afficher() {
        super.Afficher();
        System.out.println("Service: " + service);
    }
}
