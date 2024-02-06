package ex6_10;

public class Rectangle extends FiguraGeometrica{

	double costatX;
	double costatY;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double x, double y,double costatX,double costatY) {
		super(x,y);
		this.costatX=costatX;
		this.costatY=costatY;
		
	}
	
	public  double area() {
		double area;
		area= costatX * costatY;
		
		return area;
	}
	
	public double perimetre() {
		double perimetre= (costatX * 2) + (costatY * 2);
		
		return perimetre;
	}
	
	public String toString() {
		return super.toString() + 	"La mida del costat X: " + costatX +
									" La mida del costat Y: " + costatY +
									" L'area és de: " + area() +
									" El perimetre és de: " + perimetre();
	}
}
