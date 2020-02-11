package IMC;

public class Persona {
	private String nombre, rut;
	private char sexo;
	private int edad;
	private double peso, altura, imc;

	Persona() {

	}

	Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	Persona(String nombre, int edad, char sexo, String rut, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.rut = rut;
		this.peso = peso;
		this.altura = altura;
	}

	void comprobarSexo(char sexo) {
		if (sexo != 'H' || sexo != 'M')
			this.sexo = 'H';
	}

	public String toString() {
		String cond = calcularIMC();
		String ed = " (Menor de edad)";
		if (esMayorDeEdad() == true) {
			ed = " (Mayor de edad)";
		}
		String detallesPersona = "Nombre: " + nombre + "\nEdad: " + edad + ed + "\nRut: " + rut + "\nSexo: " + sexo
				+ "\nPeso: " + peso + "\nAltura: " + altura + "\nIMC: " + imc + " (" + cond + ")";
		return detallesPersona;
	}

	public boolean esMayorDeEdad() {
		if (edad > 17) {
			return true;
		} else {
			return false;
		}
	}

	public String calcularIMC() {
		int condition = 0;
		String conditionS = "Peso ideal";
		imc = peso / Math.pow(altura, 2);
		if (imc < 20) {
			condition = -1;
			conditionS = "Bajo peso";
		} else if (imc >= 25) {
			condition = 1;
			conditionS = "Sobrepeso";
		}
		return conditionS;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
