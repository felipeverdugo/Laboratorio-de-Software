package laboratorio;

import robocode.JuniorRobot;

public interface StrategyJuniorRobot {

	void run(JuniorRobot aJuniorRobot);

	void onHitWall(JuniorRobot aJuniorRobot);

	void onHitByBullet(JuniorRobot aJuniorRobot);

	void onScannedRobot(JuniorRobot aJuniorRobot);

}
