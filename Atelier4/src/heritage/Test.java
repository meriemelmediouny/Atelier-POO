package heritage;

public class Test {

    public static void main(String[] args) {
        Secretaire meriem = new Secretaire("meriem", "elmediouny",1996,"hay El amal","Youssoufia","15");
        meriem.modifiePersonne("ELmassira","Safi");
        System.out.println(meriem.getAdresse());
        System.out.println(meriem.getVille());

        System.out.println();

        System.out.println(meriem.toString());

        System.out.println(meriem.ecrirePersonne());
    }
}
