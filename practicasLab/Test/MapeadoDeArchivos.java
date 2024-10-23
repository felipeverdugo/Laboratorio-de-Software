package Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.time.LocalDateTime;

public class MapeadoDeArchivos {

    public void guardarEnArchivo(Object obj) throws Exception {
        // Leer la anotación @Archivo para obtener el nombre del archivo
        Archivo archivoAnotacion = obj.getClass().getAnnotation(Archivo.class);
        String nombreArchivo;
        if (archivoAnotacion != null && !archivoAnotacion.nombre().isEmpty()) {
            nombreArchivo = archivoAnotacion.nombre(); // Usar el nombre indicado
        } else {
            nombreArchivo = obj.getClass().getSimpleName() + ".txt"; // Nombre por defecto
        }

        // Abrir o crear el archivo
        File file = new File(nombreArchivo);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            // Escribir el nombre de la clase
            writer.write("Clase: " + obj.getClass().getSimpleName());
            writer.newLine();




            // Escribir los atributos anotados con @AlmacenarAtributo
//            for (Annotation anotacion: obj.getClass().getAnnotationsByType(Servidor.class)) {
//                System.out.println(field);
//                if (field.isAnnotationPresent(AlmacenarAtributo.class)) {
//                    field.setAccessible(true);
//                    writer.write(field.getName() + ": " + field.get(obj));
//                    writer.newLine();
//                }
//            }
        }
    }
}


