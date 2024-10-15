package facultad;

public class Alumno extends Persona {
	private int legajo;
	private String materiaAprobada;
	private double nota;

	public Alumno(int dni, String nombre, String apellido, int edad, int legajo, String materiasAprobadas,
			double nota) {
		super(dni, nombre, apellido, edad);
		this.legajo = legajo;
		this.materiaAprobada = materiasAprobadas;
		this.nota = nota;

	}

	public String getMateriaAprobada() {
		return materiaAprobada;
	}

	public double getNota() {
		return nota;
	}

	public int getLegajo() {
		return legajo;
	}

	@Override
	public String toString() {
		return "Legajo:" + legajo + ", nombre:" + nombre + ", apellido:" + apellido + ", edad:" + edad
				+ ", materiaAprobada:" + materiaAprobada + ", notaAprobacion:" + nota + ".\n";
	}
}
