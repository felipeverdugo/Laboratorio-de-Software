package laboratorio

import robocode.JuniorRobot

class NoHitStrategy(private var movingForward: Boolean = false) : StrategyJuniorRobot {


    override fun run(aJuniorRobot: JuniorRobot) {
        aJuniorRobot.turnAheadLeft(40, 70)
    }

    private fun spinRight(robot: JuniorRobot) {
        robot.turnBackRight(60, 70)
    }

    override fun onHitWall(aJuniorRobot: JuniorRobot) {
        // Bounce off!
        reverseDirection(aJuniorRobot)
    }

    /**
     * reverseDirection: Switch from ahead to back &amp; vice versa
     */
    private fun reverseDirection(robot: JuniorRobot) {
        if (movingForward) {
            robot.back(200)
            robot.turnGunTo(180)
            movingForward = false
        } else {
            robot.ahead(200)
            movingForward = true
        }
    }

    override fun onHitByBullet(aJuniorRobot: JuniorRobot) {
        aJuniorRobot.turnGunTo(aJuniorRobot.hitByBulletAngle)
        aJuniorRobot.fire()
        this.spinRight(aJuniorRobot)
    }

    override fun onScannedRobot(aJuniorRobot: JuniorRobot) {
        aJuniorRobot.doNothing()
    }
}
