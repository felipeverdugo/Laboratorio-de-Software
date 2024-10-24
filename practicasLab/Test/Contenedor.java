package Test;
import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.*;
import java.time.LocalDateTime;

import static com.sun.net.httpserver.HttpServer.create;

public class Contenedor {


    private HttpServer conectar(int ip, int puerto) {
        try {
            return HttpServer.create(new InetSocketAddress(puerto), ip);
        } catch (IOException e) {
            return null;
        }
    }

    public void procesarClaseAnotada(Object object) {
        if (object.getClass().isAnnotationPresent(Servidor.class)) {
            Servidor objServidor = object.getClass().getAnnotation(Servidor.class);
            HttpServer server = conectar(Integer.parseInt(objServidor.direccionIP()), objServidor.puerto());
            if (server != null) {
                try {
                    server.createContext("/", new Manejador());
                    server.setExecutor(null);
                    server.start();
                    System.out.println("Conexión establecida");
                } catch (Exception e) {
                    System.out.println("Error al iniciar la conexión");
                }
                this.almacenarEnArchivo(objServidor.nombreArchivo(), objServidor.direccionIP(), objServidor.puerto());
                this.testInvocar(object);

            } else {
                System.out.println("Error al establecer la conexión");
            }
        }
    }

    private void testInvocar(Object object) {
        int tests = 0;
        int cantTests = 0;
        int passed = 0;
        Method[] declaredMethods = object.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            cantTests++;
            if (method.isAnnotationPresent(Invocar.class)) {
                tests++;
                System.out.println("Invocando método: " + method.getName());
                try {
                    method.invoke(object);
                    passed++;
                    System.out.printf("Test %s Paso: no hay excepciones%n", method);
                } catch (InvocationTargetException wrappedEx) {
                    System.out.println("Test " + method + " Falló: " + wrappedEx.getCause());
                }
                catch (Exception ex) {
                    System.out.println("Test " + method + " Falló: " + ex);
                }
            }
        }
        System.out.println("Cantidad "+cantTests+" @Tests: " + tests + " Passed: " + passed);
    }

    private void almacenarEnArchivo(String nombreArchivo, String ip, int puerto) {
        try {
            File file = new File(nombreArchivo);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write("Fecha: " + LocalDateTime.now().getDayOfMonth() + "/" + LocalDateTime.now().getMonthValue() + "/" + LocalDateTime.now().getYear());
                writer.newLine();
                writer.write("Hora: " + LocalDateTime.now().getHour() + ":" + LocalDateTime.now().getMinute() + ":" + LocalDateTime.now().getSecond());
                writer.newLine();
                writer.write("Direccion IP: " + ip);
                writer.newLine();

            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
        }
    }


    public static void main(String[] args) {
        Contenedor contenedor = new Contenedor();
        contenedor.procesarClaseAnotada(new Login( "admin", "admin"));
    }
}
