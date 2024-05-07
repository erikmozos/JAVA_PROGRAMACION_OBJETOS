package mastermind;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Partida {
    private String nomJugador;
    private char[] combinacioSecreta;
    private ArrayList<Tirada> llistaTirades;
    private int puntuacio;
    private boolean estatFinal;

    public Partida(String nomJugador) {
        this.nomJugador = nomJugador;
        llistaTirades = new ArrayList<>();
        generarCombinacioSecreta();
        puntuacio = 0;
        estatFinal = false;
    }

    private void generarCombinacioSecreta() {
        Random rand = new Random();
        combinacioSecreta = new char[4];
        String colors = "RBGMYC";
        for (int i = 0; i < 4; i++) {
            int index = rand.nextInt(colors.length());
            combinacioSecreta[i] = colors.charAt(index);
        }
    }

    public void jugar() {
        int intentsRestants = 16;
        while (intentsRestants > 0 && !estatFinal) {
            char[] intent = demanarTirada();
            Tirada tirada = new Tirada(intent);
            int[] resultat = comprovar(tirada);
            System.out.println("Resultat de la tirada: [" + resultat[0] + ", " + resultat[1] + "]");
            llistaTirades.add(tirada);
            if (resultat[0] == 4) {
                puntuacio *= intentsRestants; 
                System.out.println("Has guanyat!");
                estatFinal = true;
            }
            intentsRestants--;
        }
        if (!estatFinal) {
            System.out.println("Has perdut! La combinació secreta era: " + String.valueOf(combinacioSecreta));
        }
        System.out.println("Puntuació final: " + puntuacio); 
    }

    public int[] comprovar(Tirada tirada) {
        char[] intent = tirada.getCombinacioIntentada();
        int[] resultat = new int[2];
        boolean[] marcaCombinacioSecreta = new boolean[4];
        boolean[] marcaCombinacioIntentada = new boolean[4];

        for (int i = 0; i < 4; i++) {
            if (intent[i] == combinacioSecreta[i]) {
                resultat[0]++;
                marcaCombinacioSecreta[i] = true;
                marcaCombinacioIntentada[i] = true;
            }
        }

        for (int i = 0; i < 4; i++) {
            if (!marcaCombinacioIntentada[i]) {
                for (int j = 0; j < 4; j++) {
                    if (!marcaCombinacioSecreta[j] && intent[i] == combinacioSecreta[j]) {
                        resultat[1]++;
                        marcaCombinacioSecreta[j] = true;
                        marcaCombinacioIntentada[i] = true;
                        break;
                    }
                }
            }
        }
        puntuacio += (resultat[0] * 2) + resultat[1];        
        
        return resultat;
    }

    public char[] demanarTirada() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix la teva tirada (4 colors, ex: RBGY): ");
        System.out.println("Opcions de colors: R (red), B (blue), G (green), M (magenta), Y (yellow), C (cyan)");
        String input = scanner.nextLine().toUpperCase();
        char[] tirada = new char[4];
        for (int i = 0; i < 4; i++) {
            tirada[i] = input.charAt(i);
        }
        return tirada;
    }

    public void guardarPartida(ArrayList<Partida> coleccioPartides) {
        coleccioPartides.add(this);
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public String getNomJugador() {
        return nomJugador;
    }

    public ArrayList<Tirada> getLlistaTirades() {
        return llistaTirades;
    }
}
