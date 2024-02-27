package ex7_2;

import java.util.Arrays;

public class ex7_2 {

	public static void main(String[] args) {
		
		  int[] llista = {8, 5, 2, 6, 9, 3, 1, 4, 0, 7};

	        System.out.println("Llista inicial:");
	        for (int value : llista) {
	            System.out.print(value + " ");
	        }

	        int n = llista.length;
	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (llista[j] < llista[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            int temp = llista[minIndex];
	            llista[minIndex] = llista[i];
	            llista[i] = temp;
	        }

	        System.out.println("\nLlista ordenada:");
	        for (int value : llista) {
	            System.out.print(value + " ");
	        }
		
		

	}

}
