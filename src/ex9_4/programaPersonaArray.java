package ex9_4;

import java.util.ArrayList;


public class programaPersonaArray {
	
	public static void main(String[] args) {
        ArrayList<Persona> persones = new ArrayList<>();
        
        
        persones.add(new Persona("Peri", "4161012424Y", 18));
        persones.add(new Persona("Saaarnau", "41615356424P", 20));
        persones.add(new Persona("Seguraa", "416123424L", 19));

        System.out.println("Array de persones:");
        mostrarDetalles(persones);

        persones.add(new Persona("Luca", "4160925543P", 12));

        System.out.println("\nNova Llista:");
        mostrarDetalles(persones);

        String dniAEliminar = "41615356424P";
        eliminarPersonaPorDNI(persones, dniAEliminar);

        System.out.println("\nArray després d'eliminar la persona amb DNI: " + dniAEliminar + ":");
        mostrarDetalles(persones);
    }

    public static void mostrarDetalles(ArrayList<Persona> llistaPersones) {
        for (Persona persona : llistaPersones) {
            System.out.println("Nom: " + persona.getNombre() + ", DNI: " + persona.getDni() + ", Edat: " + persona.getEdad());
        }
    }

    public static void eliminarPersonaPorDNI(ArrayList<Persona> llistaPersones, String dni) {
        for (int i = 0; i < llistaPersones.size(); i++) {
            if (llistaPersones.get(i).getDni().equals(dni)) {
            	llistaPersones.remove(i);
                break; 
            }
        }
    }

}
