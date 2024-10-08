package laboratorio;

public class PoolConexiones {
	private static PoolConexiones instancePoolConexiones;

	private PoolConexiones() {
		// TODO Auto-generated constructor stub
	}

	public static PoolConexiones getInstancia() {
		if (instancePoolConexiones == null) {
			instancePoolConexiones = new PoolConexiones();
		}
		return instancePoolConexiones;
	}

	public void mostrarMensaje() {
		System.out.println("¡Este es el único objeto Singleton!");
	}

	public static void main(String[] args) {
		// Intentar obtener la única instancia de Singleton
		PoolConexiones singleton = PoolConexiones.getInstancia();

		// Usar el método de la clase Singleton
		singleton.mostrarMensaje();
	}

}
