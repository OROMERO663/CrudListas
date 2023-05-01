package crudListas;

public class Pokemon {

	private String nombre;
	private String tipo;
	private String region;

	public Pokemon(String nombre, String tipo, String region) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.region = region;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", tipo=" + tipo + ", region=" + region + "]";
	}

}
