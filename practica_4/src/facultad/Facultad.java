package facultad;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Facultad {
	private List<Alumno> alumnos;

	public Facultad() {
		super();
		this.alumnos = new ArrayList<Alumno>();
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public boolean agregarAlumno(Alumno alumno) {
		return alumnos.add(alumno);
	}

	public Alumno alumnoMayorNota() {
		return alumnos.stream().max((a1, a2) -> Double.compare(a1.getNota(), a2.getNota())).orElse(null);

	}

	public void imprimir2Estudiantes() {
		alumnos.stream().limit(2).forEach(alumno -> System.out.println(alumno.toString()));

	}

	public Alumno alumnosDelCurso(String curso) {
		return alumnos.stream().filter(alumno -> alumno.getMateriaAprobada() == curso).findFirst().orElse(null);
	}

	public List<Alumno> alumnoPmas6() {
		return alumnos.stream()
				.filter(alumno -> alumno.getNombre().toLowerCase().startsWith("p") && alumno.getNombre().length() <= 6)
				.collect(Collectors.toList());

	}

	public List<Alumno> ordenarPorNota() {
		return alumnos.stream().sorted(Comparator.comparingDouble(Alumno::getNota)).toList();
	}

	// this.listaAlumnos.sort(new Comparator<Alumno>(){
	//
	// @Override
	// public int compare(Alumno o1, Alumno o2) {
	// if (o1.getNotaAprobacion() < o2.getNotaAprobacion())
	// return 1;
	// else if (o1.getNotaAprobacion() > o2.getNotaAprobacion())
	// return -1;
	// else
	// return 0;
	// }
	// });
	//
	// listaAlumnos.sort((a1,a2) -> Double.compare(a2.getNotaAprobacion(),
	// a1.getNotaAprobacion()));
	//
	// listaAlumnos.sort(Comparator.comparingDouble((Alumno
	// a)->a.getNotaAprobacion()).reversed());
	//

}
