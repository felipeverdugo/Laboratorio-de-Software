package laboratorio

import robocode.JuniorRobot

class FelipeVerdugoRobot : JuniorRobot() {
    private var strategy: StrategyJuniorRobot = NoHitStrategy(true)

    override fun run() {
        setColors(black, black, black, black, black)
        strategy.run(this)
    }

    /**
     * onScannedRobot: What to do when you see another robot
     */
    override fun onScannedRobot() {
        strategy.onScannedRobot(this)
    }

    /**
     * onHitByBullet: What to do when you're hit by a bullet
     */
    override fun onHitByBullet() {
        strategy.onHitByBullet(this)
    }

    /**
     * onHitWall: What to do when you hit a wall
     */
    override fun onHitWall() {
        strategy.onHitWall(this)
    }
}