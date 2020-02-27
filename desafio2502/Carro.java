package desafio2502;

public class Carro {
	protected Integer iOcupantes;
	protected String sfechaDeIngreso;
	protected Integer iFila;
	protected Integer iColumna;
	
	public Carro () {}

	public Carro(Integer iOcupantes, String sfechaDeIngreso, Integer iFila, Integer iColumna) {
		super();
		this.iOcupantes = iOcupantes;
		this.sfechaDeIngreso = sfechaDeIngreso;
		this.iFila = iFila;
		this.iColumna = iColumna;
	}

	public Integer getiOcupantes() {
		return iOcupantes;
	}

	public void setiOcupantes(Integer iOcupantes) {
		this.iOcupantes = iOcupantes;
	}

	public String getSfechaDeIngreso() {
		return sfechaDeIngreso;
	}

	public void setSfechaDeIngreso(String sfechaDeIngreso) {
		this.sfechaDeIngreso = sfechaDeIngreso;
	}

	public Integer getiFila() {
		return iFila;
	}

	public void setiFila(Integer iFila) {
		this.iFila = iFila;
	}

	public Integer getiColumna() {
		return iColumna;
	}

	public void setiColumna(Integer iColumna) {
		this.iColumna = iColumna;
	}
	
	public String toString() {
//        System.out.println("");
//        System.out.println("La cantidad de ocupantes: "+getiOcupantes()+"\n");
//        System.out.println("La fecha de ingreso a la Institucion es: "+getSfechaDeIngreso()+"\n");
//        System.out.println("La fila en la cual se posiciona es: "+getiFila()+"\n");
//        System.out.println("La Columna en la cual se posiciona es: "+getiColumna()+"\n");
//        System.out.println("");
        return "La cantidad de ocupantes: "+getiOcupantes()+"\nLa Fecha de Ingreso es: "+getSfechaDeIngreso()+""
        		+ "\nLa fila en la cual se posiciona es: "+getiFila()+"\nLa columna en la cual se posiciona es: "+getiColumna();
	}
	
}
