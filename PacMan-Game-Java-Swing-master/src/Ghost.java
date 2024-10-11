
import java.util.Random;

public class Ghost extends Character {
	private static final long serialVersionUID = 1L;
	public boolean outsideCentralBox;
	// Aplicamos el patron Singleton
	private StrategyGhost strategyGhost = RightLeftMoves.RightMoves.getInstance();


	public Ghost(double startingPointX, double startingPointY) {
		super(startingPointX, startingPointY);
		mustChangeDirection = false;
		outsideCentralBox = false;
	}

	public void move() {
		// get outside the box;
		if (!outsideCentralBox) {
			deltaX = 0;
			deltaY = -1;
			this.x = x + deltaX;
			this.y = y + deltaY;
			if (this.y == 140) {
				outsideCentralBox = true;
			}
			return;
		}
		this.strategyGhost.randomChangeDirection(this); //<----- Acá debería usarse el Strategy !!!
		super.move();
		if (eatPacMan()) {
			this.board.restart();
			outsideCentralBox = false;
		}

		repaint();

	}

	private boolean eatPacMan() {
		return this.board != null
				? Math.sqrt(Math.pow(this.x - this.board.pacman.x, 2) + Math.pow(this.y - this.board.pacman.y, 2)) < 15
				: false;
	}

		


	public void stopTimer() {
		super.stopTimer();
	}

	@Override
	protected void onNonStucked() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onStucked() {
		// TODO Auto-generated method stub
			mustChangeDirection = true;
	
	}
	
	
	@Override
	protected void onOutOfRange() {
		if (this.x + deltaX < 0 && Yi + 1 != 14) {
		deltaX = 1;
	}
	if (this.y + deltaY < 11 ) {
		Random rnd = new Random();
		int i = rnd.nextInt(87);
		i = i % 3;
		switch (i) {
		case 0:
			this.setMoveDown();
			break;
		case 1:
			this.setMoveRight();
			break;
		case 2:
			this.setMoveLeft();
			break;
		}
	}
		
		// TODO Auto-generated method stub
		
	}

}
