package ex9_8;
import java.util.LinkedList;
import java.util.Scanner;
public class programa_cua {

	public static void main(String[] args) {
		
		Cua colaPersones = new Cua();
		Cua cua = new Cua();
        Scanner scanner = new Scanner(System.in);
        int opcio;

        do {
            System.out.println("\nMENU:");
            System.out.println("1. Afegir persona");
            System.out.println("2. Treure persona");
            System.out.println("3. Mostrar cua");
            System.out.println("4. Sortir");
            System.out.print("Selecciona una opció: ");
            opcio = scanner.nextInt();

            switch (opcio) {
                case 1:
                    System.out.print("Introdueix el nom de la persona a afegir: ");
                    scanner.nextLine(); 
                    String nomPersona = scanner.nextLine();
                    cua.afegirPersona(nomPersona);
                    System.out.println(nomPersona + " ha estat afegida a la cua.");
                    break;
                case 2:
                    String personaTreta = cua.treurePersona();
                    if (personaTreta != null) {
                        System.out.println("Persona treta de la cua: " + personaTreta);
                    }
                    break;
                case 3:
                    cua.mostrarCua();
                    break;
                case 4:
                    System.out.println("Sortint del programa...");
                    break;
                default:
                    System.out.println("Opció no vàlida. Si us plau, selecciona una opció vàlida.");
            }
        } while (opcio != 4);

    }

}
