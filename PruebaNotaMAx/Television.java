package PruebaNotaMAx;

public class Television extends Electrodomestico {


//Por defecto, la resolución será de 20 pulgadas y el sintonizador será false

private final static int CONSTANTE_RESOLUCION=20;
//private final static boolean CONSTANTE_BSINTONIZADOR=false;

//Sus atributos son resolución (en pulgadas) y sintonizador TDT (booleano), además de
//los atributos heredados;
    private int iresolucion;
    private boolean bsintonizadorTDT;    

 // Setters And Getters
    
    public int getIresolucion() {
		return iresolucion;
	}


	public void setIresolucion(int iresolucion) {
		this.iresolucion = iresolucion;
	}


	public boolean isBsintonizadorTDT() {
		return bsintonizadorTDT;
	}


	public void setBsintonizadorTDT(boolean bsintonizadorTDT) {
		this.bsintonizadorTDT = bsintonizadorTDT;
	}
    

	
//precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara el
//		precio un 30% y si tiene un sintonizador TDT incorporado, aumentara 50
//		€. Recuerda que las condiciones que hemos visto en la clase Electrodoméstico
//		también deben afectar al precio.


    public double precioFinal(){

        double aux=super.precioFinal();
        if (iresolucion>40){
            aux+=dprecioBase*0.3;
        }
        if (bsintonizadorTDT){
            aux+=50;
        }
  
        return aux;
    }
  
 // Los constructores que se implementarán serán:
 	// Un constructor por defecto
    public Television(){
        this(CONSTANTE_DPRECIOBASE, CONSTANTE_DPESO, CONSTANTE_CCONSUMOENERGETICO, CONSTANTE_SCOLOR, CONSTANTE_RESOLUCION,false);
    }
//	Un constructor con el precio y peso. El resto por defecto.
   
    public Television(double dprecioBase, double dpeso){
        this(dprecioBase, dpeso, CONSTANTE_CCONSUMOENERGETICO, CONSTANTE_SCOLOR, CONSTANTE_RESOLUCION, false);
    }
  
// Un constructor con todos los atributos.
    public Television(double dprecioBase, double dpeso, char cconsumoEnergetico, String scolor, int resolucion, boolean sintonizadorTDT){
        super(dprecioBase, dpeso, cconsumoEnergetico, scolor);
        this.iresolucion=iresolucion;
        this.bsintonizadorTDT=bsintonizadorTDT;
    }
}
