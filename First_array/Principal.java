package First_array;
import java.util.*;


public class Principal {

	public static void main(String[] args) {
     
		//DECLARAMOS ARRAY
		ArrayList<Paises> paises = new ArrayList<>();
		Scanner leer= new Scanner(System.in);
		String Pais;
		String Capital;
		int largo;
		
		
	// ARREGLO DE NOMBRES Y EDADES PARA AGREGA AL ARRAYLIST
		 //PARA INGRESAR MANUALMEMNTE
				System.out.println("Cual es la longitud del array que desea");
		 largo=leer.nextInt();
		 for (int i = 0; i < largo; i++) {
			
		
		 paises.add(new Paises());
		 System.out.println(" Ingrese un Pais");	
		 paises.get(i).setPaises(leer.next());
		 System.out.println("Ingrese la capital:");
		 paises.get(i).setCapitales(leer.next());
		 }
		 
		 //OCUPANDO CONSTRUCTOR NO VACIO
//		 paises.add(new Paises(Pais,Capital));		 
		 
		 //OCUPANDO CONSTRUCTOR VACIO
//		 paises.add(new Paises());
		 
		 //COMO AGREGABAMOS VALORES ANTES
//		 Paises per1 = new Paises();
//		 per1.setCapitales(Capital);
		 
		 //CON ARRAYLIST LO HARIAMOS ASI
//		 paises.get(0).setPaises(Pais);
//		 paises.get(0).setCapitales(Capital);
		 
		 //Y PARA MOSTRARLO
		 for (int i = 0; i < paises.size(); i++) {
			System.out.println(paises.get(i).toString()); 
		}
		
		 

//		//COMO MOSTRAR LOS DATOS DESDE UN ARRAYLIST
//	 System.out.println("PERSONA EN 7 PO ="+per1.get(6));
//	 System.out.println("NOMBRE PERSONA"
//	 		+ " POSICION INGRESADA:="+per1.get(6).getPaises()+" Edad= "+per1.get(6).getCapitales());
	 
//	 //CICLO PARA RECORRER UN ARRAYLIST MOSTRANDO INDICE Y EDAD
//	 for (int i=0;i<per1.size();i++) {
//		 
//    System.out.println("indice : ["+i+"] Nombre= "+per1.get(i).getPaises()+ "[Edad]="+per1.get(i).getCapitales());
//	 }
//		//ARROJA UN  ENTERO CON EL TAMAÑO DEL ARRAYLIST
//	 System.out.println("TAMAÑO TOTAL"+ per1.size());
	 
	 
	
	 }
	}
