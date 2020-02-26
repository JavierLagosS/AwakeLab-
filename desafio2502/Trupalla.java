package desafio2502;
import java.util.*;
public class Trupalla {

	Scanner sc=new Scanner(System.in);
	String sNombre;
	Integer iArmadura; //entre 1 y 5
	
	
	
	public Trupalla() {
		super();
	}
	
	
	public Trupalla(String sNombre, Integer iArmadura) {
		super();
		this.sNombre = sNombre;
		this.iArmadura = iArmadura;
	}
	

	public void ingreseNombre() {
		System.out.printf("\nIngrese nombre: ");
		sNombre=sc.nextLine();
	
	}
	
	public void ingreseNivelArmadura() {
		
		boolean salir=false;
		do {
			System.out.printf("\nNivel de Armadura");
			iArmadura=sc.nextInt();
			if(iArmadura>0 && iArmadura<6) {
				salir=true;
			}else {
				System.out.printf("\n\"El nivel de armadura tiene que estar entre 1 y 5\"");
				salir=false;
			}
		}while(salir);
	}
	
	
}
