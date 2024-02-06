package examen3casaperi;

public class Auriculares extends Electronico implements Reparable{
	boolean teCable;

	public Auriculares() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Auriculares(double bateria, String placa, double precio, boolean teCable) {
		super(bateria, placa, precio);
		this.teCable = teCable;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double reparar(double hores) {
		// TODO Auto-generated method stub
		return coste_hora * hores;
	}
	
public String toString() {
		
		return "Preu: " + precio + " bateria: " + bateria + " placa: " + placa + " TeCable: " +teCable;
	}

	
	
	
}
