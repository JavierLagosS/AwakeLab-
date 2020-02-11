package Banco;
public class Cuenta {
	private String sTitular;
	private double dCantidad;

	Cuenta() {
		this.sTitular = "";
		this.dCantidad = 0;
	}

	Cuenta(String sTitular, double dCantidad) {
		this.sTitular = sTitular;
		this.dCantidad = dCantidad;
	}

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
		if (Validador(dRetiro, dCantidad) == false)
			System.out.println("\n************************");
			System.out.println("CANTIDAD EXCEDE EL MONTO\nRetiro total: " + dCantidad);
			System.out.println("************************");
		this.dCantidad = dCantidad - dRetiro;
		if (dCantidad < 0) {
			dCantidad = 0;
		}
	}

	boolean Validador(double a, double b) {
		if (a > b) {
			return false;
		} else {
			return true;
		}
	}

	public String toString() {
		System.out.println("\nDETALLE TRANSACCIÓN\n");
		System.out.println("Titular: " + getsTitular() + "\nMonto en cuenta: " + getdCantidad());
		return null;
	}

	void Ingreso(double dIngreso) {
		this.dCantidad = dCantidad + dIngreso;
	}
}