package vacuna;

public class VacunaGenetica extends Vacuna {
	private double tempMinima;
	private double tempMaxima;

	public VacunaGenetica(String marca, String paisOrigen, String enfermedad, int cantDosis, double tempMinima,
			double tempMaxima) {
		super(marca, paisOrigen, enfermedad, cantDosis);
		this.tempMinima = tempMinima;
		this.tempMaxima = tempMaxima;
	}

	public double getTempMinima() {
		return tempMinima;
	}

	public void setTempMinima(float tempMinima) {
		this.tempMinima = tempMinima;
	}

	public double getTempMaxima() {
		return tempMaxima;
	}

	public void setTempMaxima(float tempMaxima) {
		this.tempMaxima = tempMaxima;
	}

}
