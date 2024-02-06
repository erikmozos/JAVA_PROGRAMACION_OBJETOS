package ex6_7;

public class Mp3 extends Musica {

	@Override
	public void reproduir() {
	System.out.println("Reproduint mp3");
	
	
	}

	public Mp3() {
		
	}

	public Mp3(double durada) {
		super(durada);
		System.out.println("La meva durada es de " + durada);
	}
}
