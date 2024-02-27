package Erik_Mozos_Mollexamen_tema5i6;

public class Piano extends InstrumentoMusical implements Tocable, Afinar {

	boolean esPianoDeCola;

	public Piano() {
		super();

	}

	public Piano(String nom, String material, int anyofabricacion, boolean esPianoDeCola) {
		super(nom, material, anyofabricacion);
		this.esPianoDeCola = esPianoDeCola;

	}

	// Cada interface dona un missatge segon el que se li demana i amb el nom segons
	// la posicio de l'array demanada.
	public String toString() {

		return "El nom del piano és: " + nom + " està fet de " + " es va fabricar l'any " + anyofabricacion
				+ ". \r\n Es piano de cola? -->" + esPianoDeCola;
	}

	@Override
	public void tocando() {

		System.out.println("Tocant el piano de nom " + nom);

	}

	@Override
	public void afinando() {

		System.out.println("Afinant el piano de nom " + nom);

	}

}
