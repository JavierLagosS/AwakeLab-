package Producto;

public class Productos {
	String fecha_de_caducidad;
	String número_de_lote;
	/**
	 * @param fecha_de_caducidad
	 * @param número_de_lote
	 */
	public Productos() {
		
	}
	public Productos(String fecha_de_caducidad, String número_de_lote) {
		this.fecha_de_caducidad = fecha_de_caducidad;
		this.número_de_lote = número_de_lote;
	}
	public String getFecha_de_caducidad() {
		return fecha_de_caducidad;
	}
	public void setFecha_de_caducidad(String fecha_de_caducidad) {
		this.fecha_de_caducidad = fecha_de_caducidad;
	}
	public String getNúmero_de_lote() {
		return número_de_lote;
	}
	public void setNúmero_de_lote(String número_de_lote) {
		this.número_de_lote = número_de_lote;
	}
	
	
}
