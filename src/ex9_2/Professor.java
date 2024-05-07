package ex9_2;

public class Professor extends Persona {
    String assignaturaDonada;

    public Professor() {}

    public Professor(String nom, String dni, int edat, String assignaturaDonada) {
        super(nom, dni, edat);
        this.assignaturaDonada = assignaturaDonada;
    }

    @Override
    public String toString() {
        return "Soc " + nom + ", el meu DNI és " + dni + ", i sóc professor de " + assignaturaDonada + " amb " + edat + " anys.";
    }
}
