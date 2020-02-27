package PruebaNotaMAx;
import java.util.*;
public class Menu {
	 static Electrodomestico listaElectrodomesticos[]=new Electrodomestico[10];
	 static Scanner Leer= new Scanner(System.in);
	  
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
		
		 int Acsii= (int)(Math.random()*5+0);
		 switch(Acsii){
         case 0 :
        	 randomCE='A';
             break;
         case 1:
        	 randomCE='B';
             break;
         case 2:
        	 randomCE='C';
             break;
         case 3:
        	 randomCE='D';
             break;
         case 4:
        	 randomCE='E';
             break;
         case 5:
        	 randomCE='F';
             break;
     }
		
		return  randomCE;
	
	}
	
	public static String RandomColor() {

		 String[] Colores = new String[5];
		{
			Colores[0] = "BLANCO";
			Colores[1] = "NEGRO";
			Colores[2] = "ROJO";
			Colores[3] = "AZUL";
		    Colores[4] = "GRIS";
		}
		int aux2 = (int) (Math.random()*(Colores.length));
		String color = Colores[aux2];
				return color;
	}
	public static int AleatorioPulgadas() {
		   int  aleatorioP= (int) (Math.random()*60+20);
		   return aleatorioP;
	   }
	
	public static Boolean RandomBoleano() {


		
		  // create random object
	      Random randomno = new Random();

	      // get next next boolean value 
	      boolean value = randomno.nextBoolean();
	      return value;
	}
	
//	static void CantidadElectrodomesticos(int cantidadElectrodomesticos) { // En Fase De Prueba
//int aux;
//
//aux = (int) (Math.random() * 3); 
//switch (aux) { // Utilizamos el valor aleatóreo de la variable "aux" para crear
//case 0:
//	listaElectrodomesticos[1]=new Electrodomestico(AleatorioPrecioInicial(),AleatorioPesoInicial(), RandomConsumoEnergeticochar(), RandomColor());
//break;
//case 1:
//
//listaElectrodomesticos[1]=new Lavadora(AleatorioPrecioInicial(), AleatorioPesoInicial(), RandomConsumoEnergeticochar(), RandomColor(),AleatorioPulgadas());
//break;
//default:
//	listaElectrodomesticos[1]=new Television(AleatorioPrecioInicial(), AleatorioPesoInicial(), RandomConsumoEnergeticochar(), RandomColor(),AleatorioPulgadas(),RandomBoleano());
//break;
//}
//}


	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //Creamos un array de Electrodomesticos
      
       
        
               
        //Asignamos cada una de las posiciones como queramos
        listaElectrodomesticos[0]=new Electrodomestico(AleatorioPrecioInicial(),AleatorioPesoInicial(), RandomConsumoEnergeticochar(), RandomColor());
        listaElectrodomesticos[1]=new Lavadora(AleatorioPrecioInicial(), AleatorioPesoInicial());
        listaElectrodomesticos[2]=new Television(AleatorioPrecioInicial(), AleatorioPesoInicial(), RandomConsumoEnergeticochar(), RandomColor(),AleatorioPulgadas(), RandomBoleano());
        listaElectrodomesticos[3]=new Lavadora();
        listaElectrodomesticos[4]=new Electrodomestico(AleatorioPrecioInicial(), AleatorioPesoInicial(), RandomConsumoEnergeticochar(), RandomColor());
        listaElectrodomesticos[5]=new Lavadora(AleatorioPrecioInicial(),AleatorioPesoInicial(), RandomConsumoEnergeticochar(), RandomColor(),AleatorioPulgadas());
        listaElectrodomesticos[6]=new Television(AleatorioPrecioInicial(), AleatorioPesoInicial());
        listaElectrodomesticos[7]=new Lavadora(AleatorioPrecioInicial(), AleatorioPesoInicial(), RandomConsumoEnergeticochar(), RandomColor(),AleatorioPulgadas());
        listaElectrodomesticos[8]=new Television(AleatorioPrecioInicial(), AleatorioPesoInicial(), RandomConsumoEnergeticochar(), RandomColor(),AleatorioPulgadas(),RandomBoleano());
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
//        System.out.println("Cuantos electrodomesticos aleatorios desae crear"); fase de prueba
//        int opciones= Leer.nextInt();
//        CantidadElectrodomesticos(opciones);
//        
        
        //Mostramos los resultados
        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);

    }

	}


