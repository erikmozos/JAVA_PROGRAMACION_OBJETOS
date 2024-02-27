package Erik_Mozos_Mollexamen_tema5i6;

public class Guitarra extends InstrumentoMusical implements Tocable, Afinar, Transportable {

	int numeroCuerdas;

	public Guitarra() {
		super();

	}

	public Guitarra(int numeroCuerdas, String nom, String material, int anyofabricacion) {
		super(nom, material, anyofabricacion);
		this.numeroCuerdas = numeroCuerdas;
	}

	// Missatge que dona l'objecte creat
	public String toString() {

		return "El nom de la guiterra és: " + nom + " està fet de " + " es va fabricar l'any " + anyofabricacion
				+ ". \r\n El nombre de cordes és -->" + numeroCuerdas;

	}

	// Cada interface dona un missatge segon el que se li demana i amb el nom segons
	// la posicio de l'array demanada.
	@Override
	public void afinando() {

		System.out.println("Afinant la guiterra de nom " + nom);

	}

	@Override
	public void tocando() {

		System.out.println("Tocant la guiterra de nom " + nom);

	}

	@Override
	public void empaquetar() {

		System.out.println("Empaquetant la guiterra de nom " + nom);

	}

	@Override
	public void desempaquetar() {

		System.out.println("Desmpaquetant la guiterra de nom " + nom);

	}

}
