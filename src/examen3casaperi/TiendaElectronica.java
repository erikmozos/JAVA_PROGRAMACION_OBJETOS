package examen3casaperi;
import java.util.Scanner;
public class TiendaElectronica {
	static Scanner sc = new Scanner(System.in);
	static Electronico[] ArrayEle = new Electronico[100];
	static int index = 0;
	public static void main(String[] args) {
		int menu = 0;
		do {
			System.out.println("1-Introducir un nuevo producto.\r\n"
					+ "2-Mostrar todos los smartphones.\r\n"
					+ "3-Mostrar todos los auriculares.\r\n"
					+ "4-Mostrar la cantidad total de productos y su precio sumado.\r\n"
					+ "5-Enviar un producto a reparar.\r\n"
					+ "6-Sortir");
			
			menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: nouProducte();
				break;
			case 2: mostrarSmartphones();
				break;
			case 3: mostrarAuriculares();
				break;
			case 4: mostrarTotalProductes();
				break;
			case 5: productoReparar();
				break;
			case 6:
				break;
			
			default:System.out.println("Error");
			
	}
		
	}while(menu != 6);
}
	private static void nouProducte() {
		int opcio;
		double bateria, precio, pulgadas;
		boolean teCable;
		String placa;
		System.out.println("1- Smarthpone | 2-Auriculars");
		opcio = sc.nextInt();
		sc.nextLine();
		if(opcio == 1 || opcio == 2) {
			if(opcio == 1) {
				System.out.println("Bateria: ");
				bateria = sc.nextDouble();
				sc.nextLine();
				System.out.println("Placa: ");
				placa = sc.nextLine();
				System.out.println("Precio: ");
				precio = sc.nextDouble();
				sc.nextLine();
				System.out.println("Pulgadas: ");
				pulgadas = sc.nextDouble();
				sc.nextLine();
				
				ArrayEle[index]= new Smartphone(bateria, placa, precio, pulgadas);
				index ++;

			
			}
			if(opcio == 2) {
				System.out.println("Bateria: ");
				bateria = sc.nextDouble();
				sc.nextLine();
				System.out.println("Placa: ");
				placa = sc.nextLine();
				System.out.println("Precio: ");
				precio = sc.nextDouble();
				sc.nextLine();
				System.out.println("teCable: ");
				teCable = sc.nextBoolean();
				sc.nextLine();
				ArrayEle[index]= new Auriculares(bateria, placa, precio, teCable);
				index ++;
			}
		}else {
			System.out.println("Error");
		}
	}
	private static void mostrarSmartphones() {
			for(int i = 0; i < index; i++) {
				if(ArrayEle[i] instanceof Smartphone) {
					System.out.println(((Smartphone)ArrayEle[i]).toString());
				}
			}
	}
	private static void mostrarAuriculares() {
		
		for(int i = 0; i < index; i++) {
			if(ArrayEle[i] instanceof Auriculares){
				System.out.println(((Auriculares)ArrayEle[i]).toString());
			}
		}
		
	}
	private static void mostrarTotalProductes() {
	
		for(int i = 0; i < index; i++) {
			
				System.out.println(((Electronico)ArrayEle[i]).toString()+" ID: "+ i);
			
		}
		
	}
	private static void productoReparar() {

		double hores;
		int opcio = 0;
		System.out.println("Hores: ");
		hores = sc.nextDouble();
		System.out.println("Quin Electronic: ");
		opcio = sc.nextInt();
		
		if(ArrayEle[opcio] instanceof Smartphone) {
		System.out.println(((Smartphone) ArrayEle[opcio]).reparar(hores));
		}else {
			System.out.println(((Auriculares) ArrayEle[opcio]).reparar(hores));
			}
		
	}
}
