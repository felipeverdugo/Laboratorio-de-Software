package facultad;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Materia {
	private String nombre;
	private List<Persona> nomina;

	public Materia(String nombre) {
		super();
		this.nombre = nombre;
		this.nomina = new ArrayList<Persona>();
	}

	public List<Persona> getNomina() {
		return nomina;
	}

	public boolean agregarPersona(Persona persona) {
		return nomina.add(persona);
	}

	public String getNombre() {
		return nombre;
	}

	public static void main(String[] args) {
		Materia matematica = new Materia("Matemáticas");

		Alumno alumno1 = new Alumno(12345678, 1001, "Juan", "Pérez");
		Alumno alumno2 = new Alumno(87654321, 1002, "Ana", "Gómez");
		Alumno alumno3 = new Alumno(23456789, 1003, "Carlos", "Martínez");
		Alumno alumno4 = new Alumno(98765432, 1004, "Laura", "Fernández");
		Alumno alumno5 = new Alumno(34567890, 1005, "Sofía", "López");
		Alumno alumno6 = new Alumno(87654322, 1006, "Jorge", "Ramírez");
		Alumno alumno7 = new Alumno(45678901, 1007, "María", "Sánchez");
		Alumno alumno8 = new Alumno(76543219, 1008, "Ricardo", "Mendoza");
		Alumno alumno9 = new Alumno(56789012, 1009, "Valeria", "García");
		Alumno alumno10 = new Alumno(65432198, 1010, "Lucía", "Jiménez");

		matematica.agregarPersona(alumno1);
		matematica.agregarPersona(alumno2);
		matematica.agregarPersona(alumno3);
		matematica.agregarPersona(alumno4);
		matematica.agregarPersona(alumno5);
		matematica.agregarPersona(alumno6);
		matematica.agregarPersona(alumno7);
		matematica.agregarPersona(alumno8);
		matematica.agregarPersona(alumno9);
		matematica.agregarPersona(alumno10);

		List<Persona> listaAlumnos = matematica.getNomina();

		listaAlumnos.sort(Comparator.comparing(Persona::getDni));

		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}

	}

}
