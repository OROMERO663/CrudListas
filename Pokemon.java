package crudListas;

/**
 * Clase Pokemon. Contiene los atributos que forman el Objeto Pokemon y los metodos necesarios (Constructor, Getters/Setters) 
 * para poder ser utilizado por el Controlador.
 * 
 * @author Oscar
 * @version 1
 */
public class Pokemon {

	private String nombre;
	private String tipo;
	private String region;
	/**
	 * Metodo Constructor Pokemon
	 * 
	 * @author Oscar
	 * @param nombre
	 * @param tipo
	 * @param region
	 */
	public Pokemon(String nombre, String tipo, String region) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.region = region;
	}
	/**
	 * Metodo Getter Nombre
	 * 
	 * @author Oscar
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Metodo Setter Nombre
	 * 
	 * @author Oscar
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Metodo Getter Tipo
	 * 
	 * @author Oscar
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * Metodo Setter Tipo
	 * 
	 * @author Oscar
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * Metodo Getter Region
	 * 
	 * @author Oscar
	 */
	public String getRegion() {
		return region;
	}
	/**
	 * Metodo Setter Region
	 * 
	 * @author Oscar
	 */
	public void setRegion(String region) {
		this.region = region;
	}
	/**
	 * Metodo toString Pokemon
	 * 
	 * @author Oscar
	 */
	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", tipo=" + tipo + ", region=" + region + "]";
	}

}
