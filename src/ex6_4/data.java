package ex6_4;

public class data {

	private int dia;
	private int mes;
	private int any;
	private boolean validacio;

	public data() {

	}

	public data(int dia, int mes, int any) {
		boolean anyvalid = false, diavalid= false, mesvalid=false, bisiesto=false;

		if (any > 0) {
			if((any % 4 == 0 && any % 100 != 0) || any % 400 == 0) {
					anyvalid = true;
					bisiesto = true;
			}	if((any % 4 != 0 && any % 100 == 0) || any % 400 != 0) {
						anyvalid = true;
				}
			
		}else {
			anyvalid=false;
		}
		
		
		if (dia > 0 && dia <= 31) {
			if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia <=30 && dia > 0) ) {
				diavalid = true;
			}
			if((mes == 1 || mes == 3 || mes == 5  || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia <=31 && dia > 0)) {
				diavalid = true;
			}
			if(mes == 2 && bisiesto && dia < 30) {
				diavalid = true;
			}
			if(mes == 2 && bisiesto == false && dia < 29) {
				diavalid = true;
			}
			
		}else {
			diavalid=false;
		}
		
		
		
		
		if(mes > 0 && mes <= 12) {

			mesvalid = true;

		}else {
			mesvalid = false;
		}

		if(diavalid == true && mesvalid == true && anyvalid == true) {

			this.dia = dia;
			this.mes = mes;
			this.any = any;
			this.validacio = true;
			System.out.println("Data vàlida");
		}else {
			System.out.println("Data invàlida");
			this.validacio = false;
			
		}

	}

	public boolean isValidacio() {
		return validacio;
	}

	public void setValidacio(boolean validacio) {
		this.validacio = validacio;
	}

	public void dema() {
		
		if(this.dia == 31 || this.dia == 30 || this.dia == 29 || this.dia == 28) {
		if(this.dia == 31 && (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12)) {
			this.dia = 1;
			if(this.mes == 12) {
				this.mes = 1;
				this.any++;
			}else {
				this.mes ++;
			}
		}
		
		if(this.dia == 30 && (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11)) {
			this.dia = 1;
			this.mes++;
		}
		
		if(((this.any % 4 == 0 && this.any % 100 != 0) || this.any % 400 == 0)&& (this.mes == 2) ) {
			if(this.dia == 29) {
				this.mes++;
				this.dia = 1;
			}
		
		}
		if(((this.any % 4 != 0 && this.any % 100 == 0) || this.any % 400 != 0)&& (this.mes == 2) ) {
			if(this.dia == 28) {
				this.mes++;
				this.dia = 1;
			}
		
		}
		}else {
			this.dia++;
		}
		

	}





	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setAny(int any) {
		this.any = any;
	}

	public int getDia() {
		return dia;
	}


	public int getMes() {
		return mes;
	}

	public int getAny() {
		return any;
	}



}
