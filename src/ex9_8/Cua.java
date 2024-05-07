package ex9_8;
import java.util.LinkedList;
import java.util.Scanner;

public class Cua {
    private LinkedList<String> elements;

    public Cua() {
        this.elements = new LinkedList<>();
    }

    public void afegirPersona(String persona) {
        this.elements.addLast(persona);
    }

    public String treurePersona() {
        if (estaBuida()) {
            System.out.println("La cua està buida. No es pot treure cap persona.");
            return null;
        } else {
            return this.elements.removeFirst();
        }
    }

    public boolean estaBuida() {
        return this.elements.isEmpty();
    }

    public void mostrarCua() {
        if (estaBuida()) {
            System.out.println("La cua està buida.");
        } else {
            System.out.println("Cua de persones:");
            for (String persona : this.elements) {
                System.out.println(persona);
            }
        }
    }
    }