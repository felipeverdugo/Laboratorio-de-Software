package geometria;

public class Circulo extends FiguraGeometrica {
	private int radio;

	public Circulo(String color, int radio) {
		super(color);
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return (int) (Math.PI * Math.pow(this.getRadio(), 2));
	}

	@Override
	public void dibujar() {
		System.out.println("se dibuja un circulo de color : " + this.getColor() + " y radio : " + this.getRadio());

	}
}
