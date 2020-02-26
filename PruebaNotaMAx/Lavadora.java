package PruebaNotaMAx;

public class Lavadora extends Electrodomestico {
	//Su atributo es carga, además de los atributos heredados
		private int icarga;
	//  Por defecto, la carga es de 5 kg. Usa una constante para ello
		private final static int CONSTANTE_ICARGA=5;

	// Setters and Getters	
		public int getIcarga() {
			return icarga;
		}

		public void setDcarga(int icarga) {
			this.icarga = icarga;
		}
 
    //precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino
	//es así no se incrementara el precio. Llama al método padre y añade el código
	//necesario. Recuerda que las condiciones que hemos visto en la clase
	//Electrodoméstico también deben afectar al precio. */
    public double precioFinal(){
        //Invocamos el método precioFinal del método padre
        double aux=super.precioFinal();
  
        //añadimos el código necesario
        if (icarga>30){
            aux+=50;
        }
  
        return aux;
    }
  
	// Los constructores que se implementarán serán:
	// Un constructor por defecto
       
    public Lavadora(){
        this(CONSTANTE_DPRECIOBASE, CONSTANTE_DPESO, CONSTANTE_CCONSUMOENERGETICO, CONSTANTE_SCOLOR, CONSTANTE_ICARGA);
    }
  
	//	 Un constructor con el precio y peso. El resto por defecto
    public Lavadora(double dprecioBase, double dpeso){
        this(dprecioBase, dpeso, CONSTANTE_CCONSUMOENERGETICO, CONSTANTE_SCOLOR, CONSTANTE_ICARGA);
    }
  
//	 Un constructor con la carga y el resto de atributos heredados. Recuerda que
//	 debes llamar al constructor de la clase padre	

    public Lavadora(double dprecioBase, double dpeso, char cconsumoEnergetico, String scolor, int carga){
        super(dprecioBase,dpeso, cconsumoEnergetico,scolor);
        this.icarga=icarga;
    }
}
