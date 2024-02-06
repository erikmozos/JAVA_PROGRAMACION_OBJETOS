package examen;
import java.util.Scanner;


public class Inventari {
	
	static Scanner sc = new Scanner(System.in);
	static Electrodomestic[] electrodomestics = new Electrodomestic[100];
	static int index = 0;

	public static void main(String[] args) {
		
		int menu = 0;
		
		do {
			System.out.println("1. Introducir un nuevo dispositivo\r\n"
					+ "2. Mostrar todas las neveras\r\n"
					+ "3. Mostrar todas las lavadoras\r\n"
					+ "4. Mostrar todos los electrodomésticos\r\n"
					+ "5. Mostrar cuántos electrodomésticos hay de cada tipo y el número total de\r\n"
					+ "electrodomésticos\r\n"
					+ "6. Mostrar el precio sumado de todas las neveras\r\n"
					+ "7. Mostrar el precio sumado de todas las lavadoras\r\n"
					+ "8. Mostrar el precio sumado de todos los electrodomésticos\r\n"
					+ "9. Enviar un electrodoméstico a reparar");
			
			menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			
			case 1: nouDispositiu();
					break;
			
			case 2: mostrarNevera();
			break;
			
			case 3: mostrarLavadora();
			break;
			
			case 4: mostrarTot();
			break;
			
			case 5: totalElectrodomestic();
						break;
						
			case 6: preuNevera();
					break;
					
			case 7: preuLavadora();
					break;
			
			case 8: preuSumat();
					break;
					
			case 9: enviarReparacio();
					break;
				
			case 10: break;
					
			default: System.out.println("Error");
					break;
			
			}
		}while(menu != 10);

	}

	private static void nouDispositiu() {
		
		int opcio = 0;
		double preu = 0, consum = 0, kg = 0, capacitatolitres = 0;
		
		System.out.println("Que vols crear 1:Nevera -- 2: Lavadora");
		opcio = sc.nextInt();
		sc.nextLine();
		
		if(opcio == 1 || opcio == 2) {
			
			if(opcio == 1) {
				System.out.println("Preu: ");
				preu = sc.nextDouble();
				sc.nextLine();
				System.out.println("Consum: ");
				consum = sc.nextDouble();
				sc.nextLine();
				System.out.println("Kg: ");
				kg = sc.nextDouble();
				sc.nextLine();
				System.out.println("Capacitat: ");
				capacitatolitres = sc.nextDouble();
				sc.nextLine();
				
				electrodomestics[index] = new Nevera(preu, consum, kg, capacitatolitres);
				index ++;
			}
			if(opcio == 2) {
				System.out.println("Preu: ");
				preu = sc.nextDouble();
				sc.nextLine();
				System.out.println("Consum: ");
				consum = sc.nextDouble();
				sc.nextLine();
				System.out.println("Kg: ");
				kg = sc.nextDouble();
				sc.nextLine();
				System.out.println("Litres: ");
				capacitatolitres = sc.nextDouble();
				sc.nextLine();
				
				electrodomestics[index] = new Lavadora(preu, consum, kg, capacitatolitres);
				index ++;
			}
			
		}else {
			System.out.println("Error");
		}
		
		
	}

	private static void mostrarNevera() {
		
		for(int i = 0; i <= index; i++) {
			
			if(electrodomestics[i] instanceof Nevera) {
				
				System.out.println(((Nevera)electrodomestics[i]).toString());
				
				
			}
			
		}
		
	}

	private static void mostrarLavadora() {
		
for(int i = 0; i <= index; i++) {
			
			if(electrodomestics[i] instanceof Lavadora) {
				
				System.out.println(((Lavadora)electrodomestics[i]).toString());
				
				
			}
			
		}
		
	}

	private static void mostrarTot() {
		
		System.out.println("Neveres: ");
		for(int i = 0; i <= index; i++) {
			
			if(electrodomestics[i] instanceof Nevera) {
				
				System.out.println(((Nevera)electrodomestics[i]).toString());
				
				
			}
			
			System.out.println("Lavadora: ");
			for(i = 0; i <= index; i++) {
				
				if(electrodomestics[i] instanceof Lavadora) {
				
					System.out.println(((Lavadora)electrodomestics[i]).toString());
					
					
				}
			
		}
		}
		
	}

	private static void totalElectrodomestic() {
		
		int contnev = 0, contlav = 0;
		
		System.out.println("Neveres: ");
		for(int i = 0; i <= index; i++) {
			
			if(electrodomestics[i] instanceof Nevera) {
				
				System.out.println(((Nevera)electrodomestics[i]).toString());
				contnev  ++;
				
				
			}
			
			System.out.println("Lavadora: ");
			for(i = 0; i <= index; i++) {
				
				if(electrodomestics[i] instanceof Lavadora) {
				
					System.out.println(((Lavadora)electrodomestics[i]).toString());
					
					contlav ++;
					
					
				}
			
		}
			System.out.println("Hi ha un total de " + contnev + " neveres i un total de " + contlav + "lavadores");
			
		}
		
		
		}
		
	

	private static void preuNevera() {
		
		double preutotal = 0;
		
		for(int i = 0; i <= index; i++) {
			
			if(electrodomestics[i] instanceof Nevera) {
				
				preutotal += electrodomestics[i].getPreu();
				
				
			}
		}
		System.out.println("Preu total neveres : " + preutotal);
	}

	private static void preuLavadora() {
		
		double preutotal = 0;
		
			for(int i = 0; i <= index; i++) {
			
				if(electrodomestics[i] instanceof Lavadora) {
					
					preutotal += electrodomestics[i].getPreu();
				
				
			}
		}
			System.out.println("Preu total neveres : " + preutotal);
		
	
		
	}

	private static void preuSumat() {
		
		double preutotal = 0;
		
			for(int i = 0; i <= index; i++) {
			
				preutotal += electrodomestics[i].getPreu();
				
					
				
				
			}
			System.out.println("Preu total: " + preutotal);
		
	}

	private static void enviarReparacio() {
		
		int contador = 0, elec = 0;
		
		for(int i = 0; i <= index; i++) {
			
			System.out.println(electrodomestics[i] + " ID: " + contador);
			contador ++;
		}
		
		System.out.println("Quin vols reparar: ");
		elec = sc.nextInt();
		
		System.out.println("Hores: ");
		double hores = sc.nextDouble();
		

		System.out.println("El preu de la reparacio és de : " + ((enReparacio)electrodomestics[elec]).reparar(hores));
		
		
	}

}
