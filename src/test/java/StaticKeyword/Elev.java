package StaticKeyword;

public class Elev {
//static = reprezinta o alta modalitate

    public String nume;
    public String prenume;
    public static String scoala="Mihai Eminescu";

    public Elev(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public void prezentare () {
        System.out.println("numele este " + nume);
        System.out.println("prenumele este " + prenume);
        System.out.println("scoala este " + scoala);
    }
}
