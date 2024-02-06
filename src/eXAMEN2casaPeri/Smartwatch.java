package eXAMEN2casaPeri;

public class Smartwatch extends DispositivoElectronico implements enReparacion{
	double bateria;

	public Smartwatch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Smartwatch(double longitud, double peso, double precio, double bateria) {
		super(longitud, peso, precio);
		// TODO Auto-generated constructor stub
		this.bateria = bateria;
		
	}

	@Override
	public double reparar(int horas) {
		// TODO Auto-generated method stub
		return preuhores * horas;
	}
	
	public String toString() {
		
		return "Preu: " + precio + " Logn: " + longitud + " pes: " + peso + " bateria: " + bateria;
		
	}
	
}

