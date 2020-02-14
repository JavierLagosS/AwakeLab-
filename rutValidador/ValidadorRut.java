package rutValidador;
import java.util.*;
public class ValidadorRut {
		static Scanner leer = new Scanner(System.in);
	static byte n1;
	static byte n2;
	static byte n3;
	static byte n4;
	static byte n5;
	static byte n6;
	static byte n7;
	static byte n8;
	static int rutmulti, rutdiv, rutmulti2, rut, verificador;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	System.out.println("Ingrese numero 1");
	n1=leer.nextByte();
	System.out.println("Ingrese numero 2");
	n2=leer.nextByte();
	System.out.println("Ingrese numero 3");
	n3=leer.nextByte();
	System.out.println("Ingrese numero 4");
	n4=leer.nextByte();
	System.out.println("Ingrese numero 5");
	n5=leer.nextByte();
	System.out.println("Ingrese numero 6");
	n6=leer.nextByte();
	System.out.println("Ingrese numero 7");
	n7=leer.nextByte();
	System.out.println("Ingrese numero 8");
	n8=leer.nextByte();
	rutmulti=(n8*2)+(n7*3)+(n6*4)+(n5*5)+(n4*6)+(n3*7)+(n2*2)+(n1*3);
	rutdiv=rutmulti/11;
	rutmulti2=rutdiv*11;
	rut=rutmulti-rutmulti2;
	verificador=11-rut;
	System.out.println("El verificador es");
	System.out.println(+verificador);
	}
}
