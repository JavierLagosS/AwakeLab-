package Dia1;
import java.util.Scanner;
import java.math.*;
public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Mejore su el programa de calculadora, debe validar datos numéricos , manejo de errores, 	
		//además de  un debe tener un Usuario y password, el cual luego de errar 3 veces, cerrara nuestro programa.
		//Nuestro programa no se debe cerrar,hasta que el usuario desee salir.
		//Debe existir la opción de seguir realizando otras operaciones hasta que el usuario desee salir
	   int Opcion;
	   Integer primerNumero, segundoNumero;
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Calculadora");
	    System.out.println("Opciones ");
	    System.out.println("1 - Sumar");
	    System.out.println("2 - Restar");
	    System.out.println("3 - Multiplicacion");
	    System.out.println("4 - Division");
	    System.out.println("Para salir presione X ");
	    System.out.println("Ingrese su opcion");
	   Opcion=scan.nextInt();
	  
	   switch(Opcion) {
	   case 1:
	      System.out.println(" Usted eligio la opcion : Suma");
	      System.out.println("Ingrese el Primer numero");
		   primerNumero=scan.nextInt();
		  System.out.println("Ingrese el Segundo Digito");
		   segundoNumero=scan.nextInt();
		   int suma = Math.addExact(primerNumero, segundoNumero);
		   System.out.println(" La suma es  : " + suma);
	     break;
	     
	   case 2:
		   System.out.println(" Usted eligio la opcion : Resta ");
		      System.out.println("Ingrese el Primer numero");
			   primerNumero=scan.nextInt();
			  System.out.println("Ingrese el Segundo Digito");
			   segundoNumero=scan.nextInt();
			   
			   int resta  = Math.subtractExact(primerNumero, segundoNumero);
			   System.out.println(" La resta es  : " + resta);
	     break;
	   case 3:
		   System.out.println(" Usted eligio la opcion : Multiplicacion ");
		      System.out.println("Ingrese el Primer numero");
			   primerNumero=scan.nextInt();
			  System.out.println("Ingrese el Segundo Digito");
			   segundoNumero=scan.nextInt();
			   
			   int multiplicacion  = Math.multiplyExact(primerNumero, segundoNumero);
			   System.out.println(" La Multiplicacion  es  : " + multiplicacion);
		     break;
	   case 4:
		   System.out.println(" Usted eligio la opcion : Multiplicacion ");
		      System.out.println("Ingrese el Primer numero");
			   primerNumero=scan.nextInt();
			  System.out.println("Ingrese el Segundo Digito");
			   segundoNumero=scan.nextInt();
			   
			   int division = Math.floorDiv(primerNumero, segundoNumero);
			   System.out.println(" La Multiplicacion  es  : " + division);
		     break;
	   default:
	     System.out.println("Ingresa una opcion Valida ");
	   }
	 }
	    
	   
	
	}


