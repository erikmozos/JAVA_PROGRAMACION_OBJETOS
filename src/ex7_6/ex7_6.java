package ex7_6;

public class ex7_6 {

	    public static void main(String[] args) {
	        int[] array = {5, 2, 9, 1, 5, 6};
	        
	        System.out.println("Array original:");
	        for (int elemento : array) {
	            System.out.print(elemento + " ");
	        }

	        quicksort(array, 0, array.length - 1);

	        System.out.println("\nArray ordenat:");
	        for (int elemento : array) {
	            System.out.print(elemento + " ");
	        }
	    }

	    public static void quicksort(int[] array, int izquierda, int derecha) {
	        if (izquierda < derecha) {
	            int pivot = array[derecha];
	            int i = izquierda - 1;

	            for (int j = izquierda; j < derecha; j++) {
	                if (array[j] <= pivot) {
	                    i++;

	                    int temp = array[i];
	                    array[i] = array[j];
	                    array[j] = temp;
	                }
	            }

	            int temp = array[i + 1];
	            array[i + 1] = array[derecha];
	            array[derecha] = temp;

	            quicksort(array, izquierda, i);
	            quicksort(array, i + 2, derecha);
	        }
	    }
	}


