package Biblioteca;
import java.util.Scanner;

import capturardatos.Datos;
public class Biblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	 String sTitulo, sAutor;
	 Integer iEjemplares, iPrestados;
	 System.out.println("Ingrese el titulo del libro  ");
	 sTitulo= sc.nextLine();
	 System.out.println("Ingrese el autor del libro  ");
	 sAutor= sc.nextLine();
	 System.out.println(" la cantidad de libros que tenemos es ?  ");
	 iEjemplares= sc.nextInt();
	 System.out.println(" la cantidad de libros que tenemos  prestados es ?  ");
	 iPrestados= sc.nextInt();
	 
	 Libro Libroconsulta=new Libro (sTitulo, sAutor, iEjemplares, iPrestados);
     //SE REALIZA PRESTAMOS LIBRO UNO SI SE PUEDE PRESTAAR DEVULVE TRUE
     //FALSE EN EL CASO QUE NO SE PUEDA PRESTAR
     if (Libroconsulta.prestamo()) {
         System.out.println("Se ha prestado el libro " + Libroconsulta.getLibro());
     } else {
         System.out.println("No quedan ejemplares del libro "
     + Libroconsulta.getLibro() + " para prestar");
     }
	 
	 
	 System.out.println(Libroconsulta.toString());
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}

}
