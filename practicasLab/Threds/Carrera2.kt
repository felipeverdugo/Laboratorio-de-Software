package Threds

import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import kotlin.random.Random
import kotlin.concurrent.thread

class Corredor(private val id: Int) : Runnable {
    override fun run() {
        var metrosRecorridos = 0
        while (metrosRecorridos < 100) {
            // Simular tiempo de carrera
            metrosRecorridos += Random.nextInt(1, 3) // Avanzar de 1 a 2 metros
            println("Corredor $id ha recorrido $metrosRecorridos metros")
            Thread.sleep(500) // Pausa para simular el tiempo de carrera
        }
        println("Corredor $id ha terminado la carrera!")
    }
}

fun main() {
    // Cambiar el tamaño del pool de hilos a 5 o 3 para observar la diferencia
    val poolSize = 5 // Cambia este valor a 3 para observar el comportamiento
    val executor: ExecutorService = Executors.newFixedThreadPool(poolSize)

    for (i in 1..5) {
        executor.submit(Corredor(i)) // Crear 10 corredores
    }

    executor.shutdown() // Espera a que terminen todos los hilos
}
