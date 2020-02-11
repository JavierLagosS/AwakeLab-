package IMC;
import java.util.*;
public class MainIMC {

	static Scanner scr = new Scanner(System.in);
	static List<Persona> pacientes = new ArrayList<Persona>();
	static int aux = 0;

	public static void main(String[] args) {
		Recopilación();
		System.out.println("\n" + pacientes.get(aux).toString());
	}
	
	static void Recopilación() {
		pacientes.add(new Persona());
		System.out.println("REVISA TU SALUD\n");
		System.out.print("Nombre: ");
		pacientes.get(aux).setNombre(scr.nextLine());
		System.out.print("Edad: ");
		pacientes.get(aux).setEdad(scr.nextInt());
		scr.nextLine();
		System.out.print("Sexo (M/H): ");
		pacientes.get(aux).setSexo(scr.nextLine().toUpperCase().charAt(0));	
		pacientes.get(aux).comprobarSexo(pacientes.get(aux).getSexo());
		System.out.print("RUT: ");
		pacientes.get(aux).setRut(scr.nextLine());
		System.out.print("Peso (kg): ");
		pacientes.get(aux).setPeso(scr.nextDouble());
		System.out.print("Altura (mts): ");
		pacientes.get(aux).setAltura(scr.nextDouble());
	}


}
