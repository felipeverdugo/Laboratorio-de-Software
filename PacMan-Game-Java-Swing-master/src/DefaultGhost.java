import java.util.Random;

public class DefaultGhost implements StrategyGhost{

	@Override
	public void randomChangeDirection(Ghost ghost) {
		// TODO Auto-generated method stub

		if (ghost.mustChangeDirection) {
			ghost.mustChangeDirection = false;
			Random Rnd1 = new Random();
			Random Rnd2 = new Random();

			int i = Rnd1.nextInt(900);
			int j = Rnd2.nextInt(900);

			i = i * j;
			i = i % 4;
			switch (i) {
			case 0:
				ghost.deltaX = Direcciones.UP.x;
				ghost.deltaY = Direcciones.UP.y;
				break;
			case 1:
				ghost.deltaX = Direcciones.DOWN.x;
				ghost.deltaY = Direcciones.DOWN.y;
				break;
			case 2:
				ghost.deltaX = Direcciones.LEFT.x;
				ghost.deltaY = Direcciones.LEFT.y;
				break;
			case 3:
				ghost.deltaX = Direcciones.RIGTH.x;
				ghost.deltaY = Direcciones.RIGTH.y;
				break;

			}
		}
	}

}
