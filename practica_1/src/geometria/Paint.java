package geometria;

import java.util.ArrayList;
import java.util.List;

public class Paint {
	private List<FiguraGeometrica> paleta;

	public Paint() {
		// TODO Auto-generated constructor stub
	}

	void init() {
		this.paleta = new ArrayList<FiguraGeometrica>(4);
		this.paleta.add(new Circulo("azul", 2));
		this.paleta.add(new Circulo("amarillo", 3));
		this.paleta.add(new Rectangulo("verde", 2, 3));
		this.paleta.add(new Rectangulo("rojo", 4, 10));

		// TODO Auto-generated constructor stub
	}

	public void setPaleta(List<FiguraGeometrica> paleta) {
		this.paleta = paleta;
	}

	public List<FiguraGeometrica> getPaleta() {
		return paleta;
	}

}
