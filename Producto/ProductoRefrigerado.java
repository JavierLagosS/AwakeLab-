package Producto;

public class ProductoRefrigerado extends Productos {
	String org_sup;

	/**
	 * @param org_sup
	 */
	public ProductoRefrigerado() {
	
	}
	public ProductoRefrigerado(String org_sup) {
		super();
		this.org_sup = org_sup;
	}
	public String getOrg_sup() {
		return org_sup;
	}
	public void setOrg_sup(String org_sup) {
		this.org_sup = org_sup;
	}
	
	
}
