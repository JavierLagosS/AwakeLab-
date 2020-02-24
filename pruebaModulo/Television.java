package pruebaModulo;

public class Television extends Electrodomestico {
//	 Sus atributos son resoluci�n (en pulgadas) y sintonizador TDT (booleano), adem�s de
//	 los atributos heredados
private double dresolucion;
private boolean bsintonizador;

//Por defecto, la resoluci�n ser� de 20 pulgadas y el sintonizador ser� false

private final static double CONSTANTE_RESOLUCION=20;
private final static boolean CONSTANTE_BSINTONIZADOR=false;

	public Television() {
		// TODO Auto-generated constructor stub
	}
	public Television(int iprecioBase, double dpeso, char cconsumoEnergetico, String scolor, String stipo) {
		super(stipo,iprecioBase ,dpeso, cconsumoEnergetico,scolor);
		this.dresolucion=dresolucion;
		this.bsintonizador=bsintonizador;
	
	}
	public double getDresolucion() {
		return dresolucion;
	}
	public void setDresolucion(double dresolucion) {
		this.dresolucion = dresolucion;
	}
	public boolean getBsintonizador() {
		return bsintonizador;
	}
	public void setBsintonizador(boolean bsintonizador) {
		this.bsintonizador = bsintonizador;
	}
//precioFinal(): si tiene una resoluci�n mayor de 40 pulgadas, se incrementara el
//	precio un 30% y si tiene un sintonizador TDT incorporado, aumentara 50
//	�. Recuerda que las condiciones que hemos visto en la clase Electrodom�stico
//	tambi�n deben afectar al precio.

public int precioFinal() {
	int aux= super.precioFinal();
	if (dresolucion>40) {
		aux+= (int) (precioFinal()*1.3);	
	}
	if (bsintonizador=true)
	{
	     aux+=50;}
	return aux;
	
}

}
