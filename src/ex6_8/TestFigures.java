package ex6_8;

public class TestFigures {
	
	public static void main(String[] args) {
		// Figura f = new Figura(); no es pot fer un objecte si la classe es abstract
		Cercle c = new Cercle();
		c.dibuixar();
		Rectangle r = new Rectangle();
		r.dibuixar();
		Figura f1 = new Cercle(); // Es correcte perque Cercle es filla de Figura
		Figura f2 = new Rectangle();
		f1.dibuixar(); //mostrara Bibuixant cercle
		f2.dibuixar();
		}

}
