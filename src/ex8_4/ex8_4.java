package ex8_4;

public class ex8_4 {

	    public static void main(String[] args) {
	        try {
	            throwNovaExcepcio();
	        } catch (Exceptionspropies e) {
	            System.out.println(e);
	        }
	    }

	    public static void throwNovaExcepcio() throws Exceptionspropies {
	        int codiError = 404;
	        String missatge = "Això és un missatge d'error personalitzat.";
	        throw new Exceptionspropies(missatge, codiError);
	    }
	}


