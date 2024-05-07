package mastermind;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Mastermind {
    public static void main(String[] args) {
        ArrayList<Partida> coleccioPartides = new ArrayList<>();
        try {
            Partida partida = new Partida("Jugador1");
            partida.jugar();
            partida.guardarPartida(coleccioPartides);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
