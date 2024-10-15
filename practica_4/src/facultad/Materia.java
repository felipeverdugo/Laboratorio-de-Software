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

		Alumno alumno1 = new Alumno(12345678, "Juan", "Pérez", 21, 1001, "Matemáticas", 9.0);
		Alumno alumno2 = new Alumno(87654321, "Ana", "Gómez", 22, 1002, "Física", 8.5);
		Alumno alumno3 = new Alumno(11223344, "Pedro", "García", 23, 1003, "Química", 7.5);
		Alumno alumno4 = new Alumno(22334455, "María", "López", 20, 1004, "Biología", 6.8);
		Alumno alumno5 = new Alumno(33445566, "Sofía", "Rodríguez", 24, 1005, "Historia", 9.5);
		Alumno alumno6 = new Alumno(44556677, "Lucas", "Martínez", 19, 1006, "Geografía", 7.2);
		Alumno alumno7 = new Alumno(55667788, "Carla", "Fernández", 25, 1007, "Filosofía", 8.3);
		Alumno alumno8 = new Alumno(66778899, "Miguel", "Díaz", 21, 1008, "Literatura", 7.0);
		Alumno alumno9 = new Alumno(77889900, "Lucía", "Ramírez", 22, 1009, "Inglés", 6.9);

		matematica.agregarPersona(alumno1);
		matematica.agregarPersona(alumno2);
		matematica.agregarPersona(alumno3);
		matematica.agregarPersona(alumno4);
		matematica.agregarPersona(alumno5);
		matematica.agregarPersona(alumno6);
		matematica.agregarPersona(alumno7);
		matematica.agregarPersona(alumno8);
		matematica.agregarPersona(alumno9);
		;

		List<Persona> listaAlumnos = matematica.getNomina();

		listaAlumnos.sort(Comparator.comparing(Persona::getDni));

		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}

	}

}
