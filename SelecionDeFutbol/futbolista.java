package SelecionDeFutbol;

public class futbolista extends Seleccion {
	
		private int id;
		private String Nombre;
		private String Apellidos;
		private int Edad;
		private int dorsal;
		private String demarcacion;

		// constructor, getter y setter

		public futbolista() {
			System.out.println("Constructor Vacio");
		}

		public futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
			super();
			this.id = id;
			Nombre = nombre;
			Apellidos = apellidos;
			Edad = edad;
			this.dorsal = dorsal;
			this.demarcacion = demarcacion;
		}
		
		
		
		
	    public void Concentrarse() {
			
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

		public int getDorsal() {
			return dorsal;
		}

		public void setDorsal(int dorsal) {
			this.dorsal = dorsal;
		}

		public String getDemarcacion() {
			return demarcacion;
		}

		public void setDemarcacion(String demarcacion) {
			this.demarcacion = demarcacion;
		}

		public void Viajar() {
			
		}
			

		public void jugarPartido() {
		
		}

		public void entrenar() {
		
		}

		@Override
		public String toString() {
			return "futbolista [id=" + id + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Edad=" + Edad
					+ ", dorsal=" + dorsal + ", demarcacion=" + demarcacion + "]";
		}
	
}
