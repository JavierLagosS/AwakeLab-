package Dia2;
import java.util.Arrays;
import java.util.Scanner;
public class Arreglo4x4 {

	public static void main(String[] args) {
		//ejercicio 3 ppt dia 15: arreglos bidimensionales.
		// Crear una matriz de 5 filas y n columnas (se pide al usuario).
		// Rellenarlo con números aleatorios entre 0 y 10
		Scanner sc = new Scanner(System.in);
		int arreglo[][], n;
		System.out.println("Ingrese dimension de arreglo: ");
		n = sc.nextInt();
		arreglo = new int[n][n];
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < n; j++) {
				double numDouble = (Math.random() * 11);
				arreglo[i][j] = (int) numDouble;
			}
		}
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arreglo[i][j] + " ");
		
		sc.close();
			}
		}
		System.out.println(Arrays.deepToString(arreglo).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
	}


}
