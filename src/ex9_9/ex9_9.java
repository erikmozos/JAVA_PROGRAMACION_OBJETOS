package ex9_9;

import java.util.HashSet;
import java.util.Iterator;

public class ex9_9 {

	    public static void main(String[] args) {

	    	HashSet<Integer> hashSet = new HashSet<>();
	        hashSet.add(10);
	        hashSet.add(20);
	        hashSet.add(30);
	        hashSet.add(40);
	        hashSet.add(50);

	        System.out.println("Elements del HashSet:");
	        Iterator<Integer> iterator = hashSet.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        System.out.println("Conté el 20? " + hashSet.contains(20));
	        System.out.println("Conté el 35? " + hashSet.contains(35));

	        hashSet.remove(40);

	        System.out.println("Despér d'eliminar 40:");
	        for (Integer element : hashSet) {
	            System.out.println(element);
	        }

	        System.out.println("Anyadint el 50");
	        hashSet.add(50);

	        System.out.println("HashSet amb 50:");
	        for (Integer element : hashSet) {
	            System.out.println(element);
	        }

	        System.out.println("Mida del HashSet: " + hashSet.size());

	        hashSet.clear();

	        System.out.println("El HashSet està buit? " + hashSet.isEmpty());
	    
	}

}
