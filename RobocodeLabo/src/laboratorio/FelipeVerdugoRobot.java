package laboratorio;

import robocode.JuniorRobot;

public class FelipeVerdugoRobot extends JuniorRobot {
	private StrategyJuniorRobot strategy;

	@Override
	public void run() {
		this.setStrategy(new NoHitStrategy());
		setColors(black, black, black, black, black);
		strategy.run(this);

	}

	public StrategyJuniorRobot getStrategy() {
		return strategy;
	}

	public void setStrategy(StrategyJuniorRobot strategy) {
		this.strategy = strategy;
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	@Override
	public void onScannedRobot() {
		strategy.onScannedRobot(this);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	@Override
	public void onHitByBullet() {
		strategy.onHitByBullet(this);
	}

	/**
	 * onHitWall: What to do when you hit a wall
	 */
	@Override
	public void onHitWall() {
		strategy.onHitWall(this);
	}
}