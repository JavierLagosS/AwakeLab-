package Prueba2102;
import java.util.*;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Leer= new Scanner(System.in);
		String scolor;
		double dpeso;
		char cconsumoElectrico;	
		
		
		// Consumo Electrico y valor por defecto en F
	
	System.out.println("ingrese el consumo energetico");
	cconsumoElectrico=  Leer.next().charAt(0);
	String s=Character.toString(cconsumoElectrico);  
	Electrodomestico.ComprobarConsumoEnergetico(s.toUpperCase());
	System.out.println(s);
	
	
	// Corroborar Color  
	  

	System.out.println("Ingrese el color del electrodomestico : Colores Disponibles  blanco, negro, rojo, azul y gris ");
	scolor = Leer.next();
    Electrodomestico.comprobarColor(scolor.toUpperCase());
   
    
    // Precio Final
  
    System.out.println("Ingrese el peso del electrodomestico");
    dpeso = Leer.nextDouble();
    Electrodomestico.precioFinal(dpeso);
    System.out.println(dpeso);
    
    
	}

}
