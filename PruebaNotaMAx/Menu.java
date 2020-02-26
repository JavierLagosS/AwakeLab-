package PruebaNotaMAx;
import java.util.*;
public class Menu {
	
	public static double AleatorioPrecioInicial() {
		   double  aleatorioPI= (int) (Math.random()*999+50);
		   return aleatorioPI;
	   }
	
	public static double AleatorioPesoInicial() {
		double randomPI = (int) (Math.random()*99+2);
		return randomPI;
	
	}
	public static char RandomConsumoEnergeticochar() {
		
		char randomCE = 'A' ;
		
		 int Acsii=(int) (Math.random()*70+65);
		 switch(Acsii){
         case 65 :
        	 randomCE='A';
             break;
         case 66:
        	 randomCE='B';
             break;
         case 67:
        	 randomCE='C';
             break;
         case 68:
        	 randomCE='D';
             break;
         case 69:
        	 randomCE='E';
             break;
         case 70:
        	 randomCE='F';
             break;
     }
		
		return  randomCE;
	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //Creamos un array de Electrodomesticos
        Electrodomestico listaElectrodomesticos[]=new Electrodomestico[10];
       
        
               
        //Asignamos cada una de las posiciones como queramos
        listaElectrodomesticos[0]=new Electrodomestico(AleatorioPrecioInicial(),AleatorioPesoInicial(), 'C', "Verde");
        listaElectrodomesticos[1]=new Lavadora(AleatorioPrecioInicial(), AleatorioPesoInicial());
        listaElectrodomesticos[2]=new Television(AleatorioPrecioInicial(), AleatorioPesoInicial(), 'E', "negro", 42, false);
        listaElectrodomesticos[3]=new Lavadora();
        listaElectrodomesticos[4]=new Electrodomestico(AleatorioPrecioInicial(), AleatorioPesoInicial(), 'D', "gris");
        listaElectrodomesticos[5]=new Lavadora(AleatorioPrecioInicial(),AleatorioPesoInicial(), 'Z', "blanco", 40);
        listaElectrodomesticos[6]=new Television(AleatorioPrecioInicial(), AleatorioPesoInicial());
        listaElectrodomesticos[7]=new Lavadora(AleatorioPrecioInicial(), AleatorioPesoInicial(), 'A', "verde", 15);
        listaElectrodomesticos[8]=new Television(AleatorioPrecioInicial(), AleatorioPesoInicial(), 'C', "naranja", 30, true);
        listaElectrodomesticos[9]=new Electrodomestico(AleatorioPrecioInicial(), AleatorioPesoInicial());
   
        //Creamos las variables que usaremos para almacenar la suma de los precios
        double sumaElectrodomesticos=0;
        double sumaTelevisiones=0;
        double sumaLavadoras=0;
   
        //Recorremos el array invocando el metodo precioFinal
        for(int i=0;i<listaElectrodomesticos.length;i++){
            /*
             * Cuando una Television o una Lavadora este en la posicion del array actual,
             * pasara por su clase y por la de electrodomestico, ya que una television es un electrodomestico.
             * Ejecutamos en cada uno su propia version del metodo precioFinal
             */
   
            if(listaElectrodomesticos[i] instanceof Electrodomestico){
                sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Lavadora){
                sumaLavadoras+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Television){
                sumaTelevisiones+=listaElectrodomesticos[i].precioFinal();
            }
        }
   
        //Mostramos los resultados
        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);
    for (int i = 0; i < listaElectrodomesticos.length; i++) {
    	
		System.out.println(AleatorioPrecioInicial());
	    System.out.println(RandomConsumoEnergeticochar());
		System.out.println(AleatorioPesoInicial());
	}
    }

	}


