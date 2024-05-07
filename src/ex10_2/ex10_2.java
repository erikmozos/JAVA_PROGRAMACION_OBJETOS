package ex10_2;

import java.io.File;

public class ex10_2 {

	public static void main(String[] args) {
		 String rutaDirectori = "/ruta/al/directori";

	        // Creem un objecte File amb la ruta del directori
	        File directori = new File(rutaDirectori);

	        // Comprovem si la ruta especificada és un directori vàlid
	        if (directori.isDirectory()) {
	            // Obtenim la llista de tots els fitxers del directori
	            File[] fitxers = directori.listFiles();

	            // Mostrem només els fitxers amb extensió .jpg o .png
	            System.out.println("Imatges del directori " + rutaDirectori + ":");
	            for (File fitxer : fitxers) {
	            	
	            }																																																																																																																																																					
	        }
	}

}
