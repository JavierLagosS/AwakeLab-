package Calculadora;

import java.lang.Math.*;

public class Operaciones {
	int n1, n2;
	int suma,restar,multiplicar;
	double dividir;
	//Creando Metodo Constructor
	Operaciones (int n1,int n2){
		// Inicializamos los atributos 
		
		this.n1=n1;
		this.n2=n2;
		

	}
	// construir un  constructor vacio para que cuando ingreso un nombre vacio no me aparezca error
	Operaciones (){
	}
	
	public void suma() {
	 suma= n1+n2;
		System.out.println("La suma es  :  " + suma);
		}
	public void resta() {
		 restar= n1-n2;
			System.out.println("La resta es  :  " + restar);
			}
	public void multiplicar() {
		 multiplicar= n1*n2;
			System.out.println("la multiplicacion es  :  " + multiplicar);
			}
	public void dividir() {
		 dividir= n1/n2;
			System.out.println("La division es  :  " + dividir);
			}
	
	}
	
	
	
	

