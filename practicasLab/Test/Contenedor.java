package Test;
import java.io.*;
import java.net.*;

public class Contenedor {


    public static void main(String[] args) {
        try {
            // Crear el ServerSocket en el puerto 8080
            Login login = new Login();
            int puerto = Login.class.getAnnotation(Servidor.class).puerto();

            ServerSocket serverSocket = new ServerSocket( puerto );
            System.out.println("Servidor escuchando en el puerto "+puerto+"...");

            while (true) {
                // Aceptar una conexión de un cliente
                Socket clientSocket = serverSocket.accept();
                MapeadoDeArchivos mapeadoDeArchivos = new MapeadoDeArchivos();
                mapeadoDeArchivos.guardarEnArchivo(login);


                System.out.println("Cliente conectado: " + clientSocket.getInetAddress());

                // Leer datos del cliente
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    System.out.println("Recibido: " + inputLine);
                    // Enviar respuesta al cliente
                    out.println("Echo: " + inputLine);
                }

                // Cerrar la conexión con el cliente
                clientSocket.close();
            }
        } catch (SocketException e) {
            e.printStackTrace();
            System.out.println("Cerrando conexión...");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
