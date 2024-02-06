package ex6_9;

public class Qualificat extends Empleat{

	String desti;
	float horesExtra;
	float preuHoresExtra;
	
	public Qualificat() {
		super();
		
	}

	public Qualificat(String nom, String cognoms, float sou_base, String DNI, String desti, float horesExtra, float preuHoresExtra) {
		super(nom, cognoms, sou_base, DNI);
		this.desti = desti;
		this.horesExtra = horesExtra;
		this.preuHoresExtra = preuHoresExtra;
	}
	
public String toString(){
		
		return super.toString() + " desti: " + desti +
                ", horesExtra: " + horesExtra +
                ", preuHoresExtra: " + preuHoresExtra;
		
		
	}
	
	
	
	
}
