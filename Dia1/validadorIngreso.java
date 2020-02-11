package Dia1;
import java.util.Scanner;
public class validadorIngreso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
	    int login=0;
		int pass=0;
		int intentos=1;
		int maximo=3;
	    boolean entrada = false;
				while((login!=1809)||(pass!=1234)&& (intentos<maximo)){
					System.out.print("introduzca un login: ");
					login=leer.nextInt();
					System.out.print("Introduzca su pass:");
					pass=leer.nextInt();
					entrada= true;
					if(entrada=true) {
						System.out.println("datos erroneos intente nuevamente");
						System.out.println("*********************************");
					}
					if(intentos==3){
						System.out.println("acceso denegado..");
						intentos=intentos-maximo;
						System.exit(intentos);
					}
					intentos++;
					}
		           System.out.println("login y pass, correctos...");
		         

	}

}
