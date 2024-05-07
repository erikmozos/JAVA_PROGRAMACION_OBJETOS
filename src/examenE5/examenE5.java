package examenE5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class examenE5 {

	public static void main(String[] args) {

		String rutatemperatures = "C:\\Users\\emozo\\Documents\\temperatures.txt";
		
        HashMap<String, Double> temperatures = new HashMap<>();
        
        try {
            Scanner scanner = new Scanner(new File(rutatemperatures));

            // Llegir la primera línia amb els noms dels mesos
            String messosLine = scanner.nextLine();
            String[] messos = messosLine.split(",");

            double[] sumes = new double[messos.length];
            int numFiles = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] temperaturesMes = line.split(",");
                for (int i = 0; i < temperaturesMes.length; i++) {
                    double temperatura = Double.parseDouble(temperaturesMes[i]);
                    sumes[i] += temperatura;
                }
                numFiles++;
            }

            for (int i = 0; i < messos.length; i++) {
                double temperaturaMitjana = sumes[i] / numFiles;
                temperatures.put(messos[i], temperaturaMitjana);
            }

            for (String mes : messos) {
                System.out.println(mes + ": " + temperatures.get(mes));
            }

        } catch (FileNotFoundException e) {
            System.err.println("No s'ha trobat el fitxer: " + e.getMessage());
        }
        	
        

	}

}
