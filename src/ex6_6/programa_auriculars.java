package ex6_6;
import java.util.Scanner;

public class programa_auriculars {

	static Scanner sc = new Scanner(System.in);
	static Auriculars [] auriculars = new Auriculars[100];
	static String marca;
	static String model;
	static String color;
	static int quantitat_bat;
	static int longitud;
	static int index;
	
	public static void main(String[] args) {
		
		int menu = 0;
		
		do {
			System.out.println("\n Crear Auricular alabmbric[1] \n Crear Auricular inalambric[2] \n Veure Dades[3] \n Sortir[4]");
			menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1: NouAuricularAlambric();
					break;
			case 2: NouAuricularInalambric();
					break;
			case 3: VeureDades();
					break;
			}
		}while(menu != 4);
			System.out.println("Adeu");

	}

	private static void VeureDades() {
		
		for(int i = 0; i < index; i++) {
			if( auriculars[i] instanceof Airpods) {
				((Airpods) auriculars[i]).informacio();
				
				System.out.println("---------------------------------------------------------------");
			}else {
				((Jbl) auriculars[i]).informacio();
				System.out.println("---------------------------------------------------------------");

			}
		}
		
	}

	private static void NouAuricularInalambric() {
		
		System.out.println("Escriu la marca de l'auricular");
		marca = sc.nextLine();
		
		System.out.println("Escriu el model de l'auricular");
		model = sc.nextLine();
		
		System.out.println("Escriu el color de l'auricular");
		color = sc.nextLine();
		
		System.out.println("Escriu quantes hores dura la bateria");
		quantitat_bat = sc.nextInt();
		sc.nextLine();
		
		auriculars[index] = new Airpods(marca, model, color, quantitat_bat);
		index++;
		
	}

	private static void NouAuricularAlambric() {
		
		System.out.println("Escriu la marca de l'auricular");
		marca = sc.nextLine();
		
		System.out.println("Escriu el model de l'auricular");
		model = sc.nextLine();
		
		System.out.println("Escriu el color de l'auricular");
		color = sc.nextLine();
		
		System.out.println("Escriu quants metres medeix el cable");
		longitud = sc.nextInt();
		sc.nextLine();
		
		auriculars[index] = new Jbl(marca, model, color, longitud);
		index++;
		
	}

}
