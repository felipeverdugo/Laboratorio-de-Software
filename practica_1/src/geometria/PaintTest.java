package geometria;

import java.util.Comparator;
import java.util.List;

public class PaintTest {

	public static void main(String[] args) {
		Paint paint = new Paint();
		paint.init();
		List<FiguraGeometrica> sortByArea = paint.getPaleta();

		sortByArea.sort(Comparator.comparing((figuraGeometrica) -> figuraGeometrica.area()));

		for (FiguraGeometrica figuraGeometrica : sortByArea) {
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
