package Prueba2102;

import java.util.*;



public class Electrodomestico extends Menu{

		// TODO Auto-generated method stub
	
   // atributos 
     String scolor;
     char cconsumoElectrico ;
     Integer iprecioBase ;
     double dpeso;
	private static String s;
   
	
     public Electrodomestico(double dpeso, Integer iprecioBase) {
		
		this.dpeso = dpeso;
		this.iprecioBase = iprecioBase;
		
	}
     // por defecto
     public Electrodomestico() {
 		
 	}
    
     public Electrodomestico(double dpeso, Integer iprecioBase, String scolor, char cconsumoElectrico) {

 		this.dpeso = dpeso;
 		this.iprecioBase = iprecioBase;
 		this.scolor = scolor;
 		this.cconsumoElectrico = cconsumoElectrico;
 	}
	public String getScolor() {
		return scolor;
	}
	public void setScolor(String scolor) {
		this.scolor = scolor;
	}
	public char getCconsumoElectrico() {
		return cconsumoElectrico;
	}
	public void setCconsumoElectrico(char cconsumoElectrico) {
		this.cconsumoElectrico = cconsumoElectrico;
	}
	public Integer getIprecioBase() {
		return iprecioBase;
	}
	public void setIprecioBase(Integer iprecioBase) {
		this.iprecioBase = iprecioBase;
	}
	public double getDpeso() {
		return dpeso;
	}
	public void setDpeso(double dpeso) {
		this.dpeso = dpeso;
	}
	
	public static String ComprobarConsumoEnergetico(String cconsumoElectrico) {
       
		try {
			switch (cconsumoElectrico) {
            case "A" :
               System.out.println("Has seleccionado la opcion A");
               cconsumoElectrico= "A";
               
                break;
            case "B":
                System.out.println("Has seleccionado la opcion 2");
                cconsumoElectrico= "B";
                break;
            case "C":
                System.out.println("Has seleccionado la opcion 3");
                cconsumoElectrico= "C";
                break;
            case "D":
            	cconsumoElectrico= "D";
                break;
            case "E":
            	cconsumoElectrico= "E";
                break;
            case "F":
            	cconsumoElectrico= "F";
                break;
            default:
            	cconsumoElectrico= "F";
                
            	System.out.println("Se ha asignado el valor por defecto  " + cconsumoElectrico);
            	
                break;
        }
    	
		} catch (Exception e) {
			// TODO: handle exception
     System.out.println("Ingrese el consumo energetico");
       
  
		}
		return cconsumoElectrico;   
		
        
	}
	
	public static String comprobarColor(String  scolor) {
		
		switch (scolor) {
//		blanco, negro, rojo, azul y gris 
		
        case "BLANCO" :
          
           scolor= "BLANCO";
           
            break;
        case "NEGRO":
         
            scolor= "NEGRO";
           
            break;
        case "ROJO":
          
            scolor= "ROJO";
            
            break;
        case "AZUL":
        	 scolor= "AZUL";
        	
            break;
        case "GRIS":
        	 scolor= "GRIS";
        	
            break;
        
        default:
        	 scolor= "BLANCO";
           
        	
        	
            break;
		
		}
		return scolor;
	}

public static Integer precioFinal(double dpeso ) {
	int aux = 0, precioFinal = 0;
	switch (s) {
    case "A" :
       aux= 100;
       
        break;
    case "B":
    	aux= 80;
        
        break;
    case "C":
    	aux= 60;
        break;
    case "D":
    	aux= 50;
        break;
    case "E":
    	aux= 30;
    	 break;
    case "F":
    	aux= 100;
        break;
	}
  if (0<dpeso && 19<=dpeso) {
    precioFinal= aux*10;
}
  if (19<dpeso && 49<=dpeso) {
	    precioFinal= aux*50;
	}
  if (49<dpeso && 79<=dpeso) {
	    precioFinal= aux*80;
	}
  if (79<dpeso ) {
	    precioFinal= aux*100;
	}
  
  
  
return precioFinal;
   
}
	

	
}
	
	
     
	
     // definiendo variables 
     // Por defecto, el color será blanco, el consumo energético será F, el precioBase es de
     //$100.000 y el peso de 5 kg. Usar constantes para ello.
     
    
     
     
     
     
     
     
	


