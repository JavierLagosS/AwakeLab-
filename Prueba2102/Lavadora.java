package Prueba2102;

public class Lavadora extends Electrodomestico {
	//Su atributo es carga, además de los atributos heredados
	private double dcarga;
	//  Por defecto, la carga es de 5 kg. Usa una constante para ello
	private final static double CONSTANTE_DCARGA=5; 
	// Los constructores que se implementarán serán:
	// Un constructor por defecto
		public Lavadora () {
		}
		
		//	 Un constructor con el precio y peso. El resto por defecto??
//		 Un constructor con la carga y el resto de atributos heredados. Recuerda que
//		 debes llamar al constructor de la clase padre	
	public Lavadora(int iprecioBase, double dpeso, char cconsumoEnergetico, String scolor, double dcarga, String stipo) {
		// TODO Auto-generated constructor stub
		super(stipo, iprecioBase,dpeso, cconsumoEnergetico,scolor);
		this.dcarga= dcarga;
	}

	public double getDcarga() {
		return dcarga;
	}

	public void setDcarga(double dcarga) {
		this.dcarga = dcarga;
	}

	//precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino
	//es así no se incrementara el precio. Llama al método padre y añade el código
	//necesario. Recuerda que las condiciones que hemos visto en la clase
	//Electrodoméstico también deben afectar al precio.
	public int precioFinal(){
	int aux = super.precioFinal();
	if (dcarga>30) {
		aux+=50;
	}
	return aux;


	}
}
