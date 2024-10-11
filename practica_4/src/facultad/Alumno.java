package facultad;

public class Alumno extends Persona {
	private int legajo;

	public Alumno(int dni, int legajo, String nombre, String apellido) {
		super(dni, nombre, apellido);
		this.legajo = legajo;
		// TODO Auto-generated constructor stub
	}

	public int getLegajo() {
		return legajo;
	}

	@Override
	public String toString() {
		return nombre + " " + apellido + " (DNI: " + dni + ")  (Legajo: " + legajo + ")";
	}

}
