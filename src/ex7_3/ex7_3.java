package ex7_3;

public class ex7_3 {
	  public static void main(String[] args) {
	        int[] Llista = {8, 5, 2, 6, 9, 3, 4, 1, 0, 7};

	        System.out.println("Llista inicial:");
	        for (int value : Llista) {
	            System.out.print(value + " ");
	        }

	        int n = Llista.length;

	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (Llista[j] > Llista[j + 1]) {
	                    int temp = Llista[j];
	                    Llista[j] = Llista[j + 1];
	                    Llista[j + 1] = temp;
	                }
	            }
	        }


	        System.out.println("\nLlista ordenada:");
	        for (int value : Llista) {
	            System.out.print(value + " ");
	        }
	    }

}
