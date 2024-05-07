package ex9_2;

import java.util.Hashtable;
import java.util.Scanner;

public class Institut {

    static Scanner sc = new Scanner(System.in);
    static Hashtable<String, Persona> personas = new Hashtable<>();

    public static void main(String[] args) {
        int menu = 0;

        do {
            System.out.println("\nCrear Professor[1]\nCrear Alumne[2]\nVeure Dades[3]\nSortir[4]");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    NouProfessor();
                    break;
                case 2:
                    NouAlumne();
                    break;
                case 3:
                    VeureDades();
                    break;
            }
        } while (menu != 4);
        System.out.println("Adeu");
    }

    private static void VeureDades() {
        for (Persona persona : personas.values()) {
            System.out.println(persona);
        }
    }

    public static void NouProfessor() {
        System.out.println("Escriu el nom del professor");
        String nom = sc.nextLine();

        System.out.println("Escriu el dni del professor");
        String dni = sc.nextLine();

        System.out.println("Escriu l'edat del professor");
        int edat = sc.nextInt();
        sc.nextLine();

        System.out.println("Escriu la materia del professor");
        String assignatura = sc.nextLine();

        Professor professor = new Professor(nom, dni, edat, assignatura);
        personas.put(dni, professor);
    }

    public static void NouAlumne() {
        System.out.println("Escriu el nom del Alumne");
        String nom = sc.nextLine();

        System.out.println("Escriu el dni del Alumne");
        String dni = sc.nextLine();

        System.out.println("Escriu l'edat del Alumne");
        int edat = sc.nextInt();
        sc.nextLine();
        System.out.println("Escriu el curs del Alumne");
        String nivelloassignatura = sc.nextLine();

        Alumne alumne = new Alumne(nom, dni, edat, nivelloassignatura);
        personas.put(dni, alumne);
    }
}
