import java.io.*;
public class exgtp1 {

	public static void main(String[] args) {
		
		try {
		File f = new File("input.txt");
		f.createNewFile();
		Reader in = new FileReader(f);
		Writer out = new FileWriter(".\\output.txt");
		copiaDades(in, out);
		}catch (Exception e) {
			System.out.println("Huhim");
		}
		
		
		/*try {
			Filereader in = new FileInputStream(".\\input.txt");
			
			OutputStream ou = new FileOutputStream(".\\output.txt");
			
		}catch(Exception e) {
			System.out.println("Huh");
		}*/

	}

	private static void copiaDades(Reader in, Writer out) {
		
		try {
			char[] dades = new char[100];
			int llegits = 0;
			while (-1 != (llegits = in.read(dades)))
			out.write(dades,0,llegits);
			out.close();
			in.close();
			} catch (IOException e) { 
				System.out.println("Huh");
			}
		
	}



}
