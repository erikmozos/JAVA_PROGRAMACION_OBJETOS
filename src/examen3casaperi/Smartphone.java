package examen3casaperi;

public class Smartphone extends Electronico  implements Reparable{
	double pulgadas;

	public Smartphone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Smartphone(double bateria, String placa, double precio, double pulgadas) {
		super(bateria, placa, precio);
		this.pulgadas = pulgadas;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double reparar(double hores) {
		// TODO Auto-generated method stub
		return hores * coste_hora;
	}
	
	public String toString() {
		
		return "Preu: " + precio + " bateria: " + bateria + " placa: " + placa + " pulgadas: " +pulgadas;
	}
	
}
