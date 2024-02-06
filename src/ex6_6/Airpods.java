package ex6_6;

public class Airpods extends Auriculars{

	int quant_bateria;

	public Airpods() {
		super();
		
	}

	public Airpods(String marca, String model, String color, int quant_bateria) {
		super(marca, model, color);
		this.quant_bateria = quant_bateria;
	}
	
	public void informacio() {
		System.out.println("Soc uns auriculars de marca "+marca +" i model " +model + " de color "+color +" amb una bateria de " + quant_bateria +" hores");
	}
	
	
}
