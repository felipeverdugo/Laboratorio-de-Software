package Test;




@Servidor(direccionIP = "56348", puerto = 8080, nombreArchivo = "login.txt")
public class Login {
    private String usuario;
    private String password;

    public Login(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public Login() {
        this.usuario = "admin";
        this.password = "admin";
    }


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
    @Invocar
    public void igualdad(String usuario, String password){
        if(this.usuario.equals(usuario) && this.password.equals(password)){
            System.out.println("Bienvenido al sistema");
        }else{
            System.out.println("Usuario o contraseña incorrectos");
        }
    }
    @Invocar
    public void verificarUsuario(String usuario){
        if(this.usuario.equals(usuario)){
            System.out.println("Usuario correcto");
        }else{
            System.out.println("Usuario incorrecto");
        }
    }


}
