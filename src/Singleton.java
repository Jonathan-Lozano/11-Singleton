/**
 * 
 * @author Jonathan Lozano
 *
 */
public final class Singleton {

	private static final Singleton singleton = new Singleton();

	/**
	 * Constructor privado para prohibir la generacion de instancias nuevas
	 */
	private Singleton() {
		System.out.println("Instancia");
	}

	/**
	 * Metodo que retorna la unica instancia generada en esta clase
	 * Retorna instancia unica
	 */
	public static Singleton instanciaSingleton() {
		return singleton;
	}
}
