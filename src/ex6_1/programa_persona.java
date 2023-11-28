package ex6_1;

public class programa_persona {

	public static void main(String[] args) {
		
		persona p1, p2;
		
		p1 = new persona();
		p2 = new persona();
		
		p1.setNom ("Erik");
		p1.setDni ("4325325G");
		p1.setEdat(17);
		
		p2.setNom ("Peri");
		p2.setDni ("3424234325G");
		p2.setEdat(18);
		
		
		System.out.println("L'objecte 1 es " + p1.getNom() + " amb Dni " + p1.getDni() + " amb DNI " + p1.getEdat());
		System.out.println("L'objecte 2 es " + p2.getNom() + " amb Dni " + p2.getDni() + " amb DNI " + p2.getEdat());
		
		p1.nedar();

	}

}
