package examendeganesdemorir;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
public class Office {

		
		static final int MAX_PERSONAS = 100;
	    static Persona[] personas = new Persona[MAX_PERSONAS];
	    static Persona[] personasOrdenDni = null;
	    static int cantidadPersonas = 0;
	    static int turnoPersona = 0;

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nMenú Principal:");
	            System.out.println("1. Ver la cola de personas");
	            System.out.println("2. Llegada de una nueva persona a la oficina");
	            System.out.println("3. Atención de la primera persona de la cola");
	            System.out.println("4. Ver lista de personas atendidas correctamente por orden de entrada");
	            System.out.println("5. Ver lista de personas que no se han podido atender correctamente por orden de entrada");
	            System.out.println("6. Ver lista de personas atendidas correctamente ordenadas por DNI");
	            System.out.println("7. Ver lista de personas que no se han podido atender correctamente ordenadas por DNI");
	            System.out.println("0. Salir");

	            System.out.print("Seleccione una opción: ");
	            int opcion = scanner.nextInt();

	            switch (opcion) {
	                case 1:
	                    verCola();
	                    break;
	                case 2:
	                    agregarPersona(scanner);
	                    break;
	                case 3:
	                    atenderPersona();
	                    break;
	                case 4:
	                    verLista(true);
	                    break;
	                case 5:
	                    verLista(false);
	                    break;
	                case 6:
	                    verListaOrdenadaPorDNI(true);
	                    break;
	                case 7:
	                    verListaOrdenadaPorDNI(false);
	                    break;
	                case 0:
	                    System.out.println("¡Adiós!");
	                    System.exit(0);
	                default:
	                    System.out.println("Opción no válida. Inténtelo de nuevo.");
	            }
	        }
	    }

	    private static void verCola() {
	    	//La cola de personas pendientes va desde turnoPersona hasta cantidadPersonas
	    	//Los índices desde el 0 a turnoPersonas ya han sido atendidas
	        System.out.println("\nCola de personas:");
	        for (int i = turnoPersona; i < cantidadPersonas; i++) {
	            System.out.println(personas[i].getDni() + "\t" + personas[i].getNombre() + "\t" + personas[i].getEdad());
	        }
	    }

	    private static void agregarPersona(Scanner scanner) {
	        if (cantidadPersonas < MAX_PERSONAS) {
	            try {
	                System.out.print("Ingrese DNI: ");
	                String dni = scanner.next();

	                System.out.print("Ingrese nombre: ");
	                String nombre = scanner.next();

	                System.out.print("Ingrese edad: ");
	                int edad = scanner.nextInt();

	                personas[cantidadPersonas] = new Persona(dni, nombre, edad);
	                cantidadPersonas++;
	                System.out.println("Persona agregada a la cola correctamente.");
	            } catch (Exception e) {
	                System.out.println("Error al ingresar los datos. Inténtelo de nuevo.");
	                scanner.nextLine(); // Limpiar el buffer del scanner
	            }
	        } else {
	            System.out.println("La cola está llena. No se pueden agregar más personas.");
	        }
	    }

	    private static void atenderPersona() {
	        if (cantidadPersonas > turnoPersona) {
	            Persona personaAtendida = personas[turnoPersona];
	            personaAtendida.atender();

	            System.out.println("Persona atendida:\n" + personaAtendida);          

	            turnoPersona++;
	        } else {
	            System.out.println("No hay personas en la cola para atender.");
	        }
	    }

	    private static void verLista(boolean atendidoCorrectamente) {
	        System.out.println("\nLista de personas:");
	        for (int i = 0; i < turnoPersona; i++) {
	            if (personas[i].isAtendidoCorrectamente() == atendidoCorrectamente) {
	                System.out.println(personas[i]);
	            }
	        }
	    }

	    private static void verListaOrdenadaPorDNI(boolean atendidoCorrectamente) {
	        // Copiamos las personas atendidas en otro array para no perder el orden original
	    	personasOrdenDni = new Persona[turnoPersona+1];
	    	for (int i = 0 ; i < personasOrdenDni.length; i++) {
	    		personasOrdenDni[i]=personas[i];
	    	}
	    	
	    	// Ordenar el array por DNI usando el algoritmo de burbuja
	        for (int i = 0; i < turnoPersona - 1; i++) {
	            for (int j = 0; j < turnoPersona - i - 1; j++) {
	                if (personasOrdenDni[j].getDni().compareTo(personasOrdenDni[j + 1].getDni()) > 0) {
	                    // Intercambiar elementos
	                    Persona temp = personasOrdenDni[j];
	                    personasOrdenDni[j] = personasOrdenDni[j + 1];
	                    personasOrdenDni[j + 1] = temp;
	                }
	            }
	        }

	        // Mostrar la lista ordenada
	        System.out.println("\nLista de personas ordenadas por DNI:");
	        for (int i = 0; i < turnoPersona; i++) {
	            if (personasOrdenDni[i].isAtendidoCorrectamente() == atendidoCorrectamente) {
	                System.out.println(personasOrdenDni[i]);
	            }
	        }
	    }

}
