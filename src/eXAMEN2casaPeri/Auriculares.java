package eXAMEN2casaPeri;

public class Auriculares extends DispositivoElectronico implements enReparacion{
	boolean teCable;

	public Auriculares() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Auriculares(double longitud, double peso, double precio, boolean teCable) {
		super(longitud, peso, precio);
		
		this.teCable = teCable;
	}

	@Override
	public double reparar(int horas) {
		// TODO Auto-generated method stub
		return preuhores * horas;
	}
	
}
