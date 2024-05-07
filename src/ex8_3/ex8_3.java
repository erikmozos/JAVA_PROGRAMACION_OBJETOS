package ex8_3;
import java.io.FileOutputStream;
import java.io.IOException;
public class ex8_3 {

	    public static void llencarIOException() throws IOException {
	        throw new IOException("Això és una IOException llançada des del mètode llencarIOException");
	    }

	    public static void llencarNullPointerException() {
	        throw new NullPointerException("Això és una NullPointerException llançada des del mètode llencarNullPointerException");
	    }

	    public static void main(String[] args) {
	    
	    	try {
	    		aña();
	    		FileOutputStream f = new FileOutputStream ("arxiu.txt");
	    		f.close();
	    	}
	         catch (IOException e) {
	            System.out.println("Capturat una IOException: " + e.getMessage());
	        }
	        catch(NullPointerException e){	        
	        System.out.println("Després de llançar la NullPointerException");
	        }
	        
	        
	    } 
	    
	    public static void aña() {
	    	Cercle [] cercle = null;
	    	
	    	for(int i=0; i > 10; i++) {
	    		System.out.println(cercle[i]);
	    	}
	    }
	    
	    
	}


