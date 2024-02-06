package examen;

public abstract class Electrodomestic {
	
	double preu;
	double consum;
	double kilograms;
	
	public Electrodomestic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Electrodomestic(double preu, double consum, double kilograms) {
		super();
		this.preu = preu;
		this.consum = consum;
		this.kilograms = kilograms;
	}

	public double getPreu() {
		return preu;
	}
	
	
	
	
	
	

}
