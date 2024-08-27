package geometria;

public class Rectangulo extends FiguraGeometrica {
	int alto;
	int ancho;

	public Rectangulo(String color, int alto, int ancho) {
		super(color);
		this.alto = alto;
		this.ancho = ancho;
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return alto * ancho;
	}

	@Override
	public void dibujar() {
		System.out.println("se dibuja un rectangulo de alto : " + this.alto + " y ancho : " + this.ancho);

	}

}
