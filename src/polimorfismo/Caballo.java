package polimorfismo;

public class Caballo extends Animal{
	private String relincha;

		public Caballo(String relincha){
			
		}
	public String getRelincha() {
		return relincha;
	}

	public void setRelincha(String relincha) {
		this.relincha = relincha;
	}
	@Override
	public void mostrarDatos() {
		System.out.println("El caballo relincha");
		}
	
}
