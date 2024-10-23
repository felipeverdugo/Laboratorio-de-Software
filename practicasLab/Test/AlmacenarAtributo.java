package Test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface AlmacenarAtributo {
    String nombre() default "";
    int edad() default 0;
    String dni() default "";
    char sexo() default ' ';



}
