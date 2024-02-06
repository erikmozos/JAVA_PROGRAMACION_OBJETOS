package ex6_9;

public class Empleat {

	String nom;
	String cognoms;
	Float sou_base;
	String DNI;
	
	public Empleat() {
		super();
		
	}
	
	public Empleat(String nom, String cognoms, Float sou_base, String dNI) {
		super();
		this.nom = nom;
		this.cognoms = cognoms;
		this.sou_base = sou_base;
		DNI = dNI;
	}
	
	public String toString(){
		
		return  " nom: " + nom +
                ", cognoms: " + cognoms +
                ", sou_base: " + sou_base +
                ", DNI: " + DNI;
}
		
		
	}
	
	

