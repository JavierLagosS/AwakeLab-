package SelecionDeFutbol;

public class entrenador extends Seleccion {
	

		private int id;
		private String Nombre;
		private String Apellidos;
		private int Edad;
		private String idFederacion;

		// constructor, getter y setter
		public entrenador() {
			
		}
		
		public entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
			super();
			this.id = id;
			Nombre = nombre;
			Apellidos = apellidos;
			Edad = edad;
			this.idFederacion = idFederacion;
		}
		
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNombre() {
			return Nombre;
		}

		public void setNombre(String nombre) {
			Nombre = nombre;
		}

		public String getApellidos() {
			return Apellidos;
		}

		public void setApellidos(String apellidos) {
			Apellidos = apellidos;
		}

		public int getEdad() {
			return Edad;
		}

		public void setEdad(int edad) {
			Edad = edad;
		}

		public String getIdFederacion() {
			return idFederacion;
		}

		public void setIdFederacion(String idFederacion) {
			this.idFederacion = idFederacion;
		}
		
		
		

		public void Concentrarse() {
		
		}

	

		public void Viajar() {
	
		}

		public void dirigirPartido() {
	
		}

		public void dirigirEntreno() {
	
		}

		@Override
		public String toString() {
			return "entrenador [id=" + id + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Edad=" + Edad
					+ ", idFederacion=" + idFederacion + "]";
		}
		
		
		
	}
