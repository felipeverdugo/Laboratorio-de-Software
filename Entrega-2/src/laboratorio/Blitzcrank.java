package laboratorio;

import robocode.JuniorRobot;

public class Blitzcrank extends JuniorRobot {
	private Estratega estratega = EstrategaSolida.getEstratega();

	@Override
	public void run() {
//		this.setStrategy(new NoHitStrategy());
		setColors(black, black, black, black, black);
		this.estratega.strategyRun(this).run(this);

	}

	public Estratega getEstratega() {
		return estratega;
	}

	public void setEstratega(Estratega estratega) {
		this.estratega = estratega;
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	@Override
	public void onScannedRobot() {
		this.estratega.strategyScann(this).onScannedRobot(this);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	@Override
	public void onHitByBullet() {
		this.estratega.strategyHit(this).onHitByBullet(this);
	}

	/**
	 * onHitWall: What to do when you hit a wall
	 */
	@Override
	public void onHitWall() {
		this.estratega.strategyScann(this).onHitWall(this);
	}
}