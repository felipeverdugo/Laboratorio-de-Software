package Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;



@Servidor(direccionIP = "1", puerto = 2, nombre = "login.txt")
public class Login {
    private String usuario;
    private String password;


    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Invocar
    public String getPassword() {
        return password;
    }
    @Invocar
    public String getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
