package vacuna;

public class Vacuna {
	private String marca;
	private String paisOrigen;
	private String enfermedad;
	private int cantDosis;

	public Vacuna(String marca, String paisOrigen, String enfermedad, int cantDosis) {
		super();
		this.marca = marca;
		this.paisOrigen = paisOrigen;
		this.enfermedad = enfermedad;
		this.cantDosis = cantDosis;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	public int getCantDosis() {
		return cantDosis;
	}

	public void setCantDosis(int cantDosis) {
		this.cantDosis = cantDosis;
	}

	@Override
	public String toString() {
		// Imprimo los detalles de la vacuna
		StringBuffer sb = new StringBuffer();

		sb.append("Nombre: ").append(marca).append(", Pais ").append(paisOrigen).append(", Enfermedad : ")
				.append(enfermedad).append(", Cantidad de dosis : ").append(cantDosis);
		return sb.toString();

	}

}
