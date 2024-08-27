package vacuna;

public class VacunaPatogenoIntegro extends Vacuna {
	private String nombreVirus;

	public VacunaPatogenoIntegro(String marca, String paisOrigen, String enfermedad, int cantDosis,
			String nombreVirus) {
		super(marca, paisOrigen, enfermedad, cantDosis);
		this.nombreVirus = nombreVirus;

		// TODO Auto-generated constructor stub
	}

	public String getNombreVirus() {
		return nombreVirus;
	}

	public void setNombreVirus(String nombreVirus) {
		this.nombreVirus = nombreVirus;
	}

}
