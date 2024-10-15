package facultad;

public class TestFacultad {

	public static void main(String[] args) {
		Facultad facultad = new Facultad();

		Alumno alumno1 = new Alumno(12345678, "Juan", "Pérez", 21, 1001, "Historia", 9.0);
		Alumno alumno2 = new Alumno(87654321, "Ana", "Gómez", 22, 1002, "Física", 8.5);
		Alumno alumno3 = new Alumno(11223344, "Pedro", "García", 23, 1003, "Química", 7.5);
		Alumno alumno4 = new Alumno(22334455, "María", "López", 20, 1004, "Historia", 6.8);
		Alumno alumno5 = new Alumno(33445566, "Sofía", "Rodríguez", 24, 1005, "Historia", 9.5);
		Alumno alumno6 = new Alumno(44556677, "Lucas", "Martínez", 19, 1006, "Geografía", 7.2);
		Alumno alumno7 = new Alumno(55667788, "Carla", "Fernández", 25, 1007, "Filosofía", 8.3);
		Alumno alumno8 = new Alumno(66778899, "Miguel", "Díaz", 21, 1008, "Literatura", 7.0);
		Alumno alumno9 = new Alumno(77889900, "Lucía", "Ramírez", 22, 1009, "Historia", 6.9);

		facultad.agregarAlumno(alumno1);
		facultad.agregarAlumno(alumno2);
		facultad.agregarAlumno(alumno3);
		facultad.agregarAlumno(alumno4);
		facultad.agregarAlumno(alumno5);
		facultad.agregarAlumno(alumno6);
		facultad.agregarAlumno(alumno7);
		facultad.agregarAlumno(alumno8);
		facultad.agregarAlumno(alumno9);

		for (Alumno alumno : facultad.getAlumnos()) {
			System.out.println(alumno);
		}

		System.out.println();

		System.out.println("El alumno con mayor nota es : " + facultad.alumnoMayorNota());

		facultad.imprimir2Estudiantes();

		System.out.println(facultad.alumnosDelCurso("Historia"));

		System.out.println(facultad.alumnoPmas6());

		System.out.println(facultad.ordenarPorNota());
	}

}
