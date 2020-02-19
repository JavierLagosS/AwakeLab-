package Smartphone;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		        int numeroBuscado ;
		        Scanner sn = new Scanner(System.in);
		        boolean salir = false;
		        int opcion; //Guardaremos la opcion del usuario
		 
		        while (!salir) {
		 
		            System.out.println("1. Agregar un Numero");
		            System.out.println("2. Llamar");
		            System.out.println("3. Buscar un numero guardado");
		            System.out.println("4. Salir");
		 
		            try {
		 
		                System.out.println("Escribe una de las opciones");
		                opcion = sn.nextInt();
		 
		                switch (opcion) {
		                    case 1:
		                       System.out.println("Has seleccionado la opcion 1");
		                       Telefono.agregarNumero();
		                        break;
		                    case 2:
		                        System.out.println("Has seleccionado la opcion 2");
		                        Celular.realizarLlamada();
		                        break;
		                    case 3:
		                        System.out.println("Has seleccionado la opcion 3");
		                        int aux = Celular.buscarNumero();
		                        if (aux != -1) {
		                        	System.out.println("Numero encontrado: " + Telefono.telefono.get(aux).getNumero());
		                        } else {
		                        	System.out.println("No fue encontrado");
		                        }
		                        	
		                        break;
		                    case 4:
		                        salir = true;
		                        break;
		                    default:
		                        System.out.println("Solo números entre 1 y 4");
		                }
		            } catch (InputMismatchException e) {
		                System.out.println("Debes insertar un número");
		                sn.next();
		            }
		        }
		 
		    }

	
		 
		}
	       
	


