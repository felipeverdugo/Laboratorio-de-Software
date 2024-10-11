import java.util.Random;

public class RightLeftMoves {
	// Usamos claves anidadas
	
	static class RightMoves implements StrategyGhost{
		
	private static RightMoves rightMoves;
	
	
	private RightMoves() {
		// TODO Auto-generated constructor stub
	}
	
	public static RightMoves getInstance() {
		if (rightMoves == null) {
			return new RightMoves();
		}
		return rightMoves;
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
				ghost.setMoveRight();
				break;
			case 1:
				ghost.setMoveRight();
				break;


			}
		}
	}
	
	}
	
	
	
	
	static class LeftMoves implements StrategyGhost{
		
	private static LeftMoves leftMoves;
	
	
	private LeftMoves() {
		// TODO Auto-generated constructor stub
	}
	
	public static LeftMoves getInstance() {
		if (leftMoves == null) {
			return new LeftMoves();
		}
		return leftMoves;
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
				ghost.setMoveLeft();
				break;
			case 1:
				ghost.setMoveLeft();
				break;


			}
		}
	}
	
	}

	
	

}
