package ex9_1;

import java.util.Hashtable;
import java.util.Scanner;

public class institut {

    static Scanner sc = new Scanner(System.in);
    static Hashtable<String, Persona> persones = new Hashtable<>();

    public static void main(String[] args) {
        int menu = 0;

        do {
            System.out.println("\n Crear Professor[1] \n Crear Alumne[2] \n Veure Dades[3] \n Sortir[4]");
            menu = sc.nextInt();
            sc.nextLine();
            switch(menu) {
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
        } while(menu != 4);
        System.out.println("Adeu");
    }

    private static void VeureDades() {
    	System.out.println("Llistat d'alumnes i professors:");
        for (Persona persona : persones.values()) {
            System.out.println(persona); 
            System.out.println("---------------------------------------------------------------");
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

        System.out.println("Escriu la matèria del professor");
        String nivellAssignatura = sc.nextLine();

        Professor professor = new Professor(nom, dni, edat, nivellAssignatura);
        persones.put(dni, professor);
    }

    public static void NouAlumne() {
        System.out.println("Escriu el nom de l'alumne");
        String nom = sc.nextLine();

        System.out.println("Escriu el dni de l'alumne");
        String dni = sc.nextLine();

        System.out.println("Escriu l'edat de l'alumne");
        int edat = sc.nextInt();
        sc.nextLine();

        System.out.println("Escriu el curs de l'alumne");
        String nivell = sc.nextLine();

        Alumne alumne = new Alumne(nom, dni, edat, nivell);
        persones.put(dni, alumne);
    }
}
