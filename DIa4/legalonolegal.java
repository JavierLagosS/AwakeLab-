package DIa4;

public class legalonolegal {
	int id;
	String nombres;
	//Creando Metodo Constructor
	legalonolegal (String nombres,int id){
		// Inicializamos los atributos 
		
		this.nombres=nombres;
		this.id=id;
		

	}
	// construir un  constructor vacio para que cuando ingreso un nombre vacio no me aparezca error
	legalonolegal (){
	}
	
	
	public void verDatos() {
	
		System.out.println("Su nombre es : " + nombres);
		System.out.println("Su Edad es  : " + id);
		if (id>=18) {
			System.out.println("Felicidades usted es legal");
				}	
		if (id<18) {
			System.out.println("Usted es menor de edad");;
		}
	}
}
