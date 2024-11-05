import java.util.concurrent.Callable
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.Future
import kotlin.random.Random

class CarreraCall(private val id: Int) : Callable<Exception> {
    override fun call(): Exception {
        var metrosRecorridos = 0
        while (metrosRecorridos < 10) {
            // Simular tiempo de carrera
            metrosRecorridos += Random.nextInt(1, 3) // Avanzar de 1 a 2 metros
            println("Corredor $id ha recorrido $metrosRecorridos metros")
            Thread.sleep(500) // Pausa para simular el tiempo de carrera
            val problema = Random.nextInt(1, 10)
            if (problema == 5) {
                return Exception("Corredor $id ha tenido un problema!")
            }
        }
        return Exception("Corredor $id ha terminado la carrera!")
    }
}

fun main() {
    val poolSize = 5 // Cambia este valor a 3 para observar el comportamiento
    val executor: ExecutorService = Executors.newFixedThreadPool(poolSize)
    val futures = mutableListOf<Future<Exception>>()

    try {
        for (i in 1..5) {
            val future = executor.submit(CarreraCall(i))
            futures.add(future)
        }

        for (future in futures) {
            try {
                val result = future.get()
                println(result.message)
            } catch (e: Exception) {
                println("Error al obtener el resultado: ${e.message}")
            }
        }
    } catch (e: Exception) {
        println("Error en la ejecución: ${e.message}")
    } finally {
        executor.shutdown() // Espera a que terminen todos los hilos
    }
}