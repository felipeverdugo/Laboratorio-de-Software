package laboratorio;



public interface StrategyJuniorRobot {

	void run(Blitzcrank aJuniorRobot);

	void onHitWall(Blitzcrank aJuniorRobot);

	void onHitByBullet(Blitzcrank aJuniorRobot);

	void onScannedRobot(Blitzcrank aJuniorRobot);

}
