import java.awt.Graphics;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public abstract class Character extends JPanel {

	protected static final long serialVersionUID = 1L;
	protected double x;
	protected int rounds;
	protected double y;
	protected int deltaX;
	protected int deltaY;

	double Xi, Yi;
	protected ImageIcon image;
	Board board;

	public boolean mustChangeDirection;
	protected Timer timer;
	
	public Character(double startingPointX, double startingPointY) {
		this.zeroDeltaXY();
		
		
		this.x = startingPointX;
		this.y = startingPointY;
		this.image = leftIcone();
	}

	public void paint(Graphics g) {
		super.paint(g);
		image.paintIcon(this, g, (int) x, (int) y);
	}
	
	
	// Pase este codigo a character (que estaba en ghost) para poder usarlo en las clases que la hereden
	
	/**
	 * initial the creature direction
	 */	
	public void zeroDeltaXY(){
		this.deltaX=Direcciones.STAY.x;
		this.deltaY=Direcciones.STAY.y;
	}
	
	
	
	
	/**
	 * This function sets the creature direction to be up 
	 */	
	public void setMoveUp(){
		deltaX=Direcciones.UP.x; deltaY=Direcciones.UP.y;
	}
	/**
	 * This function sets the creature direction to be down 
	 */	
	public void setMoveDown(){
		deltaX=Direcciones.DOWN.x; deltaY=Direcciones.DOWN.y;
	}
	/**
	 * This function sets the creature direction to be right 
	 */	
	public void setMoveRight(){
		deltaX=Direcciones.RIGTH.x; deltaY=Direcciones.RIGTH.y;
	}
	/**
	 * This function sets the creature direction to be left 
	 */	
	public void setMoveLeft(){
		deltaX=Direcciones.LEFT.x; deltaY=Direcciones.LEFT.y;
	}


	protected ImageIcon leftIcone() {
		return null;
	}

	public void setBoard(Board b) {
		board = b;
		
	}

	public void move() {

			
		// if you didnt set the board yat return
		if (this.board==null)
			return;

	
		double squareHeight = Board.MAP_HEIGHT / 31;
		double squareWidth = Board.MAP_WIDTH / 28;
		Xi = (this.x + deltaX - squareWidth / 2) / squareWidth;
		Yi = (this.y + deltaY - squareHeight / 2) / squareHeight;

		this.onOutOfRange();

		if (loop(Xi, Yi))
			return;

		if (board.isClear((int) Yi + 1, (int) Xi + 1)) {
			this.x = x + deltaX;
			this.y = y + deltaY;
			this.onNonStucked();
		
		} else this.onStucked();

	}

	private boolean loop(double Xi, double Yi) {
		boolean ans = false;
		if ((int) Yi + 1 == 14 && ((int) Xi + 2 == 0 || Xi + 1 == 28)) {
			if (Xi + 1 == 28)
				this.x = -9;
			else
				this.x = 411.5;
			ans = true;
		}
		return ans;
	}


	public void startingPoint(double d, double e) {
		this.x = d;
		this.y = e;
		this.zeroDeltaXY();
	}

	public void stopTimer() {
		timer.stop();
	}

	public void startTimer() {
		timer.restart();
	}

	protected abstract void onNonStucked();
	
	protected abstract void onStucked();
	
	protected abstract void onOutOfRange();

	
	
	
	
	
	
	
	
	
	
	
	
	
}
