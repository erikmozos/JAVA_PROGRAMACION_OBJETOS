package ex10_1;

import java.io.File;

public class ex10_1 {

	public static void main(String[] args) {

		String rutaDirectori = "C:\\xampp\\htdocs";

        File directori = new File(rutaDirectori);

        if (directori.isDirectory()) {
            File[] contingut = directori.listFiles();

            System.out.println("Contingut del directori " + rutaDirectori + ":");
            for (File fitxer : contingut) {
                System.out.println(fitxer.getName());
            }
        } else {
            System.out.println("La ruta especificada no és un directori vàlid.");
        }
	}

}
