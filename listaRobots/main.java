package listaRobots;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		String cantidadRobots;
		  Scanner Leer= new Scanner(System.in);
		System.out.println("Cuantos robots desea crear");
		cantidadRobots= Leer.next();
		robots.Validador(cantidadRobots);
		while (robots.Validador(cantidadRobots) == false ) {
			System.out.println("Ingrese una opcion valida");
			cantidadRobots = Leer.next();
		}
		robots.CreadorFrankestein(Integer.parseInt(cantidadRobots));
		
		robots.Mostrar();
		
		robots.ordenar();
	
	}
}
