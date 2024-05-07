package ex8_4;
public class Exceptionspropies extends Exception {
    private String missatge;
    private int codiError;

    public Exceptionspropies(String missatge, int codiError) {
        this.missatge = missatge;
        this.codiError = codiError;
    }

    public String getMissatge() {
        return missatge;
    }

    public int getCodiError() {
        return codiError;
    }

    @Override
    public String toString() {
        return "Excepció porpia: " + missatge + " (Codi d'error: " + codiError + ")";
    }
}
