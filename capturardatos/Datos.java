package capturardatos;

public class Datos {
	String rut, nombre,  apellido,  direccion;
	//Creando Metodo Constructor
	Datos (String rut, String nombre, String apellido, String direccion){
		// Inicializamos los atributos 
		
		this.rut=rut;
		this.nombre=nombre;
		this.apellido=apellido;
		this.direccion=direccion;
		

	}
	// construir un  constructor vacio para que cuando ingreso un nombre vacio no me aparezca error
	Datos (){
	}
	
	
	
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Datos [ Su rut= " + rut + ", Su nombre= " + nombre + ", Su apellido= " + apellido + ", Su direccion=" + direccion + "]";
	}
	
	
}
