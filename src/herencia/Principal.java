package herencia;

public class Principal {
	static Pnumerico bits = new Pnumerico();
	static Pnumerico corto = new Pnumerico();
	static Pnumerico entero = new Pnumerico();
	static Pnumerico largo = new Pnumerico();

	public static void main(String[] args) {
		bits.setNombre("byte");
		bits.setLongitu("0-127");
		bits.setDescripcion("es el entero mas pequeño");
		bits.setBits((byte)10);
		// TODO Auto-generated method stub
		
		System.out.print(bits.getNombre() + ""+ bits.getLongitu());
		System.out.print(bits.getDescripcion() + ""+ bits.getBits());
		
		
		
	
	}

}
