package vacuna;

public class VacunaSubunidadAntigenica extends Vacuna {

	private int cantAntigenos;
	private String tipoDeProceso;

	public VacunaSubunidadAntigenica(String marca, String paisOrigen, String enfermedad, int cantDosis,
			int cantAntigenos, String tipoDeProceso) {
		super(marca, paisOrigen, enfermedad, cantDosis);
		this.cantAntigenos = cantAntigenos;
		this.tipoDeProceso = tipoDeProceso;
	}

	public int getCantAntigenos() {
		return cantAntigenos;
	}

	public String getTipoDeProceso() {
		return tipoDeProceso;
	}

	public void setCantAntigenos(int cantAntigenos) {
		this.cantAntigenos = cantAntigenos;
	}

	public void setTipoDeProceso(String tipoDeProceso) {
		this.tipoDeProceso = tipoDeProceso;
	}

}
