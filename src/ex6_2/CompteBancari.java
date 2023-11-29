package ex6_2;

public class CompteBancari {
	
	private String dniTitular;
	private String nomTitular;
	private double saldo;
	
	
	//constructor
	
	public CompteBancari() {
		
	}
	
	public CompteBancari(String dniTitular, String nomTitular, int saldo) {
		this.dniTitular = dniTitular;
		this.nomTitular = nomTitular;
		this.saldo = saldo;
	}
	
	public void ingressar() {
		
	}
	
	public void treuresaldo() {
		
	}
	
	public void mostrarsaldo(){
		
	}

	
	
	//getter setter
	
	public String getDniTitular() {
		return dniTitular;
	}

	public void setDniTitular(String dniTitular) {
		this.dniTitular = dniTitular;
	}

	public String getNomTitular() {
		return nomTitular;
	}

	public void setNomTitular(String nomTitular) {
		this.nomTitular = nomTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	

}
