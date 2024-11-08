package laboratorio

import robocode.JuniorRobot

interface Estratega {

    fun stratyRun(robot: JuniorRobot) : StrategyJuniorRobot

    fun stratOnScannedRobot( robot: JuniorRobot) : StrategyJuniorRobot

    fun stratOnHitByBullet( robot: JuniorRobot) : StrategyJuniorRobot

    fun startOnHitWall( robot: JuniorRobot) : StrategyJuniorRobot
}