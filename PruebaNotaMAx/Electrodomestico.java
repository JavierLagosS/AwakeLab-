package PruebaNotaMAx;
import java.util.*;
public class Electrodomestico {
//      Creamos las constantes segun norma en Mayuscula,
//		Por defecto, el color será blanco, el consumo energético será F, el dprecioBase es de
//		$100.000 y el peso de 5 kg. Usar constantes para ello
		protected final static String CONSTANTE_SCOLOR= "blanco";
		protected final static char CONSTANTE_CCONSUMOENERGETICO='F';
		protected final static double CONSTANTE_DPRECIOBASE=100000;
		protected final static double CONSTANTE_DPESO=5;
    

//Sus atributos son precio base, color, consumo energético (letras entre A y F) y peso.
//Indica que se podrán heredar.
		
		protected double dprecioBase;
		protected String scolor;
		protected char cconsumoEnergetico;
		protected double dpeso;
   
		// Los métodos que implementara serán:
	//  Métodos get de todos los atributos y los setters aprovechando
		 public double getDprecioBase() {
				return dprecioBase;
			}

			public void setDprecioBase(double dprecioBase) {
				this.dprecioBase = dprecioBase;
			}

			public String getScolor() {
				return scolor;
			}

			public void setScolor(String scolor) {
				this.scolor = scolor;
			}

			public char getCconsumoEnergetico() {
				return cconsumoEnergetico;
			}

			public void setCconsumoEnergetico(char cconsumoEnergetico) {
				this.cconsumoEnergetico = cconsumoEnergetico;
			}

			public double getDpeso() {
				return dpeso;
			}

			public void setDpeso(double dpeso) {
				this.dpeso = dpeso;
			}

//			comprobarColor(String color): comprueba que el color es correcto, sino lo es
//			usa el color por defecto. Se invocará al crear el objeto y no será visible.	
    private void comprobarColor(String scolor){
   
//   	 Los colores disponibles son blanco, negro, rojo, azul y gris. No importa si el nombre está
//   	 en mayúsculas o en minúsculas
        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado=false;
  
        for(int i=0;i<colores.length && !encontrado;i++){
              
            if(colores[i].equals(scolor)){
                encontrado=true;
            }
              
        }
          
        if(encontrado){
            this.scolor=scolor;
        }else{
            this.scolor=CONSTANTE_SCOLOR;
        }
          
          
    }
    
      
   
//  comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//	sino es correcta usara la letra por defecto. Se invocará al crear el objeto y no
//	sera visible.	
 // Se comprueba mediante el metodo acssii

	
    public void comprobarConsumoEnergetico(char consumoEnergetico){
          
        if(cconsumoEnergetico>=65 && cconsumoEnergetico<=70){
            this.cconsumoEnergetico=cconsumoEnergetico;
        }else{
            this.cconsumoEnergetico=CONSTANTE_CCONSUMOENERGETICO;
        }
          
    }
   
//	  precioFinal(): según el consumo energético, aumentara su precio, y según su
//	  tamaño también.
    public double precioFinal(){
        double aux=0;
        switch(cconsumoEnergetico){
            case 'A':
                aux+=100;
                break;
            case 'B':
                aux+=80;
                break;
            case 'C':
                aux+=60;
                break;
            case 'D':
                aux+=50;
                break;
            case 'E':
                aux+=30;
                break;
            case 'F':
                aux+=10;
                break;
        }
   
        if(dpeso>=0 && dpeso<19){
            aux+=10;
        }else if(dpeso>=20 && dpeso<49){
            aux+=50;
        }else if(dpeso>=50 && dpeso<=79){
            aux+=80;
        }else if(dpeso>=80){
            aux+=100;
        }
   
        return dprecioBase+aux;
    }
   
    
    // Los constructores que se implementarán serán
    // Constructor por defecto
    public Electrodomestico(){
        this(CONSTANTE_DPRECIOBASE, CONSTANTE_DPESO, CONSTANTE_CCONSUMOENERGETICO, CONSTANTE_SCOLOR);
    }
    //	Un constructor con el precio y peso. El resto por defecto.
    public Electrodomestico(double dprecioBase, double dpeso){
        this(dprecioBase, dpeso, CONSTANTE_CCONSUMOENERGETICO, CONSTANTE_SCOLOR);
    }
    
    //  Un constructor con todos los atributos	
    public Electrodomestico(double dprecioBase, double dpeso, char cconsumoEnergetico, String scolor){
        this.dprecioBase=dprecioBase;
        this.dpeso=dpeso;
        comprobarConsumoEnergetico(cconsumoEnergetico);
        comprobarColor(scolor);
    }
    
   
   
}

