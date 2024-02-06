package eXAMEN2casaPeri;
import java.util.Scanner;
public class Tienda {

	static Scanner sc = new Scanner(System.in);
	static DispositivoElectronico[] Pere = new DispositivoElectronico[100];
	static  int index=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int menu = 0;
	do {
		System.out.println("1:Agregar un nuevo dispositivo\r\n"
				+ "2:Mostrar todos los smartwatches\r\n"
				+ "3:Mostrar todos los auriculares\r\n"
				+ "4: Mostrar todos los dispositivos electrónicos\r\n"
				+ "5: 	Mostrar el precio total de todos los dispositivos electrónicos\r\n"
				+ "6: Reparar un dispositivo\r\n"
				+ "7: sortir"
				);
		menu = sc.nextInt();
		sc.nextLine();
	switch(menu) {
	case 1: agregarDispositiu();
		break;
	case 2: mostrarSmartwatch();
		break;
	case 3: mostrarAuriculares();
		break;
	case 4: mostrarDispositivos();
		break;
	case 5: mostrarPreu();
		break;
	case 6: repararDispositivo();
		break;
	case 7: break;
	default: System.out.println("Errer");
		break;
	}
	}while(menu != 7);
	}
	private static void agregarDispositiu() {
		int opcio=0;
		double longitud;
		double peso;
		double precio;
		boolean teCable;
		double bateria;
		
		System.out.println("1- Auricular | 2- Smartwatch");
		opcio = sc.nextInt();
		sc.nextLine();
		if (opcio == 1 || opcio == 2) {
			if(opcio == 1) {
				
				System.out.println("Long:");
				longitud = sc.nextDouble();
				sc.nextLine();
				System.out.println("Pes:");
				peso = sc.nextDouble();
				sc.nextLine();
				System.out.println("Precio:");
				precio = sc.nextDouble();
				sc.nextLine();
				System.out.println("Tecable:");
				teCable = sc.nextBoolean();
				sc.nextLine();
				
				Pere[index] = new Auriculares(longitud, peso, precio, teCable);
				index ++;
				
				
			}
			if(opcio == 2) {
				
				System.out.println("Long:");
				longitud = sc.nextDouble();
				sc.nextLine();
				System.out.println("Pes:");
				peso = sc.nextDouble();
				sc.nextLine();
				System.out.println("Precio:");
				precio = sc.nextDouble();
				sc.nextLine();
				System.out.println("Tebateria:");
				bateria = sc.nextDouble();
				sc.nextLine();
				
				Pere[index] = new Smartwatch(longitud, peso, precio, bateria);
				index ++;
				
				
			}
		}else {
			System.out.println("Errer");
		}
		}
	private static void mostrarSmartwatch() {
		
		for(int i = 0 ; i < index; i++) {
			
			if(Pere[index] instanceof Smartwatch ) {
				System.out.println(((Smartwatch)Pere[i]).toString());
			}
		}
		
	}
	private static void mostrarAuriculares() {
		// TODO Auto-generated method stub
		
	}
	private static void mostrarDispositivos() {
		// TODO Auto-generated method stub
		
	}
	private static void mostrarPreu() {
		// TODO Auto-generated method stub
		
	}
	private static void repararDispositivo() {
		// TODO Auto-generated method stub
		
	}
}