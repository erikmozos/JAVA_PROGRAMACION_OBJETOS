package ex6_10;
import java.util.Scanner;

public class programaFigures {

	static Scanner sc = new Scanner(System.in);
	
	static Quadrat[] quadrat = new Quadrat[50];
	static Rectangle[] rectangle = new Rectangle[50];
	static Rombe[] rombe = new Rombe[50];
	static Cercle[] cercle = new Cercle[50];
	
	static int contadorCercle;
	static int contadorQuadrat;
	static int contadorRectangle;
	static int contadorRombe;
	
	
	public static void main(String[] args) {

		int menu = 0;
		
do {
			
			System.out.println("(1)Nou quadrat, (2)Nou rectangle, (3)Nou rombe, (4)Nou cercle, (5)Veure les dades, (6)Sortir");
			menu=sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1: CrearQuadrat();
					break;
			case 2: CrearRectangle();
					break;
			case 3: CrearRombe();
					break;
			case 4: CrearCercle();
					break;
			case 5: mostrarDades();
					break;
			default: break;
			}
			
		}while(menu!=6);

			System.out.println("Adeu");

	}


	private static void mostrarDades() {
		
		System.out.println("Quadrats:");
		for(int i=0; i<contadorQuadrat;i++) {
			if(quadrat[i]!=null) {
				System.out.println(quadrat[i].toString());
				System.out.println("---------------------");
			}
		}
		
		System.out.println("Rectangles:");
		for(int i=0; i<contadorRectangle;i++) {
			if(rectangle[i]!=null) {
				System.out.println(rectangle[i].toString());
				System.out.println("---------------------");
			}
		}
		
		System.out.println("Rombes:");
		for(int i=0; i<contadorRombe;i++) {
			if(rombe[i]!=null) {
				System.out.println(rombe[i].toString());
				System.out.println("---------------------");
			}
			
		}
		
		System.out.println("Cercles:");
		for(int i=0; i<contadorCercle;i++) {
			if(cercle[i]!=null) {
				System.out.println(cercle[i].toString());
				System.out.println("---------------------");
			}
		}
		
	}


	private static void CrearCercle() {
		double cords;
		double radi;
		double x;
		double y;
		
		System.out.println("Coordenades de X: ");
		x=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Coordenades de Y: ");
		y = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Coordenades del centre: ");
		cords=sc.nextDouble();
		sc.nextLine();

		
		System.out.println("Introdueix el radi: ");
		radi = sc.nextDouble();
		sc.nextLine();
		
		cercle[contadorCercle]=new Cercle( x, y,cords,radi);
		contadorCercle++;
		
	}


	private static void CrearRombe() {
		
		double midaCostat;
		double x;
		double y;
		
		System.out.println("Coordenades de X: ");
		x=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Coordenades de Y: ");
		y=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Mida del costat: ");
		midaCostat=sc.nextDouble();
		sc.nextLine();
		
		rombe[contadorRombe]=new Rombe( x, y,midaCostat);
		contadorRombe++;
		
	}


	private static void CrearRectangle() {
		double costatX;
		double costatY;
		double x;
		double y;
		
		System.out.println("Coordenades de X: ");
		x=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Coordenades de Y: ");
		y=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Mida del costat X : ");
		costatX=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Mida del costat Y : ");
		costatY=sc.nextDouble();
		
		rectangle[contadorRectangle]=new Rectangle( x, y,costatX,costatY);
		contadorRectangle++;
		
	}


	private static void CrearQuadrat() {
		
		double midaCostat;
		float x;
		float y;
		
		System.out.println("Introdueix X: ");
		x=sc.nextFloat();
		sc.nextLine();
		
		System.out.println("Introdueix Y: ");
		y=sc.nextFloat();
		sc.nextLine();
		
		System.out.println("Mida del costat: ");
		midaCostat=sc.nextDouble();
		
		quadrat[contadorQuadrat]= new Quadrat(x,y,midaCostat);
		contadorQuadrat++;
		
	}

}
