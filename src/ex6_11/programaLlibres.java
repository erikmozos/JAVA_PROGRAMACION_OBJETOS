package ex6_11;

import java.util.Scanner;

public class programaLlibres {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad máxima de libros en la biblioteca: ");
        int capacidadMaxima = scanner.nextInt();
        scanner.nextLine();

        LlistaLlibre llistaLlibre = new LlistaLlibre(new Llibre[capacidadMaxima], 0);

        int opcion;
        do {
            System.out.println("\n----- Menú -----");
            System.out.println("2. Añadir un libro");
            System.out.println("3. Ver todos los libros");
            System.out.println("4. Eliminar un libro");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La biblioteca tiene " + llistaLlibre.getNumLlibres() + " libros.");
                    break;
                case 2:
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese la cantidad de autores: ");
                    int numAutores = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea pendiente

                    String[] autores = new String[numAutores];
                    for (int i = 0; i < numAutores; i++) {
                        System.out.print("Ingrese el nombre del autor " + (i + 1) + ": ");
                        autores[i] = scanner.nextLine();
                    }

                    Llibre nuevoLibro = new Llibre(autores, titulo);
                    llistaLlibre.afegirLlibre(nuevoLibro);
                    break;
                case 3:
                    llistaLlibre.mostrarLlibres();
                    break;
                case 4:
                    System.out.print("Ingrese el número del libro que desea eliminar: ");
                    int indiceEliminar = scanner.nextInt();
                    llistaLlibre.eliminarLlibre(indiceEliminar - 1); // Restar 1 para ajustarse a la indexación de la lista
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}