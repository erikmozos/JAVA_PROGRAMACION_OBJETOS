
import java.io.*;
import java.util.HashMap;


public class temperatures {

	public static void main(String[] args) {

		File f = new File("temperatures.txt");
		String[] nomMesos = null;
		String[] temperatures = null;
		String liniaLlegida = "";
		HashMap<String,Double> mitjanes = new HashMap<>();
		int numLinies=0;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			nomMesos = br.readLine().split(","); //  per separar per comes
			
		}catch(Exception e) {
			System.out.println("Huh");
		}
	}

}
