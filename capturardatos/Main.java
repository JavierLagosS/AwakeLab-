package capturardatos;

import java.util.Scanner;

import Calculadora.Operaciones;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su rut ");
		String Rut=sc.nextLine();
		System.out.println("Ingrese su nombre");
		String Nombre=sc.nextLine();
		System.out.println("Ingrese su Apellido");
		String Apellido =sc.nextLine();
		System.out.println("ingrese su direccion");
        String Direccion =sc.nextLine();
		
        Datos persona=new Datos (Rut,Nombre,Apellido,Direccion);
		System.out.println(persona.toString());
	}

}
