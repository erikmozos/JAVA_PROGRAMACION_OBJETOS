package Erik_Mozos_Mollexamen_tema5i6;

public abstract class InstrumentoMusical { // No volem crear un objecte InstrumentoMusical per tant sera abstract (nomes
											// volem pianos i guiterres)

	String nom;
	String material;
	int anyofabricacion;

	public InstrumentoMusical() {
		super();
	}

	public InstrumentoMusical(String nom, String material, int anyofabricacion) {
		super();
		this.nom = nom;
		this.material = material;
		this.anyofabricacion = anyofabricacion;
	}

}
