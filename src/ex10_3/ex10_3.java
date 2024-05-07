package ex10_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex10_3 {
	
	    public static void main(String[] args) throws FileNotFoundException{

	        FileInputStream in = new FileInputStream("C:\\Users\\emozo\\Downloads\\Curriculum Erik 2024 (2) (1) (1) (1).pdf");
	        FileOutputStream out = new FileOutputStream("C:\\Users\\emozo\\Downloads\\10_3.pdf");
	        copiarDades(in, out);

	    }

	    private static void copiarDades(FileInputStream in, FileOutputStream out) {
	    try {
	    	byte[] dades = new byte[100];
	    	int llegits = 0;
	    	while (-1 != (llegits = in.read(dades))) {
	    		out.write(dades,0,llegits);
	    	}
	    	out.close();
	    	in.close();
	    	} catch (IOException e) {
	    	System.out.println("Error al fitxer: " + e.getMessage());    
	  }
	   }
	    }	
