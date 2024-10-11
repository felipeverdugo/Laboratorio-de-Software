package laboratorio;

public interface Estratega {

	StrategyJuniorRobot strategyRun(Blitzcrank aJuniorRobot);

	StrategyJuniorRobot strategyScann(Blitzcrank aJuniorRobot);

	StrategyJuniorRobot strategyHit(Blitzcrank aJuniorRobot);

	StrategyJuniorRobot strategyWall(Blitzcrank aJuniorRobot);

}
