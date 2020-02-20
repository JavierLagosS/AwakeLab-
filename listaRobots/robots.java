package listaRobots;

import java.util.*;

import First_array.Paises;

public class robots extends main {
	static ArrayList<robots> robots = new ArrayList<>();
	
	
	@Override
	public String toString() {
		return  " Numero del robot = " + stotalRobots + ", porcentaje de vida = "
				+ porcentajedevida + "]";
	}

	String cantidadRobots;
	double stotalRobots;
	static boolean aux;
	double porcentajedevida;

	public double getStotalRobots() {
		return stotalRobots;
	}

	public void setStotalRobots(double d) {
		this.stotalRobots = d;
	}

	public robots(String cantidadRobots) {
		this.cantidadRobots = cantidadRobots;
	}

	public robots() {

	}

	static boolean Validador(String cantidadRobots) {
		try {
			Double.parseDouble(cantidadRobots);
			aux = true;
		} catch (Exception e) {
			aux = false;
		}

		return aux;

	}
	
	public static ArrayList<robots> getRobots() {
		return robots;
	}


	public String getCantidadRobots() {
		return cantidadRobots;
	}

	public void setCantidadRobots(String cantidadRobots2) {
		this.cantidadRobots = cantidadRobots2;
	}

	public double getPorcentajedevida() {
		return porcentajedevida;
	}

	public void setPorcentajedevida(double d) {
		this.porcentajedevida = d;
	}

	static void  CreadorFrankestein(int cantidadRobots) {
//		for (int i = 0; i < largo; i++) {
//			
//			
//			 paises.add(new Paises());
//			 System.out.println(" Ingrese un Pais");	
//			 paises.get(i).setPaises(leer.next());
//			 System.out.println("Ingrese la capital:");
//			 paises.get(i).setCapitales(leer.next());
//			 }
		
		for (int i = 0; i < cantidadRobots; i++) {
			robots.add(new robots());
			robots.get(i).setStotalRobots(i);
			robots.get(i).setPorcentajedevida(Math.floor(Math.random()*100+1));
		}
		
		
	}
	
	static void Mostrar() {
		//Y PARA MOSTRARLO
		 for (int i = 0; i < robots.size(); i++) {
			System.out.println(robots.get(i).toString()); 
		}
	}
    static void ordenar() {
    	Arrays.sort(int robots);
	
	
}


}
