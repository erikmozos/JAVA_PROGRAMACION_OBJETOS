package ex10_4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ex10_4 {

	public static void main(String[] args) throws IOException {
		FileReader in = new FileReader("C:\\\\Users\\\\emozo\\\\Downloads\\\\Curriculum Erik 2024 (2) (1) (1) (1).pdf");
		FileWriter out = new FileWriter("C:\\\\Users\\\\emozo\\\\Downloads\\\\10_4");
		copiaDades(in, out);
		}

		private static void copiaDades(FileReader in, FileWriter out) {
		try {
		char[] dades = new char[100];
		int llegits = 0;
		while (-1 != (llegits = in.read(dades)))
		out.write(dades,0,llegits);
		out.close();
		in.close();
		} catch (IOException e) {
		System.out.println("Error");
}
}
}