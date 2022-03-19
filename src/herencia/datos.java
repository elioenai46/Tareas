package herencia;

public abstract class datos {
	 private String  nombre;
	 private String longitu;
	 private String descripcion; 
	 

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the longitu
	 */
	public String getLongitu() {
		return longitu;
	}

	/**
	 * @param longitu the longitu to set
	 */
	public void setLongitu(String longitu) {
		this.longitu = longitu;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
