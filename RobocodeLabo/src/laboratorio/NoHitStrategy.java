package laboratorio;

import robocode.JuniorRobot;

public class NoHitStrategy implements StrategyJuniorRobot {
	boolean movingForward;

	@Override
	public void run(JuniorRobot robot) {

		robot.turnAheadLeft(40, 70);

	}

	public void spinRight(JuniorRobot robot) {
		robot.turnBackRight(60, 70);
	}

	public void onHitWall(JuniorRobot robot) {
		// Bounce off!
		reverseDirection(robot);
	}

	/**
	 * reverseDirection: Switch from ahead to back &amp; vice versa
	 */
	public void reverseDirection(JuniorRobot robot) {

		if (movingForward) {
			robot.back(200);
			robot.turnGunTo(180);
			movingForward = false;
		} else {
			robot.ahead(200);
			movingForward = true;
		}
	}

	@Override
	public void onHitByBullet(JuniorRobot robot) {
		robot.turnGunTo(robot.hitByBulletAngle);
		robot.fire();
		this.spinRight(robot);

	}

	@Override
	public void onScannedRobot(JuniorRobot robot) {
		// TODO Auto-generated method stub
		robot.doNothing();

	}

}
