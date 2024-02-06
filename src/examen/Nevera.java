package examen;

public class Nevera extends Electrodomestic implements enReparacio{
	
	double capacitat;

	public Nevera() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Nevera(double preu, double consum, double kilograms, double capacitat) {
		super(preu, consum, kilograms);
		
		this.capacitat = capacitat;
	}
	
	public String toString() {
		return "El preu és " + preu + " el consum és " + consum + " el kg és " + kilograms + " i els capacitat: " + capacitat;
	
	}

	@Override
	public double reparar(double hores) {
		
		
		return  hores * preu_hora;
	}
	

}
