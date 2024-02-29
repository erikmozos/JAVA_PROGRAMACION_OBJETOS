package penjat;

import java.util.Scanner;



public class programaPenjat {

    private static final String[] PARAULES = {"tiroides", "elbicho", "yea", "elperi", "enlucadupeluca", "juanito", "instaladordepantalles", "paquitoxuculati", "yeah", "enteotesed"};

    private static final String[] DIBUIX_PENJAT = {

        "",

        "_______\n|     |\n|     O\n|\n|\n|_________\n",

        "_______\n|     |\n|     O\n|     |\n|\n|_________\n",

        "_______\n|     |\n|     O\n|    /|\n|\n|_________\n",

        "_______\n|     |\n|     O\n|    /|\\\n|\n|_________\n",

        "_______\n|     |\n|     O\n|    /|\\\n|    /\n|_________\n",

        "_______\n|     |\n|     O\n|    /|\\\n|    / \\\n|_________\n"

    };



    private String paraulaSecreta;

    private boolean[] lletresEncertades;

    private StringBuilder lletresEncertadesString;

    private StringBuilder lletresFallades;

    private int intentsRestants;

    private int intentsMaxims;



    public programaPenjat() {

        int indexParaula = (int) (Math.random() * PARAULES.length);

        paraulaSecreta = PARAULES[indexParaula];

        lletresEncertades = new boolean[paraulaSecreta.length()];

        lletresEncertadesString = new StringBuilder();

        for (int i = 0; i < paraulaSecreta.length(); i++) {

            lletresEncertadesString.append("-");

        }

        lletresFallades = new StringBuilder();

        intentsMaxims = DIBUIX_PENJAT.length - 1;

        intentsRestants = intentsMaxims;

    }



    public void jugar() {

        Scanner scanner = new Scanner(System.in);

        while (intentsRestants > 0 && lletresEncertadesString.indexOf("-") != -1) {

            System.out.println("Paraula: " + lletresEncertadesString.toString());

            System.out.println("Errors: " + lletresFallades.toString());

            System.out.println(DIBUIX_PENJAT[intentsMaxims - intentsRestants]);

            System.out.println("Introdueix una lletra:");

            char lletra = scanner.nextLine().charAt(0);

            if (!Character.isLetter(lletra)) {

                System.out.println("Entrada no vàlida. Introdueix una sola lletra.");

                continue;

            }

            lletra = Character.toLowerCase(lletra);

            if (jaEsEncertada(lletra) || jaEsFallada(lletra)) {

                System.out.println("Ja has introduït aquesta lletra. Prova amb una altra.");

                continue;

            }

            if (paraulaSecreta.indexOf(lletra) != -1) {

                actualitzarLletresEncertades(lletra);

                System.out.println("Encertat!");

            } else {

                intentsRestants--;

                lletresFallades.append(lletra).append(" ");

                System.out.println("Incorrecte. Intenta-ho de nou.");

            }

        }

        if (lletresEncertadesString.indexOf("-") == -1) {

            System.out.println("Has guanyat. La paraula era: " + paraulaSecreta);

        } else {

            System.out.println("Has perdut. La paraula era: " + paraulaSecreta);

        }

    }



    private boolean jaEsEncertada(char lletra) {

        return paraulaSecreta.indexOf(lletra) != -1 && lletresEncertades[paraulaSecreta.indexOf(lletra)];

    }



    private boolean jaEsFallada(char lletra) {

        return lletresFallades.indexOf(Character.toString(lletra)) != -1;

    }



    private void actualitzarLletresEncertades(char lletra) {

        for (int i = 0; i < paraulaSecreta.length(); i++) {

            if (paraulaSecreta.charAt(i) == lletra) {

                lletresEncertades[i] = true;

                lletresEncertadesString.setCharAt(i, lletra);

            }

        }

    }



    public static void main(String[] args) {

        programaPenjat joc = new programaPenjat();

        joc.jugar();

    }

}