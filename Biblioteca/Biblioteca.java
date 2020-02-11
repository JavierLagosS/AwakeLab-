package Biblioteca;
import java.util.*;

public class Biblioteca {
	static Scanner scr = new Scanner(System.in);
	static Libro libro1 = new Libro();

	public static void main(String[] args) {
		baseLibros();
		pr�stamoLibros();
	}

	static void baseLibros() {
		System.out.print("BASE DE LIBROS BIBLIOTECA\n\nT�tulo del libro: ");
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

	static void pr�stamoLibros() {
		int aux = 0;
		boolean respBoolean = true;
		String resp;
		do {
			respBoolean = true;
			libro1.setEjemplaresDisponibles(libro1.getEjemplares() - libro1.getEjemplaresPrestados());
			libro1.toString();
//			System.out.println("\n\nSISTEMA DE PR�STAMOS\n");
//			System.out.println("Libro a solicitar: " + libro1.getLibro());
//			System.out.println("Autor: " + libro1.getAutor());
//			System.out.println("Total ejemplares: " + libro1.getEjemplares());
//			System.out.println("Ejemplares disponibles: " + libro1.getEjemplaresDisponibles() + "\n");
			do {
				if (respBoolean == false)
					System.out.println("Ha ingresado una respuesta incorrecta, reintente:");
				System.out.println("�Qu� desea hacer?\n(1) Solicitar\n(2) Devolver");
				resp = scr.nextLine();
				respBoolean = validador(resp, "1", "2");
			} while (respBoolean == false);
			if (resp.compareTo("2") == 0) {
				System.out.println("\n�Cu�ntos desea devolver?");
				aux = scr.nextInt();
				if (libro1.Validador(aux, libro1.getEjemplaresPrestados()) == true) {
					libro1.Devoluci�n(aux);
				} else {
					System.out.println("No es posible realizar esta operaci�n");
				}
			} else {
				System.out.println("\n�Cu�ntos desea solicitar?");
				aux = scr.nextInt();
				if (libro1.Validador(aux, libro1.getEjemplaresDisponibles()) == true) {
					libro1.Pr�stamo(aux);
				} else {
					System.out.println("No es posible realizar esta operaci�n");
				}
			}
			scr.nextLine();
			System.out.println("\n�Desea realizar otra operaci�n? (S/N)");
			resp = scr.nextLine();
			respBoolean = validador(resp, "n", "N");
		} while (respBoolean == false);
		System.out.println("SESI�N FINALIZADA");
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