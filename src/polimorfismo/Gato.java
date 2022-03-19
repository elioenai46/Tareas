package polimorfismo;
public class Gato extends Animal{
	private String maulla;
	
	public Gato(String maulla) {
		
	}

	public String getMaulla() {
		return maulla;
	}

	public void setMaulla(String maulla) {
		this.maulla = maulla;
	}
	public void mostrarDatos() {
		System.out.println("El gato maulla");
		}
	

}