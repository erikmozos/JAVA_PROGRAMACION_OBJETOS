package examendeganesdemorir;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Persona {
	
	 private String dni;
	    private String nombre;
	    private int edad;
	    private LocalDate fechaAtencion;
	    private LocalTime horaAtencion;
	    private boolean atendidoCorrectamente;

	    public Persona(String dni, String nombre, int edad) {
	        this.setDni(dni);
	        this.setNombre(nombre);
	        this.setEdad(edad);
	        this.setAtendidoCorrectamente(false);
	    }

	    public void atender() {
	        this.fechaAtencion = LocalDate.now();
	        this.horaAtencion = LocalTime.now();
	        this.setAtendidoCorrectamente(Math.random() < 0.6);
	    }

	    public String toString() {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	        return getDni() + "\t" + getNombre() + "\t" + getEdad() + "\t" +
	               fechaAtencion.format(formatter) + "\t" + horaAtencion + "\t" +
	               (isAtendidoCorrectamente() ? "Sí" : "No");
	    }

		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public boolean isAtendidoCorrectamente() {
			return atendidoCorrectamente;
		}

		public void setAtendidoCorrectamente(boolean atendidoCorrectamente) {
			this.atendidoCorrectamente = atendidoCorrectamente;
		}

}
