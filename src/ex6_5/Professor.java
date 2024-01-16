package ex6_5;

public class Professor extends Persona {
	
	String assignaturaDonada;

	public Professor() {
		
	}
	
	public Professor(String nom, String dni, int edat, String assginaturaDonada) {
		super(nom, dni, edat);
		this.assignaturaDonada = assginaturaDonada;
	}
	
	public void mostrarDades() {
		System.out.println("Soc " + nom + ", el meu dni és "+ dni + " i soc professor de " + assignaturaDonada + " amb " + edat + " anys.");
	}
	
}
