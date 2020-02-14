package Producto;

public class ProductoFresco extends Productos{
 String fecha_de_envasado;
 String Pais_de_origen;
 public ProductoFresco() {
	}
public ProductoFresco(String fecha_de_caducidad,String número_de_lote,  String fecha_de_envasado, String pais_de_origen) {
	super(fecha_de_caducidad, número_de_lote);
	this.fecha_de_envasado = fecha_de_envasado;
	Pais_de_origen = pais_de_origen;
}
public String getFecha_de_envasado() {
	return fecha_de_envasado;
}
public void setFecha_de_envasado(String fecha_de_envasado) {
	this.fecha_de_envasado = fecha_de_envasado;
}
public String getPais_de_origen() {
	return Pais_de_origen;
}
public void setPais_de_origen(String pais_de_origen) {
	Pais_de_origen = pais_de_origen;
}



}
