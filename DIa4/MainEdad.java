package DIa4;
import java.util.Scanner;

public class MainEdad {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre");
		String N=sc.next();
		System.out.println("Ingrese su edad");
		int e=sc.nextInt();
		
		legalonolegal alu3=new legalonolegal(N,e);
		
		alu3.verDatos();
		
		
		
	}

}
