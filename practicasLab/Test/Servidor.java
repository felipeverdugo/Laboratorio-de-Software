package Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.time.LocalDateTime;
import java.util.Date;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Servidor {
    String direccionIP();
    int puerto();
    String nombreArchivo() default "servidor.txt";
}


