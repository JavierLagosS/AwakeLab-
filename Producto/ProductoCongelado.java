package Producto;

public class ProductoCongelado extends Productos {
    String T_Refrigeracion;

	/**
	 * @param t_Refrigeracion
	 */
	public ProductoCongelado() {
		
	}
    
	public ProductoCongelado(String t_Refrigeracion) {
		super();
		T_Refrigeracion = t_Refrigeracion;
	}

	public String getT_Refrigeracion() {
		return T_Refrigeracion;
	}

	public void setT_Refrigeracion(String t_Refrigeracion) {
		T_Refrigeracion = t_Refrigeracion;
	}
    
    
}
