package Dia2;
import java.util.Scanner;
public class CalculadoraMatriz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Boolean loginUser = false;
		String[ ] sUserPass = new String[2];
		String user, pass;
		Integer contadorLogin = 0;
		sUserPass[0] = "Talento";
		sUserPass[1] = "123456";
		String usuario= "";
		do{
			System.out.println("user:");
			user = scan.nextLine();
			System.out.println("password:");
			pass = scan.nextLine();
			if(! user.equals(sUserPass[0]) || ! pass.equals(sUserPass[1]) ) {
				System.out.println("Login erroneo");
				contadorLogin = contadorLogin +1;
				loginUser = false;
			}else {
				loginUser = true;
			}
		}while(loginUser != true);
		System.out.println("");
		if (contadorLogin > 3 ) {
			System.out.println("*************************");
			System.out.println("Ha reallizado mas de 3 intentos...Adios!!");
			System.out.println("*************************");
		}else {
			System.out.println("*****************");
			System.out.println(" login correcto ");
			System.out.println("*****************");
			menu();			
		}
		scan.close();
	}
	public static void menu() {
		Integer opcion = 0;
		Scanner scan = new Scanner(System.in);
		Boolean exit=true;
		do{
			System.out.println("");
			System.out.println("******* Menu Calculadora *******");
			System.out.println("");
			System.out.println(" (0) Exit");
			System.out.println(" (1) Sumar");  
			System.out.println(" (2) Restar.");
			System.out.println(" (3) Dividir.");
			System.out.println(" (4) Multiplicar.");
			do {
				System.out.println(" Seleccione su opcion");
				opcion = scan.nextInt();
				if(opcion< 0) {
					opcion = 5;
				}
				}while(opcion > 4);
		switch (opcion) {
		case 0:
			System.out.println("See you later"); 
			System.exit(0);
			break;
		case 1:
				sumar();
				break;
		case 2:
			 	restar();
			 	break;
		case 3:
				dividir();
				break;
		case 4:
				multiplicar();
				break;
		default:
				break;
		}
		}while(exit==true);
		scan.close();
	}
	public static boolean sumar(){
		Integer suma = 0;
		int [ ] numeros = new int[2];
		System.out.println("Sumar 2 numeros");
		numeros = obtenerNumeros();
		suma = numeros[0]+numeros[1];
		System.out.println("La suma es : "+ suma);
		return true;
	} 
	public static boolean restar(){
		Integer resta = 0;
		int [ ] numeros = new int[2];
		System.out.println("Sumar 2 numeros");
		numeros = obtenerNumeros();
		resta = numeros[0]-numeros[1];
		System.out.println("El resultado de la resta es : "+ resta);
		return true;
	} 
	public static boolean dividir(){
		String numero1, numero2;
		Double dividir = 0.0;
		Boolean validador = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Dividir 2 numeros");
		do {
		System.out.println("Ingrese primer numero");
		numero1= scan.nextLine();
		validador = isNumeric(numero1);
		}while(!validador);
		do {
			System.out.println("Ingrese segundo numero");
			numero2= scan.nextLine();
			validador = isNumeric(numero2);
			if(isNumeric(numero2)) {
				if(Integer.parseInt(numero2) == 0) {
					System.out.println("No se puede dividir por CERO");
					validador = false;
				}
			}
		}while(!validador);
		dividir = Double.parseDouble(numero1)/Double.parseDouble(numero2);
		System.out.println("El resultado de la Division es : "+ dividir);
		scan.close();
		return true;
	} 
	public static boolean multiplicar(){
		int [ ] numeros = new int[2];
		Integer multiplicacion = 0 ; 
		System.out.println("Multiplicar 2 numeros");
		numeros = obtenerNumeros();
		multiplicacion = numeros[0] * numeros[1];
		System.out.println("El resultado de la multiplicacion es: "+ multiplicacion);
		return true;
	} 
	public static int[] obtenerNumeros() {
		Scanner scan = new Scanner(System.in);
		int [ ] numeros = new int[2];
		String numero1, numero2;
		Boolean validador = false;
		do {
		System.out.println("Ingrese primer numero");
		numero1= scan.nextLine();
		validador = isNumeric(numero1);
		}while(!validador);
		do {
			System.out.println("Ingrese segundo numero");
			numero2= scan.nextLine();
			validador = isNumeric(numero2);
		}while(!validador);
		numeros[0] = Integer.parseInt(numero1);
		numeros[1] = Integer.parseInt(numero2);
		scan.close();
		return numeros;
	}
	private static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
}
