package ex6_2;
import java.util.Scanner;
public class banc {

	static Scanner lector = new Scanner(System.in);
	static CompteBancari[] comptes = new CompteBancari[100];
	static int nombreComptes;
	
	public static void main(String[] args) {
		int menu = 0;
		
		new CompteBancari();
		
		do {
			System.out.println("Menu: \n 1:Nou compte. 2:Ingressar doblers. 3:Treure doblers. 4:Veure saldo 5:Sortir");
			menu = lector.nextInt();
			switch(menu) {
			
			case 1:	
				crearCompte();
				break;
				
			case 2:
				ingresarSaldo();
				break;
				
			case 3:
				treureSaldo();
				break;
				
			case 4:
				veureSaldo();
				break;
			case 5:
				break;
				
			default:
				System.out.println("Aña");
				break;
			
			}
		}while(menu != 5); {
				System.out.println("Has sortit");
		}
	}

	private static void veureSaldo() {
		String dni;
		
		System.out.println("Introdueix el DNI");
		dni = lector.next();
		lector.nextLine();
		System.out.println("Quina quantitat vols ingressar?");

		
		for (int i = 0; i < nombreComptes; i++) {
			if(dni.equals(comptes[i].getDniTitular())) {
				System.out.println("El saldo és de " + comptes[i].getSaldo());
			}	
		}
	}

	private static void treureSaldo() {
		String dni;
		double quantitat;
		
		System.out.println("Introdueix el DNI");
		dni = lector.next();
		lector.nextLine();
		System.out.println("Quina quantitat vols treure?");
		quantitat = lector.nextDouble();
		lector.nextLine();
		
		for (int i = 0; i < nombreComptes; i++) {
			if(dni.equals(comptes[i].getDniTitular())) {
				comptes[i].setSaldo(comptes[i].getSaldo()- quantitat);
			}	
		}
		
	}

	private static void ingresarSaldo() {
		String dni;
		double quantitat;
		
		System.out.println("Introdueix el DNI");
		dni = lector.next();
		lector.nextLine();
		System.out.println("Quina quantitat vols ingressar?");
		quantitat = lector.nextDouble();
		
		for (int i = 0; i < nombreComptes; i++) {
			if(dni.equals(comptes[i].getDniTitular())) {
				comptes[i].setSaldo(comptes[i].getSaldo()+quantitat);
			}
		}
	}

	private static void crearCompte() {
		String dni, nom;
		double saldo;
		
		System.out.println("Introdueix el dni del titular");
		dni=lector.next();
		lector.nextLine();
		System.out.println("Introdueix el nom del titular");
		nom=lector.next();
		lector.nextLine();
		System.out.println("Introdueix el saldo del titular");
		saldo=lector.nextDouble();
		lector.nextLine();
		
		
		comptes[nombreComptes] = new CompteBancari (dni, nom, saldo);
		nombreComptes++;
	}

}
