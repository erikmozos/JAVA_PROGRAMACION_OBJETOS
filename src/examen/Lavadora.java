package examen;

public class Lavadora extends Electrodomestic implements enReparacio{

	double litres;

	public Lavadora() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lavadora(double preu, double consum, double kilograms, double litres) {
		super(preu, consum, kilograms);
		
		this.litres = litres;
	}
	
	public String toString() {
		return  "El preu és" + preu + " el consum és " + consum + " el kg és " + kilograms + " i els litres: " + litres;
	
	}

	@Override
	public double reparar(double hores) {
		
		return hores * preu_hora;
	}
	
	
	
}
