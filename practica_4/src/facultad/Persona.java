package facultad;

public class Persona {
	protected int dni;
	protected String nombre;
	protected String apellido;

	public Persona(int dni, String nombre, String apellido) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getDni() {
		return dni;
	}
}
