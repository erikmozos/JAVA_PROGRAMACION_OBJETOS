package penjat;
import java.util.Random;
import java.util.Scanner;

public class programaPenjat {

	static Scanner sc = new Scanner(System.in);
	static String[] paraules = {"hola","peri", "alemania", "puperman", "programar", "ramis"};
	static String paraulaSecreta;
	static char[] paraulaEncertada;
	static StringBuilder lletresFallades;
	static int intentsRestants;
	
	public static void main(String[] args) {
		
		 iniciarJoc();
		 
		

	}

	  static void iniciarJoc() {
	        Random random = new Random();
	        paraulaSecreta = paraules[random.nextInt(paraules.length)];
	        paraulaEncertada = new char[paraulaSecreta.length()];
	        intentsRestants = 6;
	        

	        
	        for (int i = 0; i < paraulaSecreta.length(); i++) {
	            paraulaEncertada[i] = '_';
	        }
	        
	        for (int i = 0; i < paraulaSecreta.length(); i++) {
	        	
	        }
	    }
	  
	  static void comprovar() {
		  
	  }





	 
}
