package ex6_3;
import java.util.Random;
public class Password {

	Random rand = new Random();
	private String Contrassenya= "";
	private int Longitud = 0;
	private boolean Esrobust;

	public Password(int Longitud) {
		this.Longitud = Longitud;
		int nombrerandom[] = new int[this.Longitud] ;


		for(int i = 0; i < Longitud; i++) {
			nombrerandom[i] = rand.nextInt((126 - 48)+1)+48;
			char caracter= (char) nombrerandom[i];
			Contrassenya = Contrassenya + caracter; 
		}
	}

	public boolean isEsrobust() {
		return Esrobust;
	}

	public void setEsrobust(boolean esrobust) {
		Esrobust = esrobust;
	}

	public Password() {
		Longitud = 8;
		int nombrerandom[] = new int[Longitud] ;


		for(int i = 0; i < Longitud; i++) {
			nombrerandom[i] = rand.nextInt((126 - 48)+1)+48;
			char caracter= (char) nombrerandom[i];
			Contrassenya = Contrassenya + caracter; 
		}
		
	}
	
	public void Esrobust() {
		boolean majus = false;
		boolean minus = false;
		boolean number = false;
		boolean simbol = false;
		for(int i= 0; i< Contrassenya.length(); i++) {
		if(Character.isUpperCase(Contrassenya.charAt(i))) {
			majus = true;
		}
		if(Character.isLowerCase(Contrassenya.charAt(i))) {
			minus = true;
		}
		
		if(Character.isDigit(Contrassenya.charAt(i))) {
			number = true;
		}
		if(!(Character.isLetterOrDigit(Contrassenya.charAt(i)))) {
			simbol = true;
		}
		}
		if((majus == true) && (minus == true) && (number == true) && (simbol == true)) {
			this.Esrobust = true;
		}
		else {
			this.Esrobust = false;
		}
	}

	public String getContrassenya() {
		return Contrassenya;
	}

	public void setContrassenya(String contrassenya) {
		Contrassenya = contrassenya;
	}

	public int getLongitud() {
		return Longitud;
	}

	public void setLongitud(int longitud) {
		Longitud = longitud;
	}





}
