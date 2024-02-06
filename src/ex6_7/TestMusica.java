package ex6_7;
import java.util.Scanner;

public class TestMusica {

	public static void main(String[] args) {
		//Musica mus = new Musica(); No es pot crear un objecta si la classe es abstract
		
		Scanner sc = new Scanner(System.in);
		int duradaMp3 = 0 ;
		int duradaOgg = 0;
		
		
		System.out.println("Escriu la durada del mp3");
		duradaMp3 = sc.nextInt();
		System.out.println("Escriu la durada del mp3");
		duradaOgg = sc.nextInt();
		
		Mp3 m = new Mp3(duradaMp3);
		m.reproduir();
		Ogg o = new Ogg(duradaOgg);
		o.reproduir();
		
		}
	
		
	
}
