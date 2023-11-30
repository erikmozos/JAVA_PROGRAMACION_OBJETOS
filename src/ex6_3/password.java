package ex6_3;
import java.util.Random;
public class password {
	
	Random rand = new Random();
	private char Contrassenya[] = new char[this.Longitud];
	private int Longitud = 8;
	
	public password() {
		
		int nombrerandom[] = new int[this.Longitud] ;
		
		
		for(int i = 0; i < Longitud; i++) {
			nombrerandom[i] = rand.nextInt((165 - 48)+1)+48;
			char caracter = (char) nombrerandom[i];
			this.Contrassenya[i] = caracter; 
		}
		
	}
	
	public static void Contrassenya() {
		
	}
	
	public static void Longitud() {
		
	}

	public char[] getContrassenya() {
		return Contrassenya;
	}

	public void setContrassenya(char[] contrassenya) {
		Contrassenya = contrassenya;
	}

	public int getLongitud() {
		return Longitud;
	}

	public void setLongitud(int longitud) {
		Longitud = longitud;
	}
	
	
}
