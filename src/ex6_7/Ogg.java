package ex6_7;

public class Ogg extends Musica{

	@Override
	public void reproduir() {
	System.out.println("Reproduint ogg");
	}

	public Ogg() {
		super();
		
	}

	public Ogg(double durada) {
		super(durada);
		System.out.println("Tenc una durada de " + durada);
	}
	
	
}
