package ex6_9;
import java.util.Scanner;
public class programaEmpleats {

	static Scanner sc = new Scanner(System.in);
	static int indexObrer = 0, indexQualificat = 0, indexCapDepartament = 0;
	static Obrer[] obreros = new Obrer[10];
    static Qualificat[] qualificats = new Qualificat[10];
    static CapDepartament[] capDepartaments = new CapDepartament[10];
    
	
	public static void main(String[] args) {
		
		
	        
	        int menu = 0;
	        
	        
	        do {
	        	
	        	System.out.println("Crear Obrer[1], Crear Qualificat[2], Crear Cap de Departament[3], Mostrar empleats[4], Sortir[5]");
	        	menu= sc.nextInt();
	        	sc.nextLine();
	        	
				switch(menu) {
					
				case 1: crearObrer();
						break;
						
				case 2: crearQualificat();
						break;
						
				case 3: crearCapDepartament();
						break;
						
				case 4: mostrarEmpleats();
						break;
						
				default: break;
	        	}
	        }while(menu != 5);
		
	}

	private static void mostrarEmpleats() {
		int i;
		System.out.println("Els cap de departament: ");
		for(i = 0; i<indexCapDepartament; i++) {
			System.out.println(capDepartaments[i]);
		}
		
		System.out.println("Els qualificats: ");
		for(i = 0; i<indexQualificat; i++) {
			System.out.println(qualificats[i]);
		}
		
		System.out.println("Els obrers: ");
		for(i = 0; i<indexObrer; i++) {
			System.out.println(obreros[i]);
		}
		
	}

	private static void crearCapDepartament() {
		
		String nom, cognoms, DNI, desti, treballadorsACarrec, projectes; 
		float sou_base, horesExtra, preuHoresExtra ,  plus;
		
		System.out.println("Escriu el nom de l'Empleat");
		nom = sc.next();
		System.out.println("Escriu el cognom de l'Empleat");
		cognoms = sc.next();
		System.out.println("Escriu el seu DNI");
		DNI = sc.next();
		System.out.println("El seu destí");
		desti = sc.next();
		System.out.println("Quins treballadors té a carrec");
		treballadorsACarrec = sc.next();
		System.out.println("Projectes:");
		projectes = sc.next();
		System.out.println("El sou base: ");
		sou_base = sc.nextFloat();
		System.out.println("Hores extra: ");
		horesExtra = sc.nextFloat();
		System.out.println("Preu per hora extra: ");
		preuHoresExtra = sc.nextFloat();
		System.out.println("Plus: ");
		plus = sc.nextFloat();
		
		// String nom, String cognoms, float sou_base, String DNI,String desti,float horesExtra, float preuHoresExtra,String treballadorsACarrec, String projectes, float plus
		capDepartaments[indexObrer] = new CapDepartament(nom,cognoms,sou_base, DNI, desti,horesExtra, preuHoresExtra, treballadorsACarrec, projectes, plus);
		indexObrer ++;
		
	}

	private static void crearQualificat() {
		String nom, cognoms, DNI, desti;
		float sou_base, horesExtra,preuHoresExtra;
		
		System.out.println("Escriu el nom de l'Empleat");
		nom = sc.next();
		System.out.println("Escriu el cognom de l'Empleat");
		cognoms = sc.next();
		System.out.println("Escriu el seu DNI");
		DNI = sc.next();
		System.out.println("El seu destí");
		desti = sc.next();

		System.out.println("El sou base: ");
		sou_base = sc.nextFloat();
		System.out.println("Hores extra: ");
		horesExtra = sc.nextFloat();
		System.out.println("Preu per hora extra: ");
		preuHoresExtra = sc.nextFloat();
		
		//	String nom, String cognoms, float sou_base, String DNI, String desti, float horesExtra, float preuHoresExtra) {
		
		qualificats[indexQualificat] = new Qualificat(nom, cognoms,sou_base,DNI,desti,horesExtra,preuHoresExtra);
		indexQualificat ++;
	}

	private static void crearObrer() {
		String nom, cognoms, DNI, titulacio, departament;
		float sou_base, plus;
		
		System.out.println("Escriu el nom de l'Empleat");
		nom = sc.next();
		System.out.println("Escriu el cognom de l'Empleat");
		cognoms = sc.next();
		System.out.println("Escriu el seu DNI");
		DNI = sc.next();
		System.out.println("La titulació");
		titulacio = sc.next();
		System.out.println("Quin es el seu departament");
		departament = sc.next();
		System.out.println("El sou base: ");
		sou_base = sc.nextFloat();
		System.out.println("Plus: ");
		plus = sc.nextFloat();
		
		//String nom, String cognoms, float sou_base, String DNI, String titulacio, float plus, String departament
		obreros[indexObrer] = new Obrer(nom, cognoms, sou_base, DNI, titulacio, plus, departament);
		indexObrer ++;
		
	}

}
