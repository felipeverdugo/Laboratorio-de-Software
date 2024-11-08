package laboratorio

import robocode.JuniorRobot
import robocode.JuniorRobot.black

class EstrategaImp private  constructor(private var ataque : StrategyJuniorRobot, private var defensa : StrategyJuniorRobot) : Estratega {
    companion object {
        private var instance: EstrategaImp? = null
        fun getInstance(): EstrategaImp {
            if (instance == null) {
                instance = EstrategaImp(FullAgro(), FullAgro())
            }
            return instance as EstrategaImp
        }
    }


    override fun stratyRun(robot: JuniorRobot): StrategyJuniorRobot {
        return ataque
    }

    override fun stratOnScannedRobot(robot: JuniorRobot): StrategyJuniorRobot {
        return ataque
    }

    override fun stratOnHitByBullet(robot: JuniorRobot): StrategyJuniorRobot {
        return defensa    }

    override fun startOnHitWall(robot: JuniorRobot): StrategyJuniorRobot {
        return defensa
    }


    private class FullAgro () : StrategyJuniorRobot {

        override fun run(aJuniorRobot: JuniorRobot) {
            aJuniorRobot.turnGunLeft(360);
            aJuniorRobot.ahead(15);
            aJuniorRobot.back(20);
        }

        override fun onHitWall(aJuniorRobot: JuniorRobot) {
            aJuniorRobot.doNothing()
        }

        override fun onHitByBullet(aJuniorRobot: JuniorRobot) {
            aJuniorRobot.turnGunTo(aJuniorRobot.hitByBulletAngle);
            aJuniorRobot.fire();
        }

        override fun onScannedRobot(aJuniorRobot: JuniorRobot) {
            aJuniorRobot.turnGunTo(aJuniorRobot.scannedAngle)
            aJuniorRobot.fire(3.0)
        }
    }



    private class NoHitStrategy  (var movingForward: Boolean = true) : StrategyJuniorRobot {

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


    }



