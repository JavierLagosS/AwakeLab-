package desafio2502;
import java.util.*;
public class Tablero extends Menu {

	public static void crearCarro() {
//		Crear Carro: crea una subclase de la clase Carro y la asigna a la lista respectiva.
//		Recuerde que las coordenadas del carro se calculan de forma aleatoria, y no se
//		puede traslapar un carro con otro
		
		int matriz[][] = new int[15][15];	
		
		
//		o 3 Kromis, donde cada una utiliza tres celdas de la matriz y se ubican siempre de
//		forma vertical. Cada celda ocupada por un vehículo de este tipo se define con
//		una letra “K”.
//		o 5 Caguanos, ubicados siempre horizontalmente en la matriz, definidos en ésta
//		con una letra “C” y haciendo uso de dos espacios.
//		o 10 Trupallas, los cuales se representan como una celda en la matriz con la letra
//		“T”.
		
		
		
		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[i].length; j++){
				
				System.out.print(matriz[i][j] + "   ");	// Imprime elemento
			}
			System.out.println();	// Imprime salto de línea
		}
		
		
	}

	

}
