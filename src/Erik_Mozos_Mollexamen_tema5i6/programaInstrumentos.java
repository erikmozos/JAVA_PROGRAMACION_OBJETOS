package Erik_Mozos_Mollexamen_tema5i6;

import java.util.Scanner;

public class programaInstrumentos {

	static Scanner sc = new Scanner(System.in);
	static InstrumentoMusical[] Arrayinstruments = new InstrumentoMusical[100];
	static int index = 0; // Index per incrementar les posicions de la array.

	public static void main(String[] args) {

		// Menu de eleccions
		int menu = 0;
		do {
			System.out.println("1: Crear guiterra\r\n" + "2: Crear piano\r\n" + "3: Mostrar instruments\r\n"
					+ "4: Tocar instrument\r\n" + "5: Afinar instrument\r\n" + "6: Transportar instrument\r\n"
					+ "7: sortir");
			menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case 1:
				Crearguiterra();
				break;
			case 2:
				Crearpiano();
				break;
			case 3:
				Mostrarinstruments();
				break;
			case 4:
				Tocarinstrument();
				break;
			case 5:
				Afinarinstrument();
				break;
			case 6:
				Transportarinstrument();
				break;
			case 7:
				break;
			default:
				System.out.println("Error"); // En cas de no triar cap opcio des menu correcte donam el missatge error.
				break;
			}
		} while (menu != 7);

		System.out.println("Adeu");

	}

	// Funcions per crear Guiterra
	private static void Crearguiterra() {

		String nom, material;
		int anyofabricacion, numeroCuerdas;

		System.out.println("Nom guiterra: ");
		nom = sc.nextLine();
		System.out.println("Tipus material: ");
		material = sc.nextLine();
		System.out.println("Any fabricació: ");
		anyofabricacion = sc.nextInt();
		sc.nextLine();
		System.out.println("Nombre de cordes: ");
		numeroCuerdas = sc.nextInt();
		sc.nextLine();

		Arrayinstruments[index] = new Guitarra(numeroCuerdas, nom, material, anyofabricacion);
		index++;

	}

	// Funcions per crear Piano
	private static void Crearpiano() {

		String nom, material;
		int anyofabricacion;
		String EsDeCola;
		boolean ania = false;

		System.out.println("Nom piano: ");
		nom = sc.nextLine();
		System.out.println("Tipus material: ");
		material = sc.nextLine();
		System.out.println("Any fabricació: ");
		anyofabricacion = sc.nextInt();
		sc.nextLine();
		System.out.println("Es de Cola (si) / (no)");
		EsDeCola = sc.nextLine();
		sc.nextLine();
		if(EsDeCola.toLowerCase() == "si" || EsDeCola.toLowerCase() == "no"){
			if(EsDeCola.toLowerCase() == "si") {
				ania = true;
			}else {
				ania = false;
			}
		}if(!(EsDeCola.toLowerCase() == "si" || EsDeCola.toLowerCase() == "no")) {
			System.out.println("Error");
		
		}
		

		Arrayinstruments[index] = new Piano(nom, material, anyofabricacion, ania);
		index++;

	}

	// Funcio per mostrar els instruments
	private static void Mostrarinstruments() {

		// Mostrarem per ordre, primer guiterres i despres pianos.
		System.out.println("Guiterres: ");
		for (int i = 0; i < index; i++) {
			if (Arrayinstruments[i] instanceof Guitarra) {
				System.out.println(((Guitarra) Arrayinstruments[i]).toString());
			}
		}

		System.out.println("Pianos");
		for (int i = 0; i < index; i++) {
			if (Arrayinstruments[i] instanceof Piano) {
				System.out.println(((Piano) Arrayinstruments[i]).toString());
			}
		}

	}

	// Funcio per tocar els instruments
	private static void Tocarinstrument() {

		int opcio = 0;

		for (int i = 0; i < index; i++) {
			System.out.println(Arrayinstruments[i] + " ID: " + i); // La ID serà segons la posició que té a l'array.
		}

		System.out.println("Tria un intrument (Escriu la ID)");
		opcio = sc.nextInt();
		sc.nextLine();

		if (Arrayinstruments[opcio] instanceof Piano) {
			((Tocable) Arrayinstruments[opcio]).tocando();
		}

		if (Arrayinstruments[opcio] instanceof Guitarra) {
			((Tocable) Arrayinstruments[opcio]).tocando();
		}

	}

	// Funcio per afinar els instruments
	private static void Afinarinstrument() {

		int opcio = 0;

		for (int i = 0; i < index; i++) {
			System.out.println(Arrayinstruments[i] + " ID: " + i);
		}

		System.out.println("Tria un intrument (Escriu la ID)");
		opcio = sc.nextInt();
		sc.nextLine();

		if (Arrayinstruments[opcio] instanceof Piano) {
			((Afinar) Arrayinstruments[opcio]).afinando();
		}

		if (Arrayinstruments[opcio] instanceof Guitarra) {
			((Afinar) Arrayinstruments[opcio]).afinando();
		}

	}

	// Funcio per transportar guiterres
	private static void Transportarinstrument() {

		int opcio = 0;
		int menu = 0;

		for (int i = 0; i < index; i++) {
			if (Arrayinstruments[i] instanceof Guitarra)
				System.out.println(Arrayinstruments[i] + " ID: " + i);
		}

		System.out.println("1: Empaquetar Guiterra -- 2: Desempaquetar Guiterra");
		menu = sc.nextInt();
		sc.nextLine();

		if (menu == 1 || menu == 2) { // En cas de no triar opcio correcte dona error.

			if (menu == 1) {

				System.out.println("Quina Guiterra vols empaquetar (Escriu la ID)");
				opcio = sc.nextInt();
				sc.nextLine();

				if (Arrayinstruments[opcio] instanceof Guitarra) {
					((Transportable) Arrayinstruments[opcio]).empaquetar();
				} else {
					System.out.println("Cap Guiterra te la ID " + opcio); // Si no es tria una ID correcte dona missatge
																			// d'error.
				}
			}
			if (menu == 2) {

				System.out.println("Quina Guiterra vols desmpaquetar (Escriu la ID)");
				opcio = sc.nextInt();
				sc.nextLine();

				if (Arrayinstruments[opcio] instanceof Guitarra) {

					((Transportable) Arrayinstruments[opcio]).desempaquetar();
				} else {
					System.out.println("Cap Guiterra te la ID " + opcio); // Si no es tria una ID correcte dona missatge
																			// d'error.
				}

			}
		} else {
			System.out.println("Error");
		}

	}

}
