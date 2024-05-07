package ex9_1;

public class Alumne extends Persona{
    String nivell;

    public Alumne() {}

    public Alumne(String nom, String dni, int edat,String nivell) {
        super(nom,dni,edat);
        this.nivell = nivell;
    }

    @Override
    public String toString() {
        return "Soc " + nom + ", el meu DNI és " + dni + ", i estic cursant " + nivell + " amb " + edat + " anys.";
    }
}
