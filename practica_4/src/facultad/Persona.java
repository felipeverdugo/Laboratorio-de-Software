package facultad;

public class Persona {
	protected int dni;
	protected String nombre;
	protected String apellido;
	protected int edad;

	public Persona(int dni, String nombre, String apellido, int edad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
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
