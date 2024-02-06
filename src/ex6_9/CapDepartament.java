package ex6_9;

public class CapDepartament extends Qualificat {

	String treballadorsACarrec;
	String projectes;
	float plus = 4;
	public CapDepartament() {
		super();
		
	}
	public CapDepartament(String nom, String cognoms, float sou_base, String DNI,String desti,float horesExtra, float preuHoresExtra,String treballadorsACarrec, String projectes, float plus) {
		super(nom, cognoms, sou_base, DNI,desti,horesExtra,preuHoresExtra);
		this.treballadorsACarrec = treballadorsACarrec;
		this.projectes = projectes;
		this.plus = plus;
	}
	
	public String toString() {
		
		return super.toString() + " treballadorsACarrec: " + treballadorsACarrec +
                ", projectes: " + projectes +
                ", plus: " + plus;
		
		
		
	}
	
}
