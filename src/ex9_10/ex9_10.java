package ex9_10;

import java.util.*;

public class ex9_10 {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<>();
		
		//Afegir cadenes de text al TreeSet (noms, ciutats, animals, etc).
		
		treeSet.add("Murcia");
		treeSet.add("Moix");
		treeSet.add("ElPeri");
		treeSet.add("Moix");

		
		//Mostrar els elements del TreeSet emprant un iterador. En quin ordre es mostren? No te ordre.
		  Iterator<String> itr=treeSet.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }

		//Verificar si una cadena de text específica està present al TreeSet.
		  
		  System.out.println(treeSet.contains("Moix"));
		  
		//Intentar afegir un element ja existent. Que ha passat?  
		  System.out.println(treeSet.add("ElPeri")); // Retorna false perquè "Barcelona" ja existeix
		  
		//Eliminar una cadena de text del TreeSet.
		  treeSet.remove("Moix");
		  
		  
		// Mostrem els elements del TreeSet després d'eliminar una cadena de text
	        itr = treeSet.iterator();
	        while (itr.hasNext()) {
	            System.out.println(itr.next());
	        }
		
	
	}

}
