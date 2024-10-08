package geometria;

public abstract class FiguraGeometrica {
	private String color;

	public FiguraGeometrica(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract void dibujar();

	public abstract int area();

}
