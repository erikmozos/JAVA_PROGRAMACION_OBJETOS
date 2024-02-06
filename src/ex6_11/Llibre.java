package ex6_11;

public class Llibre {
	
	String[] autors;
	String titol;
	
	
	public Llibre() {
		super();

	}
	
	public Llibre(String[] autors, String titol) {
		super();
		this.autors = autors;
		this.titol = titol;
	}
	
	 public String getTitol() {
	        return titol;
	    }

	    public void setTitol(String titol) {
	        this.titol = titol;
	    }

	    public String[] getAutors() {
	        return autors;
	    }

	    public void setAutors(String[] autors) {
	        this.autors = autors;
	    }

	    public String toString() {
	        return "Títol: " + titol + ", Autors: " + autors;
	    }
	

}
