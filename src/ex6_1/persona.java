package ex6_1;

public class persona {
		
	private String nom;
	private String dni;
	private int edat;
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdat() {
		return edat;
	}
	public void setEdat(int edat) {
		this.edat = edat;
	}
	
	public void nedar() {
		System.out.println("Soc " + this.nom+ " i estic nedant");
	}
	
	
	
}