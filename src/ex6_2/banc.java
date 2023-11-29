package ex6_2;
import java.util.Scanner;
public class banc {

	
	public static void main(String[] args) {
		int menu = 0;
		
		Scanner lector = new Scanner(System.in);
		new CompteBancari();
		
		do {
			System.out.println("Menu: \n 1:Nou compte. 2:Ingressar doblers. 3:Treure doblers. 4:Veure saldo 5:Sortir");
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
				
			default:
				
			
			}
		}while(menu != 5); {
				System.out.println("Has sortit");
		}
	}

	private static void veureSaldo() {
		// TODO Auto-generated method stub
		
	}

	private static void treureSaldo() {
		// TODO Auto-generated method stub
		
	}

	private static void ingresarSaldo() {
		// TODO Auto-generated method stub
		
	}

	private static void crearCompte() {
		// TODO Auto-generated method stub
		
	}

}
