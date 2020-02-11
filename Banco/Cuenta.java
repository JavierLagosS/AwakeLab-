package Banco;

public class Cuenta {

	private String sTitular;
	private double dCantidad;

	Cuenta() {
		this.sTitular = "";
		this.dCantidad = 0;
	}

	Cuenta( String sTitular,  double dCantidad) {
		this.sTitular = sTitular;
		this.dCantidad = dCantidad;
	}
//	if (dCantidad>0) {
//		System.out.println("Ingrese una Cantidad Valida");
//	}

	public String getsTitular() {
		return sTitular;
	}

	public void setsTitular(String sTitular) {
		this.sTitular = sTitular;
	}

	public double getdCantidad() {
		return dCantidad;
	}

	public void setdCantidad(double dCantidad) {
		this.dCantidad = dCantidad;
	}

	void Retiro(double dRetiro) {
		this.dCantidad = dCantidad - dRetiro;
		if (dCantidad<0) {
			dCantidad=0.0;
			
		}
		
		
	}
	void Ingreso(double dIngreso) {
		this.dCantidad = dCantidad + dIngreso;
		
	}
 
}
