package ex9_6;

import java.util.LinkedList;

public class ex9_6 {

	public static void main(String[] args) {

		// 1. Crear una LinkedList anomenada llistaCiutats
        LinkedList<String> llistaCiutats = new LinkedList<>();

        // 2. Afegir les ciutats a la llista
        llistaCiutats.add("Barcelona");
        llistaCiutats.add("Madrid");
        llistaCiutats.add("València");
        llistaCiutats.add("Sevilla");

        // 3. Mostrar per pantalla la llista original de ciutats
        System.out.println("Llista original de ciutats:");
        System.out.println(llistaCiutats);

        // 4. Afegir la ciutat Bilbao al principi de la llista
        llistaCiutats.addFirst("Bilbao");

        // 5. Afegir la ciutat Màlaga al final de la llista
        llistaCiutats.addLast("Màlaga");

        // 6. Mostrar per pantalla el primer i l'últim element de la llista
        System.out.println("\nPrimer element de la llista: " + llistaCiutats.getFirst());
        System.out.println("Últim element de la llista: " + llistaCiutats.getLast());

        // 7. Eliminar la primera ciutat de la llista
        llistaCiutats.removeFirst();

        // 8. Eliminar l'última ciutat de la llista
        llistaCiutats.removeLast();

        // 9. Mostrar per pantalla la llista de ciutats després de les modificacions
        System.out.println("\nLlista de ciutats després de les modificacions:");
        System.out.println(llistaCiutats);
    
	}

}
