package examen7i8;
import java.util.Scanner;





public class GestorPuntuacions {
	
	static Scanner lector = new Scanner(System.in);
	static Puntuacio[] puntuacions = new Puntuacio[100];
	static Puntuacio[] cola = new Puntuacio[100];
	static Puntuacio[] punts = new Puntuacio[100];
	static Puntuacio[] cognoms = new Puntuacio[100];
	static int contadorCola = 0;
	static int contador = 0;
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		// Menú d'opcions
		while (true) {
            try {
                System.out.println("\nMenú Principal:");
                System.out.println("1. Introduir nova puntuació");
                System.out.println("2. Mostrar llista per ordre arribada");
                System.out.println("3. Mostrar llista puntuacions ordre descendent");
                System.out.println("4. Mostrar llista puntuacions ordre alfabètic cognoms");
                System.out.println("5.Sortir");

                System.out.print("Seleccione una opción: ");
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        novaPuntuacio();
                        break;
                    case 2:
                        mostrarLlistaOrdreArribada();
                        break;
                    case 3:
                        mostrarPuntuacioDescPunts();
                        break;
                    case 4:
                    	mostrarPuntuacioAlfabeticCognom();
                        break;
                    case 5:
                        System.out.println("¡Adéu!");
                        System.exit(0);
                        
                    default:
                        System.out.println("Opción no válida. Inténtelo de nuevo.");
                }
            }  catch (Exception e) {
                System.out.println("Error inesperado. Inténtelo de nuevo.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }
    
	}
	private static void novaPuntuacio() {
		
		String nom;
		String cognoms;
		int puntuacio;
		String data;
		
		System.out.println("Nom:");
		nom=lector.next();
		
		System.out.println("Cognoms:");
		cognoms=lector.next();
		
		System.out.println("Puntuacio:");
		puntuacio=lector.nextInt();
		lector.nextLine();
		
		System.out.println("Data:");
		data=lector.next();
		
		puntuacions[contador] = new Puntuacio (nom,cognoms,puntuacio,data ); //Envia dades al constructor i ho guarda a la Array
		
		cola[contadorCola] = puntuacions[contador];
		contador ++;
		contadorCola++;
	}
	private static void mostrarLlistaOrdreArribada() {
		
		for(int i = 0; i < contadorCola; i++ ) {
			System.out.println(cola[i].toString());
			System.out.println("----------------");
		}
		
	}
	private static void mostrarPuntuacioDescPunts() {
		
    	// Ordenar l'array cognoms emprant l'algoritme de selecció directe

        int n = contador;
        for (int i = 0; i < n-1; i++) {
            int indexMinim = i;
            for (int j = i+1; j < n; j++) {
            	if (puntuacions[j].getPunts() < puntuacions[indexMinim].getPunts()) {
                    indexMinim = j;
            }
            	//Substituim posicions
            Puntuacio temp = puntuacions[indexMinim];
            puntuacions[indexMinim] = puntuacions[i];
            puntuacions[i] = temp;
            }
        }
        
        for(int i = 0; i < contador; i++) {
        	
        	System.out.println(puntuacions[i]);
        	System.out.println("------------------");
        	
        	
        }
		
	}
	private static void mostrarPuntuacioAlfabeticCognom() {
		
		cognoms = new Puntuacio[contador+1];
    	for (int i = 0 ; i < cognoms.length; i++) {
    		cognoms[i]=puntuacions[i];
    	}
    	
    	// Ordenar l'array cognoms emprant l'algoritme de burbuja
        for (int i = 0; i < contador - 1; i++) {
            for (int j = 0; j < contador - i - 1; j++) {
                if (cognoms[j].getCognoms().compareTo(cognoms[j + 1].getCognoms()) > 0) {
                    // Intercambiar elements
                    Puntuacio temp = cognoms[j];
                    cognoms[j] = cognoms[j + 1];
                    cognoms[j + 1] = temp;
                }
            }
        }

        // Mostrar la llista ordenada
        System.out.println("\nLista de personas ordenadas por DNI:");
        for (int i = 0; i < contador; i++) {
                System.out.println(cognoms[i]);
                System.out.println("-----------------");
        }
	}
}
                
        
    
		
	


