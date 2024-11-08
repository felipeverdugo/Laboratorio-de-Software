package laboratorio

import robocode.JuniorRobot

interface StrategyJuniorRobot {
    fun run(aJuniorRobot: JuniorRobot)
    fun onScannedRobot(aJuniorRobot: JuniorRobot)
    fun onHitByBullet(aJuniorRobot: JuniorRobot)
    fun onHitWall(aJuniorRobot: JuniorRobot)

}