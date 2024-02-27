package ex7_7;

public class ex7_7 {
	
	 private static final int totalQueens = 8;

	    public static void main(String[] args) {
	        resoldre(0, new int[totalQueens]);
	    }

	    private static void resoldre(int n, int[] queens) {
	        if (n == totalQueens) {
	            solucio(queens);
	            return;
	        }

	        for (int i = 0; i < totalQueens; i++) {
	            queens[n] = i;
	            if (validacio(n, queens)) {
	                resoldre(n + 1, queens);
	            }
	        }
	    }

	    private static void solucio(int[] queens) {
	        System.out.println("Solucio trobada:");
	        for (int i = 0; i < totalQueens; i++) {
	            for (int j = 0; j < totalQueens; j++) {
	                if (queens[i] == j) {
	                    System.out.print("Q ");
	                } else {
	                    System.out.print(". ");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }

	    private static boolean validacio(int n, int[] queens) {
	        for (int i = 0; i < n; i++) {
	            if (queens[i] == queens[n] || Math.abs(queens[i] - queens[n]) == Math.abs(i - n)) {
	                return false;
	            }
	        }
	        return true;
	    }
}
