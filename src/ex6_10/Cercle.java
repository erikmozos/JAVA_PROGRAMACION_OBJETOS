package ex6_10;

public class Cercle extends FiguraGeometrica{
		
		double coordenades;
		double radi;
		
		
		public Cercle() {
			
		}
		
		public Cercle(double x, double y, double coordenades, double radi) {
			super(x,y);
			this.coordenades= coordenades;
			this.radi=radi;
		}
		
		public double area() {
			
			
			double nombrepi=Math.PI;
			double area= nombrepi * Math.pow(radi, 2);
			
			return area;
		}
		
		public double perimetreCercle() {
			double diametre= radi * 2;
			double pi= Math.PI;
			double perimetre= diametre * pi ;
			
			return perimetre;
		}
		
		public String toString() {
			return super.toString() + "\nCordenades del centre: " + coordenades+ 
										"\nRadi: " + radi +
										"\nArea: " + area() +
										"\nPerimetre: " + perimetreCercle();
		}

	}

