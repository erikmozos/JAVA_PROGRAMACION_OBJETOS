package ex8_1;
import java.util.InputMismatchException;

public class ex8_1 {

	    public static void main(String[] args) {
	        try {

	            throwInputMismatchException();

	            throwIndexOutOfBoundsException();

	            throwArithmeticException();

	        } catch (InputMismatchException e) {
	            System.out.println("Error: InputMismatchException - S'esperava un tipus de dades diferent.");

	        } catch (IndexOutOfBoundsException e) {
	            System.out.println("Error: IndexOutOfBoundsException - Accés fora dels límits d'una col·lecció o array.");

	        } catch (ArithmeticException e) {
	            System.out.println("Error: ArithmeticException - Divisió per zero.");

	        } catch (Exception e) {
	            System.out.println("Error desconegut: " + e.getMessage());
	        }
	    }

	    private static void throwInputMismatchException() {
	        throw new InputMismatchException();
	    }

	    private static void throwIndexOutOfBoundsException() {
	        int[] array = new int[5];
	        int element = array[10];
	    }

	    private static void throwArithmeticException() {
	        int result = 5 / 0;
	    }
	}


