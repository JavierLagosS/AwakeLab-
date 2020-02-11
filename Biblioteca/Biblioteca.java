package Biblioteca;
import java.util.*;

public class Biblioteca {
	static Scanner scr = new Scanner(System.in);
	static Libro libro1 = new Libro();

	public static void main(String[] args) {
		baseLibros();
		préstamoLibros();
	}

	static void baseLibros() {
		System.out.print("BASE DE LIBROS BIBLIOTECA\n\nTítulo del libro: ");
		libro1.setLibro(scr.nextLine());
		System.out.print("Autor: ");
		libro1.setAutor(scr.nextLine());
		do {
			System.out.print("Haber de libros: ");
			libro1.setEjemplares(scr.nextInt());
			scr.nextLine();
			if (libro1.Validador(0, libro1.getEjemplares()) == false)
				System.out.println("Ha ingresado una respuesta incorrecta, reintente:");
		} while (libro1.Validador(0, libro1.getEjemplares()) == false);
		do {
			System.out.print("Libros prestados: ");
			libro1.setEjemplaresPrestados(scr.nextInt());
			scr.nextLine();
			if (libro1.Validador(libro1.getEjemplaresPrestados(), libro1.getEjemplares()) == false
					|| libro1.Validador(0, libro1.getEjemplaresPrestados()) == false)
				System.out.println("Ha ingresado una respuesta incorrecta, reintente:");
		} while (libro1.Validador(libro1.getEjemplaresPrestados(), libro1.getEjemplares()) == false
				|| libro1.Validador(0, libro1.getEjemplaresPrestados()) == false);
	}

	static void préstamoLibros() {
		int aux = 0;
		boolean respBoolean = true;
		String resp;
		do {
			respBoolean = true;
			libro1.setEjemplaresDisponibles(libro1.getEjemplares() - libro1.getEjemplaresPrestados());
			libro1.toString();
//			System.out.println("\n\nSISTEMA DE PRÉSTAMOS\n");
//			System.out.println("Libro a solicitar: " + libro1.getLibro());
//			System.out.println("Autor: " + libro1.getAutor());
//			System.out.println("Total ejemplares: " + libro1.getEjemplares());
//			System.out.println("Ejemplares disponibles: " + libro1.getEjemplaresDisponibles() + "\n");
			do {
				if (respBoolean == false)
					System.out.println("Ha ingresado una respuesta incorrecta, reintente:");
				System.out.println("¿Qué desea hacer?\n(1) Solicitar\n(2) Devolver");
				resp = scr.nextLine();
				respBoolean = validador(resp, "1", "2");
			} while (respBoolean == false);
			if (resp.compareTo("2") == 0) {
				System.out.println("\n¿Cuántos desea devolver?");
				aux = scr.nextInt();
				if (libro1.Validador(aux, libro1.getEjemplaresPrestados()) == true) {
					libro1.Devolución(aux);
				} else {
					System.out.println("No es posible realizar esta operación");
				}
			} else {
				System.out.println("\n¿Cuántos desea solicitar?");
				aux = scr.nextInt();
				if (libro1.Validador(aux, libro1.getEjemplaresDisponibles()) == true) {
					libro1.Préstamo(aux);
				} else {
					System.out.println("No es posible realizar esta operación");
				}
			}
			scr.nextLine();
			System.out.println("\n¿Desea realizar otra operación? (S/N)");
			resp = scr.nextLine();
			respBoolean = validador(resp, "n", "N");
		} while (respBoolean == false);
		System.out.println("SESIÓN FINALIZADA");
	}

	static boolean validador(String resp, String a, String b) {
		boolean respBoolean = false;
		if (resp.compareTo(a) == 0 || resp.compareTo(b) == 0) {
			respBoolean = true;
		} else {
			respBoolean = false;
		}
		return respBoolean;
	}
}