package laboratorio

import robocode.JuniorRobot


// Me aparece el error ClassNotFound en la siguiente linea cuando lo intento probar
class MiRobotEnKT (private var strategy: Estratega = EstrategaImp.getInstance()) : JuniorRobot( ) {


    override fun run() {
        setColors(black, black, black, black, black)
        strategy.stratyRun(this).run(this)
    }


/*    fun getEstatega() : Estratega {
        return strategy
    }


    fun setEstratega( estratega: Estratega ) {
        strategy = estratega
    }*/


    /**
     * onScannedRobot: What to do when you see another robot
     */
    override fun onScannedRobot() {
        strategy.stratOnScannedRobot(this).onScannedRobot(this)
    }

    /**
     * onHitByBullet: What to do when you're hit by a bullet
     */
    override fun onHitByBullet() {
        strategy.stratOnHitByBullet(this).onHitByBullet(this)
    }

    /**
     * onHitWall: What to do when you hit a wall
     */
    override fun onHitWall() {
        strategy.startOnHitWall(this).onHitWall(this)
    }

}

fun main() {
    val miRobot = MiRobotEnKT()
    miRobot.run()
}

