package examen7i8;

public class Puntuacio {
	
	String nom;
	String cognoms;
	int punts; 
	String data;
	
	public Puntuacio() {
		super();

	}

	public Puntuacio(String nom, String cognoms, int punts, String data) {
		super();
		this.nom = nom;
		this.cognoms = cognoms;
		this.punts = punts;
		this.data = data;
	}
	
	//To string per donar la informació
	public String toString() {
		return "Nom: " + nom +
				"\nCognoms: " + cognoms +
				"\nPuntuacio: " + punts +
				"\nData: " + data;
	}
	
	//Només volem getters de Cognom i punts
	public String getCognoms() {
		return cognoms;
	}



	public int getPunts() {
		return punts;
	}


	

}
