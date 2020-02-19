package Smartphone;

import java.util.*;

public class Telefono extends Main {
	static Scanner leer = new Scanner(System.in);
	private String Nombre;
	private Integer Numero;
	static int aux = 0;
	static ArrayList<Telefono> telefono = new ArrayList<Telefono>();

	public Telefono(String Nombre, Integer Numero) {
		this.Nombre = Nombre;
		this.Numero = Numero;
	}

	public Telefono() {
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public Integer getNumero() {
		return Numero;
	}

	public void setNumero(Integer numero) {
		this.Numero = numero;
	}

	static public void agregarNumero() {
		telefono.add(new Telefono());
		System.out.println(" Ingrese su nombre ");
		telefono.get(aux).setNombre(leer.next());
		System.out.println("Ingrese su numero de telefono ");
		telefono.get(aux).setNumero(Integer.parseInt(leer.next()));
		aux++;
	}

	@Override
	public String toString() {
		return "Telefono [leer=" + leer + ", Nombre=" + Nombre + ", Numero=" + Numero + "]";
	}

}
