package ex9_3;

import java.util.ArrayList;


public class programaArrayList {
	
	public static void main(String[] args) {
		
		//Cream un ArrayList de nom nombresArraylist
		ArrayList<Integer> nombresArraylist = new ArrayList<>();

		//Introduim nombres a s'Arraylist
		nombresArraylist.add(20);
		nombresArraylist.add(30);
		nombresArraylist.add(40);
		nombresArraylist.add(50);

		//Imprimir Arraylist
    System.out.println("Array: " + nombresArraylist);

    //Introduim nombre 60 a una nova posició
    nombresArraylist.add(60);
    
    //Tornam a imprimir la llista després d'afegir es nombre 60
    System.out.println("Array amb nombre 60: " + nombresArraylist);

    //Eliminam es nombre 60 de s'Array
    nombresArraylist.remove(Integer.valueOf(30));

    //Tornam a llistar s'Array per comprovar que no hi ha es 30
    System.out.println("Array després d'eliminar 30: " + nombresArraylist);
    
    //Imprimir sa primera posició de s'Array
    System.out.println("Primera posició de s'Array " + nombresArraylist.get(0));

    //Canviam sa segona posició per es nombre 25
    nombresArraylist.set(1, 25);

    //Comprovam que s'hagi modificat
    System.out.println("Array modificada posició 1 per 25 " + nombresArraylist);

    //Veure la quantitat d'elements de s'Array
    System.out.println("Quantitat Array: " + nombresArraylist.size());

    // Comprovar que hi sigui es nombre 40, si es true o false
    boolean hihaesnombre40 = nombresArraylist.contains(40);
    System.out.println("¿El número 40 está presente en la lista? " + (hihaesnombre40 ? "Si" : "No"));

    //Eliminam totes les posicion de l'Array
    nombresArraylist.clear();

    //Verificam si esta buida s'Array
    boolean estabuida = nombresArraylist.isEmpty();
    System.out.println("¿El ArrayList está vacío? " + (estabuida? "Si" : "No"));
}
}
