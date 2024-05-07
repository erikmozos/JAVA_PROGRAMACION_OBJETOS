package ex9_1;

public abstract class Persona {
    String nom;
    String dni;
    int edat;

    public Persona() {}

    public Persona(String nom, String dni, int edat) {
        this.nom = nom;
        this.dni = dni;
        this.edat = edat;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", DNI: " + dni + ", Edat: " + edat;
    }
}
