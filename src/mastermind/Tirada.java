package mastermind;

public class Tirada {
    private char[] combinacioIntentada;
    private int[] respostaOrdinador;
    private int puntuacioTirada;

    public Tirada(char[] combinacioIntentada) {
        this.combinacioIntentada = combinacioIntentada;
        respostaOrdinador = new int[2];
    }

    public char[] getCombinacioIntentada() {
        return combinacioIntentada;
    }
}

