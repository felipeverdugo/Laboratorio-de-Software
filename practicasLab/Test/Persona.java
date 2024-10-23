package Test;

@Archivo( nombre = "Persona.txt", version = 1.0)
public class Persona {
    @AlmacenarAtributo
    private String nombre;
    @AlmacenarAtributo
    private int edad;
    @AlmacenarAtributo
    private String dni;
    @AlmacenarAtributo
    private char sexo;

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public static void main(String[] args) throws Exception {
        Persona p = new Persona();
        p.setNombre("Juan");
        p.setEdad(25);
        p.setDni("12345678");
        p.setSexo('M');
        MapeadoDeArchivos mapeador = new MapeadoDeArchivos();
        mapeador.guardarEnArchivo(p);
    }


}
