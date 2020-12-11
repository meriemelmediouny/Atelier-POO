package polymorphisme;

public class Test {
    public static void main(String[] args) {


    
        Employee Employe1 = new Employee("Employe1", "Employee1", "Casa", 1995, 6000);
        Employee Employe2 = new Employee("Employe2", "Employee2", "Casa", 1995, 6000);
        Employee Employe3 = new Employee("Employe3", "Employee3", "Casa", 1995, 6000);
        Employee Employe4 = new Employee("Employe1", "Employee4", "Casa", 1995, 6000);
        Employee Employe5 = new Employee("Employe1", "Employee5", "Casa", 1995, 6000);

   
        Chef Chef1 = new Chef("Chef1","Chef1", "Casa", 1993, 8000, "Securite");
        Chef Chef2 = new Chef("Chef2","Chef2", "Casa", 1993, 8000, "Technique");

    
        Directeur Directeur1 = new Directeur("Directeur1","Directeur1", "Casa", 1990, 10000, "Technique", "XML");


    //Output
        Directeur1.Afficher();



    }
}
