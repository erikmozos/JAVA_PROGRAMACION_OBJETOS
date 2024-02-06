package ex6_10;

public class Rombe extends FiguraGeometrica {

double costat;
	
	public Rombe() {
		
	}
	
	public Rombe(double x, double y, double costat) {
		super(x,y);
		this.costat=costat;
	}
	
	public  double area() {
		double area = costat * costat;
		return area;
	}
	
	public double perimetre() {
		double perimetre= costat * 2 + costat * 2;
		return perimetre;
	}
	
	public String toString() {
		return super.toString() + "La mida del costat és de: " + costat +
									" L' area és de: " + area() +
									" el perimetre és de: " + perimetre();
	}
}
