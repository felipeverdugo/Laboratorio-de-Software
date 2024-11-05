import java.time.LocalTime
import java.time.format.DateTimeFormatter
import kotlinx.coroutines.*
import java.awt.FlowLayout
import java.util.concurrent.TimeUnit
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.SwingUtilities
import kotlin.concurrent.thread

class HoraActual {


    fun reloj() = runBlocking {
        val formato = DateTimeFormatter.ofPattern("HH:mm:ss")
        val job = launch {
            while (true) {
                delay(1000)
                var currentTime = LocalTime.now().format(formato)
                println("Hora actual: $currentTime")
            }
        }

        delay(5000)
        println("Cancelando la tarea")
        job.cancel()
    }


    fun reloj1() {
        val formato = DateTimeFormatter.ofPattern("HH:mm:ss")
        val relojThread = thread() {
            while (true) {
                var currentTime = LocalTime.now().format(formato)
                TimeUnit.SECONDS.sleep(1)
                println(currentTime)
            }
        }
        TimeUnit.SECONDS.sleep(5)
        println("Cancelando la tarea")
        relojThread.interrupt()

    }


}







fun main() {
    val hora = HoraActual()
    hora.reloj()
    hora.reloj1()

}


