package ex6_3;
import java.util.Scanner;
public class programaContrassenya {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		

		
		int menu = 0, contrassenyes = 0, i = 0;
		
		System.out.println("Quantes contrassenyes vols generar?");
		contrassenyes = sc.nextInt();
		
		while(i < contrassenyes) {
			System.out.println("1:Password de 8");
			System.out.println("2:Password de longitud especifica");
			menu = sc.nextInt();
			switch(menu) {
			case 1: passwordstandard();
					break;
					
			case 2: passwordlong();
					break;
					
			
			default: 
					System.out.println("Opció invalida");
					break;
			
			}
			
			i++;
			
		}
		
			

	}

	private static void passwordstandard() {
		
		Password password8 = new Password();
		password8.Esrobust();
		if(password8.isEsrobust() == true) {
		System.out.println("S'ha generat una contrassenya aleatoria de 8 digits: "+ password8.getContrassenya() + " Es robust");
		}
		if (password8.isEsrobust() == false) {
			System.out.println("S'ha generat una contrassenya aleatoria de 8 digits: "+ password8.getContrassenya() + " No es robust");
		}
	}

	private static void passwordlong() {
		
		System.out.println("De quina longitud vols que sigui la contrassenya");
		int longi = sc.nextInt();
		Password passwordlongitud = new Password(longi);
		passwordlongitud.Esrobust();
		if(passwordlongitud.isEsrobust()) {
		System.out.println("S'ha generat una contrassenya aleatoria de" + longi +" digits:" + passwordlongitud.getContrassenya()+ " Es Robust!");
		
		}
		if (passwordlongitud.isEsrobust() == false) {
			System.out.println("S'ha generat una contrassenya aleatoria de " + longi +" digits:" + passwordlongitud.getContrassenya()+ " No es Robust!");
		}
	}

}
