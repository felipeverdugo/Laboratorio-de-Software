import java.lang.Thread.sleep
import java.util.concurrent.CopyOnWriteArrayList
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger

class Carrera


var pasos = ThreadLocal<Int>()
var poolDePasos =  CopyOnWriteArrayList(
    listOf(0,0,0,0,0,0,0,0))

var posiciones = MutableList(8) { 0 }






fun main() {
    val executor = Executors.newFixedThreadPool(3)
    // Hay que poner un poco mas de paso porque aveces se mete los corredores en los otros carriles a la vez
    repeat(600) { task ->
        executor.execute {

            // Se inicializa el threadLocal
            if (pasos.get() == null) {
                pasos.set(0)
            }
            // Se obtiene el id del hilo actual
            val threadId = (Thread.currentThread().threadId() - 22).toInt()


            if (pasos.get() == 100) {
                println("El hilo ${threadId} ha terminado la carrera")
                println("-------------------------------------------")
                executor.shutdown() // Inicia el cierre sin interrumpir tareas en ejecución
                if (!executor.awaitTermination(10, TimeUnit.SECONDS)) {
                    // Si después de 10 segundos el pool no se cierra, forzamos la interrupción
                    executor.shutdownNow()
                }


            } else {
                // Se actualiza el valor del threadLocal y del poolDePasos
                pasos.set(pasos.get() + 1)
                poolDePasos[threadId] = pasos.get()
                println("El hilo ${threadId} va en el paso ${pasos.get()}")
                sleep ( Math.random().toLong() * 2000)
            }
        }
    }


}
