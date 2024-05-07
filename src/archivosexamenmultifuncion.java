import java.io.*;

import java.util.Scanner;
public class archivosexamenmultifuncion {

	 private static Scanner lector = new Scanner(System.in);



	    public static void main(String[] args) {

	    	while (true) {

	            System.out.println("Menú:");

	            System.out.println("1. Escribir en un archivo de texto");

	            System.out.println("2. Leer un archivo de texto");

	            System.out.println("3. Copiar archivos binarios");

	            System.out.println("4. Convertir archivo de texto a binario");

	            System.out.println("5. Salir");

	            System.out.print("Selecciona una opción: ");

	            

	            int opcion = lector.nextInt();

	            lector.nextLine(); // Consumir el salto de línea



	            switch (opcion) {

	                case 1:

	                    escribirArchivoTexto();

	                    break;

	                case 2:

	                    leerArchivoTexto();

	                    break;

	                case 3:

	                    copiarArchivosBinarios();

	                    break;

	                case 4:

	                    convertirTextoABinario();

	                    break;

	                case 5:

	                    System.out.println("Saliendo del programa...");

	                    return;

	                default:

	                    System.out.println("Opción no válida. Inténtalo de nuevo.");

	            }

	        }

	    }



	    private static void escribirArchivoTexto() {

	        try (FileWriter writer = new FileWriter("archivo.txt")) {

	            System.out.println("Ingrese el texto a escribir en el archivo (presione Enter sin ningún carácter para finalizar):");

	            while (true) {

	                String linea = lector.nextLine();

	                if (linea.isEmpty()) {

	                    break; // Si la línea está vacía, terminar el bucle

	                }

	                writer.write(linea + "\n"); // Escribir la línea en el archivo

	            }

	            System.out.println("Texto escrito en el archivo correctamente.");

	        } catch (IOException e) {

	            System.err.println("Error al escribir en el archivo: " + e.getMessage());

	        }

	    }



	    private static void leerArchivoTexto() {

	        try (BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"))) {

	            String linea;

	            while ((linea = reader.readLine()) != null) {

	                System.out.println(linea);

	            }

	        } catch (IOException e) {

	            System.err.println("Error al leer el archivo: " + e.getMessage());

	        }

	    }



	    private static void copiarArchivosBinarios() {

	        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\unkiw\\Documents\\JAVA_PROGRAMACION_OBJETOS\\archivo.bin");

	             FileOutputStream outputStream = new FileOutputStream("copia_archivo.bin")) {

	            byte[] buffer = new byte[1024];

	            int bytesRead;

	            while ((bytesRead = inputStream.read(buffer)) != -1) {

	                outputStream.write(buffer, 0, bytesRead);

	            }

	            System.out.println("Archivo binario copiado correctamente.");

	        } catch (IOException e) {

	            System.err.println("Error al copiar el archivo binario: " + e.getMessage());

	        }

	    }



	    private static void convertirTextoABinario() {

	        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\unkiw\\Documents\\JAVA_PROGRAMACION_OBJETOS\\archivo.txt"));

	             DataOutputStream writer = new DataOutputStream(new FileOutputStream("C:\\Users\\unkiw\\Documents\\JAVA_PROGRAMACION_OBJETOS\\copia_archivo.bin"))) {

	            String linea;

	            while ((linea = reader.readLine()) != null) {

	                writer.writeUTF(linea);

	            }

	            System.out.println("Archivo de texto convertido a binario correctamente.");

	        } catch (IOException e) {

	            System.err.println("Error al convertir el archivo de texto a binario: " + e.getMessage());

	        }

	    }
}
