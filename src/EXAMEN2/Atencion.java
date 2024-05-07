
package EXAMEN2;
import java.time.LocalDate;
import java.time.LocalTime;
public class Atencion {
	private Persona persona;
    private LocalDate fecha;
    private LocalTime hora;
    private boolean servidaCorrectamente;

    public Atencion(Persona persona, LocalDate fecha, LocalTime hora, boolean servidaCorrectamente) {
        this.persona = persona;
        this.fecha = fecha;
        this.hora = hora;
        this.servidaCorrectamente = servidaCorrectamente;
    }

    public Persona getPersona() {
        return persona;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public boolean isServidaCorrectamente() {
        return servidaCorrectamente;
    }

    @Override
    public String toString() {
        return String.format("%s, Día de atención: %s, Hora de atención: %s, Servida correctamente: %s",
                persona.toString(), fecha, hora, servidaCorrectamente ? "Sí" : "No");
    }
}
