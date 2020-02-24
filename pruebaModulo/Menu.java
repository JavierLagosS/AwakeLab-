package pruebaModulo;
import java.text.ParsePosition;
import java.util.*;


public class Menu {
	static	Scanner Leer= new Scanner(System.in);
	 static ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Crea un array de Electrodomésticos de 10 posiciones

		
		int ipreciobase;
		String scolor;
		char cconsumoEnergetico;
		double dpeso;
		String stipo;
	
		// Mostramos las opciones si el objeto a ingresa es una lavadora , un televisor o un Electrodomestico en general
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
      
        while (!salir) {
 for (int i = 0; i < 2; i++) {
	  electrodomesticos.add(new Electrodomestico());
	
      
            System.out.println("Eliga una de las siguientes opciones a agregar");
            System.out.println("1. Lavadora ");
            System.out.println("2. Television");
            System.out.println("3. Electrodomestico");
            System.out.println("Escribe una de las opciones");
            opcion = Leer.nextInt();
 
            try {
 
               
         //   	precio base, color, consumo energético (letras entre A y F) y peso.
         
                switch (opcion) {
                    case 1:
                       System.out.println("Ingresaste una Lavadora al sistema");
                    electrodomesticos.get(i).setStipo("Lavadora");
                    
                    // pidiendo los datos al usuario 
                    System.out.println("Cual es el precio del producto?");
                    electrodomesticos.get(i).setIprecioBase(Leer.nextInt());
                    // validacion del color 
                    System.out.println("Cual es el color? blanco negro , rojo , azul, gris");
                    scolor=Leer.next();
                    Electrodomestico.comprobarColor(scolor);
                    electrodomesticos.get(i).setScolor(scolor.toUpperCase());
                    // validacion del consumo energetico
                    
                    System.out.println("cual es el consumo energetico (de la A hasta la F)");
                    cconsumoEnergetico=Leer.next().charAt(0);
                    Electrodomestico.ComprobarConsumoEnergetico( cconsumoEnergetico);
                    electrodomesticos.get(i).setCconsumoEnergetico( cconsumoEnergetico);
                    
                    System.out.println("Cual es el peso?");
                    
                    electrodomesticos.get(i).setDpeso(Leer.nextDouble());
                    
                    break;
                       
                    case 2:
                        System.out.println("Ingresaste una Television al sistema");
                        
                        electrodomesticos.get(i).setStipo("Television");
                        // pidiendo los datos al usuario 
                        
                        System.out.println("Cual es el precio del producto?");
                        electrodomesticos.get(i).setIprecioBase(Leer.nextInt());
                        
                        System.out.println("Cual es el color? blanco negro , rojo , azul, gris");
                        scolor=Leer.next();
                        Electrodomestico.comprobarColor(scolor);
                        electrodomesticos.get(i).setScolor(scolor.toUpperCase());
                        
                        System.out.println("cual es el consumo energetico (de la A hasta la F)");
                     
                        cconsumoEnergetico=Leer.next().charAt(0);
                        Electrodomestico.ComprobarConsumoEnergetico( cconsumoEnergetico);
                        electrodomesticos.get(i).setCconsumoEnergetico( cconsumoEnergetico);
                        
                        System.out.println("Cual es el peso?");
                        
                        electrodomesticos.get(i).setDpeso(Leer.nextDouble());
                        
                        System.out.println("Incluye sintonizador TDT ");
                      
                        break;
                    case 3:
                        System.out.println("Ingresaste un Electrodomestico al sistema");
                        electrodomesticos.get(i).setStipo("Electrodomestico");
                        // pidiendo los datos al usuario 
                        System.out.println("Cual es el precio del producto?");
                        electrodomesticos.get(i).setIprecioBase(Leer.nextInt());
                        
                        System.out.println("Cual es el color? blanco negro , rojo , azul, gris");
                        scolor=Leer.next();
                        Electrodomestico.comprobarColor(scolor);
                        electrodomesticos.get(i).setScolor(scolor.toUpperCase());
                        
                        System.out.println("cual es el consumo energetico (de la A hasta la F)");
                     
                        cconsumoEnergetico=Leer.next().charAt(0);
                        // ignoramos las minusculas en char 
                        char cadena = Character.toUpperCase(cconsumoEnergetico);
                        
                        Electrodomestico.ComprobarConsumoEnergetico( cadena);
                        electrodomesticos.get(i).setCconsumoEnergetico( cadena);
                        
                        System.out.println("Cual es el peso?");
                        
                        electrodomesticos.get(i).setDpeso(Leer.nextDouble());
                        break;

                    default:
                        System.out.println("Ingrese una opcion valida por favor ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                Leer.next();
            }
           
            
        }
 salir=true;
    
    }
  //Y PARA MOSTRARLO
Electrodomestico electrodomestico = new Electrodomestico();
 for (int i = 0; i < electrodomesticos.size(); i++) {
	System.out.println(electrodomesticos.get(i).toString()); 
 
 }
 double sumaElectrodomesticos=0;
 double sumaTelevisiones=0;
 double sumaLavadoras=0;
 
 for(int i=0;i<electrodomesticos.size();i++){


     if(electrodomesticos.get(i) instanceof Electrodomestico){
    	 sumaElectrodomesticos=electrodomesticos.get(i).precioFinal();
    	
    	if(electrodomesticos.get(i) instanceof Lavadora){
            sumaLavadoras+=electrodomesticos.get(i).precioFinal();
        }
        if(electrodomesticos.get(i) instanceof Television){
           sumaTelevisiones = electrodomesticos.get(i).precioFinal();
        }
     }
 
 }
 System.out.println("**************************************************************************************************");
 System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
 System.out.println("");
 System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
 System.out.println("");
 System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);
 System.out.println("**************************************************************************************************");
 
	}
}
