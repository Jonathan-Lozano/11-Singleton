/**
 * 
 * @author Jonathan Lozano
 *
 */
public class SingletonDemo {
	
	/**
	 * Metodo principal que llama a la clase Singleton y a su unica instancia
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton s1 = Singleton.instanciaSingleton();
		Singleton s3 = Singleton.instanciaSingleton();
		Singleton s4 = Singleton.instanciaSingleton();
		Singleton s5 = Singleton.instanciaSingleton();
		Singleton s6 = Singleton.instanciaSingleton();

	}

}
