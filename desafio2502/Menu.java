package desafio2502;
import java.util.*;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Leer= new Scanner(System.in);
		
		// Leer 
//		System.out.println("Cuantas celdas y columnas desea usar?");
//		System.out.println("por defecto sera cargado una matriz de dimencion 15");
//  Para que el usuario ingrese la dimencion que desea
//		int idimencion= Leer.nextInt();
		int idimencion= 15;
		
		int Huevo[][] = new int[idimencion][idimencion];
		System.out.println("");
		Tablero.crearCarro();
		
	}

}
