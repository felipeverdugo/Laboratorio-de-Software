package geometria;

public class PaintTest {

	public static void main(String[] args) {
		Paint paint = new Paint();
		paint.init();

		for (FiguraGeometrica figuraGeometrica : paint.getPaleta()) {
//			figuraGeometrica.dibujar();
			System.out.println(
					"El area del " + figuraGeometrica.getClass().getSimpleName() + " es " + figuraGeometrica.area());
			if (figuraGeometrica instanceof Circulo) {
				Circulo circulo = (Circulo) figuraGeometrica;
				System.out.println("El radio del Circulo es " + circulo.getRadio());
			}
		}
	}

}
