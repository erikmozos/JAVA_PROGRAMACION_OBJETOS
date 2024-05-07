package ex9_11;

import java.util.*;

public class ex9_11 {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
	        HashMap<String, String> contactes = new HashMap<>();

	        int opcio = 0;
	        while (opcio != 4) {
	            System.out.println("\nMenú:");
	            System.out.println("1. Afegir un nou contacte");
	            System.out.println("2. Mostrar tots els contactes");
	            System.out.println("3. Buscar un contacte per nom");
	            System.out.println("4. Sortir");
	            System.out.print("Selecciona una opció: ");
	            opcio = scanner.nextInt();
	            scanner.nextLine(); // Consumir el salt de línia

	            switch (opcio) {
	                case 1:
	                    afegirContacte(scanner, contactes);
	                    break;
	                case 2:
	                    mostrarContactes(contactes);
	                    break;
	                case 3:
	                    cercarContacte(scanner, contactes);
	                    break;
	                case 4:
	                    System.out.println("Adéu!");
	                    break;
	                default:
	                    System.out.println("Opció no vàlida.");
	                    break;
	            }
	        }
	    }

	    private static void mostrarContactes(HashMap<String, String> contactes) {
	        if (contactes.isEmpty()) {
	            System.out.println("No hi ha cap contacte emmagatzemat.");
	        } else {
	            System.out.println("Contactes:");
	            for (Map.Entry<String, String> entry : contactes.entrySet()) {
	                System.out.println(entry.getKey() + ": " + entry.getValue());
	            }
	        }
	    }

	    private static void afegirContacte(Scanner scanner, HashMap<String, String> contactes) {
	        System.out.print("Introdueix el nom del contacte: ");
	        String nom = scanner.nextLine();
	        System.out.print("Introdueix el número de telèfon: ");
	        String telefon = scanner.nextLine();
	        contactes.put(nom, telefon);
	        System.out.println("Contacte afegit amb èxit.");
	    }

	    private static void cercarContacte(Scanner scanner, HashMap<String, String> contactes) {
	        System.out.print("Introdueix el nom del contacte a buscar: ");
	        String nom = scanner.nextLine();
	        String telefon = contactes.get(nom);
	        if (telefon != null) {
	            System.out.println("Número de telèfon de " + nom + ": " + telefon);
	        } else {
	            System.out.println("No hi ha cap contacte amb aquet nom.");
	        }
	    
	}

}
