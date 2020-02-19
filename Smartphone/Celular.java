package Smartphone;

import java.util.ArrayList;
import java.util.Scanner;

public class Celular extends Telefono {
	static Scanner leer = new Scanner(System.in);
	static Double dultimaLlamada;
	static Double dtotalLlamadas;

	public static void realizarLlamada() {
		// cambia el valor de la última llamada y suma la llamada a los minutos totales.
		
		System.out.println("La duracion de la ultima llamada es " + dultimaLlamada);
		dtotalLlamadas = dtotalLlamadas + dtotalLlamadas;
		System.out.println("La duracion de todas las llamadas es " + dtotalLlamadas);
	}

	public static int buscarNumero() {
		System.out.println("Ingrese el numero a buscar");
		String nombre = leer.nextLine();
		int aux = -1;
		for (int i = 0; i < telefono.size(); i++) {
			if (telefono.get(i).getNombre().equalsIgnoreCase(nombre)) {
				aux = i;
				break;
			}
		}
		return aux;

	}

}
