package Producto;

public class Productos {
	String fecha_de_caducidad;
	String n�mero_de_lote;
	/**
	 * @param fecha_de_caducidad
	 * @param n�mero_de_lote
	 */
	public Productos() {
		
	}
	public Productos(String fecha_de_caducidad, String n�mero_de_lote) {
		this.fecha_de_caducidad = fecha_de_caducidad;
		this.n�mero_de_lote = n�mero_de_lote;
	}
	public String getFecha_de_caducidad() {
		return fecha_de_caducidad;
	}
	public void setFecha_de_caducidad(String fecha_de_caducidad) {
		this.fecha_de_caducidad = fecha_de_caducidad;
	}
	public String getN�mero_de_lote() {
		return n�mero_de_lote;
	}
	public void setN�mero_de_lote(String n�mero_de_lote) {
		this.n�mero_de_lote = n�mero_de_lote;
	}
	
	
}
