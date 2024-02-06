package ex6_10;

public class Quadrat extends FiguraGeometrica{
	
	public double costat;
	
	public Quadrat() {
		
	}
	
	public Quadrat(double x, double y, double costat) {
		super(x,y);
		
		this.costat = costat;
	}
	
	public  double area() {
		
		double area= costat * costat;
		
		return area;
	}
	
	public double perimetre() {
		double perimetre= (costat * 2) + (costat * 2);
		
		return perimetre;
	}
	
	public String toString() {
		return super.toString() + "La mida del costat és: " + costat +
									"L'Area és: " + area() +
									"El perimetre es de : " + perimetre();
	}

}
