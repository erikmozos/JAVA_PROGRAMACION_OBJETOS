package ex6_5;

public class Alumne extends Persona{
	
	String nivell;

	public Alumne() {
		
	}
	
	public Alumne(String nom, String dni, int edat,String nivell) {
		super(nom,dni,edat);
		this.nivell = nivell;
	}
	
	public void mostrarDades(){
		System.out.println("Soc " + nom + ", el meu dni és "+ dni + " i estic cursant " + nivell + " amb " + edat + " anys.");
	}
	
}
