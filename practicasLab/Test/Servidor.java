package Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.time.LocalDateTime;
import java.util.Date;

@Archivo()
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Servidor {
    @AlmacenarAtributo
    String direccionIP();
    @AlmacenarAtributo
    int puerto();
    @AlmacenarAtributo
    String fechaActual() default "2021-09-01";
    @AlmacenarAtributo
    String horaActual() default "12:00:00";
    String nombre();
}


