package ex6_10;

public class FiguraGeometrica {
		
			public	double y;
			public	double x;
		
		public FiguraGeometrica() {
			
		}
		
		public FiguraGeometrica(double x, double y) {
			
			this.y=y;
			this.x=x;
			
		}
		
		public String toString() {
			return "X: " + x +
					"Y: " + y;
		}
	}


