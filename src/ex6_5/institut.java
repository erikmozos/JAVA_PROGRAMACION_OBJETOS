package ex6_5;

import java.util.Scanner;

public class institut {

	static Scanner sc = new Scanner(System.in);
	static Persona [] persones = new Persona[100];
	static String nom;
	static String dni;
	static int edat;
	static String nivelloassignatura;
	static int index;
	
	public static void main(String[] args) {
		
		int menu = 0;
		/*
		persones[0] = new Alumne("Erik", "4151143G", 18, "Grau Superior");
		persones[1] = new Alumne("Erika", "41597943G", 38, "Grau Mitja");
		persones[2] = new Alumne("Paco", "41523213G", 53, "ESO");
		persones[3] = new Professor("Jose", "553443643h", 32, "Català");
		persones[4] = new Professor("Carmen", "5534454F", 109, "Matemàtiques");
		persones[5] = new Professor("Eva", "534313643h", 43, "Ingles");*/
		
		do {
			System.out.println("\n Crear Professor[1] \n Crear Alumne[2] \n Veure Dades[3] \n Sortir[4]");
			menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1: NouProfessor();
					break;
			case 2: NouAlumne();
					break;
			case 3: VeureDades();
					break;
			}
		}while(menu != 4);
			System.out.println("Adeu");
	}
	
	private static void VeureDades() {
		
		for(int i = 0; i < index; i++) {
			if( persones[i] instanceof Alumne) {
				((Alumne) persones[i]).mostrarDades();
				
				System.out.println("---------------------------------------------------------------");
			}else {
				((Professor) persones[i]).mostrarDades();
				System.out.println("---------------------------------------------------------------");

			}
		}
		
	}

	public static void NouProfessor() {
		
		System.out.println("Escriu el nom del professor");
		nom = sc.nextLine();
		
		System.out.println("Escriu el dni del professor");
		dni = sc.nextLine();
		
		System.out.println("Escriu l'edat del professor");
		edat = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Escriu la materia del professor");
		nivelloassignatura = sc.nextLine();
		
		persones[index] = new Professor(nom, dni, edat, nivelloassignatura);
		index++;
		
	}
	
	public static void NouAlumne() {
		
		System.out.println("Escriu el nom del Alumne");
		nom = sc.nextLine();
		
		System.out.println("Escriu el dni del Alumne");
		dni = sc.nextLine();
		
		System.out.println("Escriu l'edat del Alumne");
		edat = sc.nextInt();
		sc.nextLine();
		System.out.println("Escriu el curs del Alumne");
		nivelloassignatura = sc.nextLine();
		
		persones[index] = new Alumne(nom, dni, edat, nivelloassignatura);
		index++;
		
	}

}
