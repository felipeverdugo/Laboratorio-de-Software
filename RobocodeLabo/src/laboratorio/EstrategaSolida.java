package laboratorio;

public class EstrategaSolida implements Estratega {

	private static final EstrategaSolida estratega = new EstrategaSolida();
	private static final StrategyJuniorRobot ataque = new EstrategaSolida.FullAgro();
	private static final StrategyJuniorRobot defensa = new EstrategaSolida.NoHitStrategy();

	@Override
	public StrategyJuniorRobot strategyRun(Blitzcrank robot) {
		// TODO Auto-generated method stub
		return ataque;
	}

	@Override
	public StrategyJuniorRobot strategyScann(Blitzcrank robot) {
		// TODO Auto-generated method stub
		return ataque;
	}

	@Override
	public StrategyJuniorRobot strategyHit(Blitzcrank robot) {
		return defensa;
	}

	@Override
	public StrategyJuniorRobot strategyWall(Blitzcrank robot) {
		// TODO Auto-generated method stub
		return defensa;
	}

	public static Estratega getEstratega() {
		return estratega;
	}

	private static class FullAgro implements StrategyJuniorRobot {

		@Override
		public void run(Blitzcrank robot) {

			robot.turnGunLeft(360);
			robot.ahead(15);
			robot.back(20);

		}

		public void onHitWall(Blitzcrank robot) {
			robot.doNothing();
		}

		@Override
		public void onHitByBullet(Blitzcrank robot) {
			robot.turnGunTo(robot.hitByBulletAngle);
			robot.fire();

		}

		@Override
		public void onScannedRobot(Blitzcrank robot) {
			robot.turnGunTo(robot.hitByBulletAngle);
			robot.fire(3);
		}

	}

	private static class NoHitStrategy implements StrategyJuniorRobot {
		boolean movingForward;

		@Override
		public void run(Blitzcrank robot) {

			robot.turnAheadLeft(40, 70);
			robot.turnGunLeft(360);

		}

		public void spinRight(Blitzcrank robot) {
			robot.turnBackRight(60, 70);
		}

		public void onHitWall(Blitzcrank robot) {
			// Bounce off!
			reverseDirection(robot);
		}

		/**
		 * reverseDirection: Switch from ahead to back &amp; vice versa
		 */
		public void reverseDirection(Blitzcrank robot) {

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
		public void onHitByBullet(Blitzcrank robot) {
//			robot.turnGunTo(robot.hitByBulletAngle);
//			robot.fire();
			this.spinRight(robot);

		}

		@Override
		public void onScannedRobot(Blitzcrank robot) {
			// TODO Auto-generated method stub
			robot.doNothing();

		}
	}
}