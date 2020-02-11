package Calculadora;
import java.util.Scanner;
import java.lang.Math.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el primer valor");
		int N=sc.nextInt();
		System.out.println("Ingrese el segundo valor");
		int e=sc.nextInt();
		
		Operaciones resultado=new Operaciones(N,e);
		
		resultado.suma();
		resultado.resta();
		resultado.multiplicar();
		resultado.dividir();
		
	}

}
