package polimorfismo;

public class Perro extends Animal {
	private String ladra;
	
	public Perro (String ladra) {
		
	}
	
	/**
	 * @return the ladra
	 */
	public String getLadra() {
		return ladra;
	}

	/**
	 * @param ladra the ladra to set
	 */
	public void setLadra(String ladra) {
		this.ladra = ladra;
	}

	public void mostrarDatos() {
		System.out.println("El perro ladra");
		}

}
