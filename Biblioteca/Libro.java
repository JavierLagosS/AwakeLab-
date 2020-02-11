package Biblioteca;
public class Libro {
	private String libro, autor;
	private int ejemplares, ejemplaresPrestados, ejemplaresDisponibles;

	Libro() {
		this.libro = "";
		this.autor = "";
		this.ejemplares = 0;
		this.ejemplaresPrestados = 0;
		this.ejemplaresDisponibles = 0;
	}

	Libro(String libro, String autor, int ejemplares, int ejemplaresPrestados) {
		this.libro = libro;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.ejemplaresPrestados = ejemplaresPrestados;
		ejemplaresDisponibles(ejemplares, ejemplaresPrestados);
	}

	boolean Validador(int a, int b) {
		if (a > b) {
			return false;
		} else {
			return true;
		}
	}

	void Préstamo(int aux) {
		ejemplaresPrestados += aux;
	}

	void Devolución(int aux) {
		ejemplaresPrestados -= aux;
	}

	public String getLibro() {
		return libro;
	}

	public void setLibro(String libro) {
		this.libro = libro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}

	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		this.ejemplaresPrestados = ejemplaresPrestados;
	}

	public int getEjemplaresDisponibles() {
		return ejemplaresDisponibles;
	}

	public void ejemplaresDisponibles(int ejemplares, int ejemplaresPrestados) {
		this.ejemplaresDisponibles = ejemplares - ejemplaresPrestados;
	}
	
	public void setEjemplaresDisponibles(int ejemplaresDisponibles) {
		this.ejemplaresDisponibles = ejemplaresDisponibles;
	}

	public String toString() {
		System.out.println("\n\nSISTEMA DE PRÉSTAMOS\n");
		System.out.println("Libro a solicitar: " + getLibro());
		System.out.println("Autor: " + getAutor());
		System.out.println("Total ejemplares: " + getEjemplares());
		System.out.println("Ejemplares disponibles: " + getEjemplaresDisponibles() + "\n");
		return null;
	}
}
