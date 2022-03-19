package polimorfismo;

public class Princiapal {
	static Perro perro = new Perro(null);
	static Gato gato = new Gato(null);
	static Caballo caballo = new Caballo(null);
	
	public static void main(String[] args) {
		perro.mostrarDatos();
		gato.mostrarDatos();
		caballo.mostrarDatos();
		
	}
	
	

}
