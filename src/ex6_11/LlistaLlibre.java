package ex6_11;

public class LlistaLlibre extends Llibre{ 
	
	private Llibre[] llibres;
    private int numLlibres;

    public LlistaLlibre() {
        super();
    }

    public LlistaLlibre(Llibre[] llibres, int numLlibres) {
        this.llibres = llibres;  // Utiliza "this" para referenciar el campo de la clase
        this.numLlibres = numLlibres;
    }

    public void afegirLlibre(Llibre llibre) {
        if (numLlibres < llibres.length) {
            llibres[numLlibres] = llibre;
            numLlibres++;
            System.out.println("Llibre afegit.");
        } else {
            System.out.println("No es pot afegir més llibres");
        }
    }
	    
	  public void eliminarLlibre(int index) {
	        if (index >= 0 && index < numLlibres) {
	            for (int i = index; i < numLlibres - 1; i++) {
	                llibres[i] = llibres[i + 1];
	            }
	            numLlibres--;
	            System.out.println("Llibre eliminat.");
	        } else {
	            System.out.println("Error.");
	        }
	    }

	 
	    public void mostrarLlibres() {
	        System.out.println("Llista de llibres:");
	        for (int i = 0; i < numLlibres; i++) {
	            System.out.println((i + 1) + ". " + llibres[i]);
	        }
	    }

		public String getNumLlibres() {
			return null;
		}
	}
	
	


