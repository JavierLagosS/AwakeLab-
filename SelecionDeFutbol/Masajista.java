package SelecionDeFutbol;

public class Masajista extends Seleccion {
	

		private int id;
		private String Nombre;
		private String Apellidos;
		private int Edad;
		private String Titulacion;
		private int aniosExperiencia;

		public Masajista() {
			
		}
		

		public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
			super();
			this.id = id;
			Nombre = nombre;
			Apellidos = apellidos;
			Edad = edad;
			Titulacion = titulacion;
			this.aniosExperiencia = aniosExperiencia;
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


		public String getTitulacion() {
			return Titulacion;
		}


		public void setTitulacion(String titulacion) {
			Titulacion = titulacion;
		}


		public int getAniosExperiencia() {
			return aniosExperiencia;
		}


		public void setAniosExperiencia(int aniosExperiencia) {
			this.aniosExperiencia = aniosExperiencia;
		}


		public void Concentrarse() {
	
		}

		public void Viajar() {

		}

		public void darMasaje() {

		}


		@Override
		public String toString() {
			return "Masajista [id=" + id + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Edad=" + Edad
					+ ", Titulacion=" + Titulacion + ", aniosExperiencia=" + aniosExperiencia + "]";
		}
		
	}

