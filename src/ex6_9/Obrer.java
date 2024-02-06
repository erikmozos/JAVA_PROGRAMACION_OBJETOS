package ex6_9;

public class Obrer extends Empleat{

	String titulacio;
	float plus;
	String departament;
	
	public Obrer() {
		super();
		
	}

	public Obrer(String nom, String cognoms, float sou_base, String DNI, String titulacio, float plus, String departament) {
		super(nom, cognoms, sou_base, DNI);
		this.titulacio = titulacio;
		this.plus = plus;
		this.departament = departament;
	}
	
public String toString(){
		
		return super.toString() + ", titulacio: " + titulacio +
                ", plus: " + plus +
                ", departament: " + departament;
		
		
	}
	
}
