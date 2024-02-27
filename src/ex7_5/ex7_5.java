package ex7_5;
import java.util.Arrays;
import java.util.Scanner;

public class ex7_5 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Introduce la longitud del array:");
	        int longitud = scanner.nextInt();
	        int[] array = new int[longitud];

	        System.out.println("Introduce los elementos del array:");
	        for (int i = 0; i < longitud; i++) {
	            array[i] = scanner.nextInt();
	        }

	        System.out.println("Array original:");
	        mostrarArray(array);

	        System.out.println("Elija el algoritmo de ordenación:");
	        System.out.println("1. Inserción Directa");
	        System.out.println("2. Selección Directa");
	        System.out.println("3. Intercambio Directo (Bubble Sort)");

	        int opcion = scanner.nextInt();

	        switch (opcion) {
	            case 1:
	                ordenar(array, "inserció");
	                break;
	            case 2:
	                ordenar(array, "selecció");
	                break;
	            case 3:
	                ordenar(array, "bombolla");
	                break;
	            default:
	                System.out.println("Opció no vàlida.");
	                break;
	        }

	        System.out.println("Array ordenat:");
	        mostrarArray(array);
	    }

	    public static void ordenar(int[] array, String algoritmo) {
	        switch (algoritmo.toLowerCase()) {
	            case "insercio":
	                ordenacioPerInsercio(array);
	                break;
	            case "seleccio":
	                ordenacioPerSeleccio(array);
	                break;
	            case "bombolla":
	                ordenacioPerBombolla(array);
	                break;
	            default:
	                System.out.println("Error");
	        }
	    }

	    private static void ordenacioPerInsercio(int[] array) {
	       
	    	  int n = array.length;
		        for (int i = 1; i < n; ++i) {
		            int key = array[i];
		            int j = i - 1;

		            while (j >= 0 && array[j] > key) {
		                array[j + 1] = array[j];
		                j = j - 1;
		            }
		            array[j + 1] = key;
		        }
	    	
	    }

	    private static void ordenacioPerSeleccio(int[] array) {
	        
	    	 int n = array.length;
		        for (int i = 0; i < n-1; i++) {
		            int indexMinim = i;
		            for (int j = i+1; j < n; j++) {
		            	if (array[j] < array[indexMinim]) {
		                    indexMinim = j;
		            }
		            int temp = array[indexMinim];
		            array[indexMinim] = array[i];
		            array[i] = temp;
		            }
		        }
	    	
	    	
	    }

	    private static void ordenacioPerBombolla(int[] array) {
	       
	    	   int n = array.length;
		        for (int i = 0; i < n-1; i++) {
		            for (int j = 0; j < n-i-1; j++) {
		                if (array[j] > array[j+1]) {
		                    int temp = array[j];
		                    array[j] = array[j+1];
		                    array[j+1] = temp;
		                }
		            }
		        }
	    	
	    }

	    public static void mostrarArray(int[] array) {
	        System.out.println(Arrays.toString(array));
	    }
	}

	
