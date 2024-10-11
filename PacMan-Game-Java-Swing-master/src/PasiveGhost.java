import java.util.Random;

public class PasiveGhost implements StrategyGhost{
	private static PasiveGhost pasiveGhost;
	
	
	private PasiveGhost() {
		// TODO Auto-generated constructor stub
	}
	
	public static PasiveGhost getInstance() {
		if (pasiveGhost == null) {
			return new PasiveGhost();
		}
		return pasiveGhost;
	}
	
	@Override
	public void randomChangeDirection(Ghost ghost) {
		// TODO Auto-generated method stub
		
		
		if (ghost.mustChangeDirection) {
			ghost.mustChangeDirection = false;
			Random Rnd1 = new Random();


			int i = Rnd1.nextInt(4);

			switch (i) {
			case 0:
				ghost.setMoveUp();
				break;
			case 1:
				ghost.setMoveDown();
				break;


			}
		}
		
	}

}
