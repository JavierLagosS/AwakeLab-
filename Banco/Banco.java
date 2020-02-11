package Banco;
import java.util.*;

public class Banco {
	static Scanner scr = new Scanner(System.in);
	static List<Cuenta> cuentas = new ArrayList<Cuenta>();

	public static void main(String[] args) {
		int aux = 0;
		System.out.println("SISTEMA BANCARIO DEL PATO DONALD\nIngreso de cuentas\n");
		System.out.print("Nombre: ");
		cuentas.add(new Cuenta());
		cuentas.get(aux).setsTitular(scr.nextLine());
		boolean respBoolean = true;
		boolean respBoolean2 = true;
		String resp;
		double monto;
		do {
			if (respBoolean == false && respBoolean2 == false)
				System.out.println("Ha ingresado una respuesta incorrecta, reintente:");
			System.out.println("�Desea ingresar un monto inicial? (S/N)");
			resp = scr.nextLine();
			respBoolean = validador(resp, "S", "s");
			respBoolean2 = validador(resp, "N", "n");
		} while (respBoolean == false && respBoolean2 == false);
		monto = 0;
		if (resp.compareTo("S") == 0 || resp.compareTo("s") == 0) {
			System.out.print("Monto: ");
			monto = scr.nextDouble();
			cuentas.get(aux).setdCantidad(monto);
			scr.nextLine();
		}
		respBoolean = true;
		respBoolean2 = true;
		do {
			respBoolean = true;
			do {
				if (respBoolean == false)
					System.out.println("Ha ingresado una respuesta incorrecta, reintente:");
				System.out.println("\n�Qu� operaci�n desea realizar?\n(1) Ingresar\n(2) Retirar");
				resp = scr.nextLine();
				respBoolean = validador(resp, "1", "2");
			} while (respBoolean == false);
			System.out.print("Ingrese la cantidad: ");
			if (resp.compareTo("2") == 0) {
				cuentas.get(aux).Retiro(scr.nextDouble());
			} else {
				cuentas.get(aux).Ingreso(scr.nextDouble());
			}
			cuentas.get(aux).toString();
			scr.nextLine();
			System.out.println("\n�Desea realizar otra operaci�n? (S/N)");
			resp = scr.nextLine();
			respBoolean = validador(resp, "n", "N");
		} while (respBoolean == false);
		System.out.println("\nSESI�N FINALIZADA");

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
