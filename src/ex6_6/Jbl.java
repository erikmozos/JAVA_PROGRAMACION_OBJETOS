package ex6_6;

public class Jbl extends Auriculars{

	int longitud_cable;

	public Jbl() {
		
	}

	public Jbl(String marca, String model, String color, int longitud_cable) {
		super(marca, model, color);
		this.longitud_cable = longitud_cable;
	}
	
	public void informacio() {
		System.out.println("Soc uns auriculars de marca "+marca +" i model " +model +" de color "+color + " amb un cable de " + longitud_cable +" metres");

	}
	
	
}
