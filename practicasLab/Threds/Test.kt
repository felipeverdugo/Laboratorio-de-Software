package Threds

class TestSyncronized ( id : String) : Thread(id) {
    var frase : Array<String> = arrayOf("1","2","3","4","5")

    override fun run() {
        synchronized(System.out) {
                for ( palabra in frase) {
                    println("Hilo : ${this.name}   ${palabra}")
                }
            }
        }
    }

fun main() {
    val hilo1 = TestSyncronized("1")
    val hilo2 = TestSyncronized("2")
    val hilo3 = TestSyncronized("3")


    hilo1.start()
    hilo2.start()
    hilo3.start()
}

