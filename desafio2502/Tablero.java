package desafio2502;

import java.util.*;

public class Tablero {

	public static void crearCarro() {
//		Crear Carro: crea una subclase de la clase Carro y la asigna a la lista respectiva.
//		Recuerde que las coordenadas del carro se calculan de forma aleatoria, y no se
//		puede traslapar un carro con otro
		// o 3 Kromis, donde cada una utiliza tres celdas de la matriz y se ubican
		// siempre de
//			forma vertical. Cada celda ocupada por un vehículo de este tipo se define con
//			una letra “K”.
//			o 5 Caguanos, ubicados siempre horizontalmente en la matriz, definidos en ésta
//			con una letra “C” y haciendo uso de dos espacios.
//			o 10 Trupallas, los cuales se representan como una celda en la matriz con la letra
//			“T”.
		String matriz[][] = new String[15][15];
        int aux = 0, aux2 = 0 , aux3=0;
        for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j]=" ";
			}
		}
		
		do {
			int inFilaRandomKromis = (int)(Math.random()*14+0);
			int inColRandomKromis = (int)(Math.random()*12+0);
//			System.out.println(inFilaRandomKromis+" - "+inColRandomKromis);
			if(inFilaRandomKromis >=0 && inFilaRandomKromis<=12) {
				if(inColRandomKromis >=0 && inColRandomKromis<=14) {
					String ocupada = matriz [inFilaRandomKromis][inColRandomKromis  ];
					String ocupada2= matriz [inFilaRandomKromis][inColRandomKromis+1];
					String ocupada3= matriz [inFilaRandomKromis][inColRandomKromis+2];
					if(ocupada.equals(" ")) {
						if (ocupada2.equals(" ")) {
							if (ocupada3.equals(" ")) {
								matriz [inFilaRandomKromis][inColRandomKromis  ] = "K";
								matriz [inFilaRandomKromis+1][inColRandomKromis] = "K";
								matriz [inFilaRandomKromis+2][inColRandomKromis] = "K";
								aux++;
							}
					}
					}
				}
			}
		}while(aux!=3);

	do

	{
		int inFilaRandomCaguano = (int) (Math.random() * 14 + 0);
		int inColRandomCaguano = (int) (Math.random() * 13 + 0);
		if (inFilaRandomCaguano >= 0 && inFilaRandomCaguano <= 14) {
			if (inColRandomCaguano >= 0 && inColRandomCaguano <= 13) {
				String ocupada = matriz[inFilaRandomCaguano][inColRandomCaguano];
				String ocupada2 = matriz[inFilaRandomCaguano + 1][inColRandomCaguano];
				if (ocupada.equals(" ")) {
					if (ocupada2.equals(" ")) {
						matriz[inFilaRandomCaguano][inColRandomCaguano] = "C";
						matriz[inFilaRandomCaguano][inColRandomCaguano + 1] = "C";
						aux2++;
					}
				}

			}
		}

	}while(aux2!=5);

	do
	{
		int inFilaRandomTrupalla = (int) (Math.random() * (14 + 0));
		int inColRandomTrupalla = (int) (Math.random() * (14 + 0));
		if (inFilaRandomTrupalla >= 0 && inFilaRandomTrupalla <= 14) {
			if (inColRandomTrupalla >= 0 && inColRandomTrupalla <= 14) {
				String ocupada = matriz[inFilaRandomTrupalla][inColRandomTrupalla];
				if (ocupada.equals(" ")) {
					matriz[inFilaRandomTrupalla][inColRandomTrupalla] = "T";
					aux3++;

				}
			}
		}

	}while(aux3!=10);


// para mostrar la matriz generada
	for(
	int i = 0;i<matriz.length;i++)
	{
		for (int j = 0; j < matriz.length; j++) {
			System.out.print(matriz[i][j] + " ");

		}
		System.out.println();
	}

}


 
   public static void lanzarHuevo() {
	   String matrizHuevo[][] = new String[15][15];
	   Scanner Leer = new Scanner(System.in);
	   
     
       for (int i = 0; i < matrizHuevo.length; i++) {
			for (int j = 0; j < matrizHuevo.length; j++) {
				 matrizHuevo[i][j]="0";
				 
			}}
				 
				 
				 
				System.out.println("ingresa la fila que quiera atacar");
				int ifila = Leer.nextInt() ;
				System.out.println("Ingrese la columna que quiera atacar");
				int icolumna = Leer.nextInt();
				
				if (ifila >= 0 && ifila <= 14) {
					if (icolumna >= 0 && icolumna <= 14) {
							matrizHuevo[ifila][icolumna] = "H";	
							
					}
				}
			
		
   for(int i = 0;i<matrizHuevo.length;i++){
				for (int j = 0; j < matrizHuevo.length; j++) {
					System.out.print(matrizHuevo[i][j] + " ");
				}
				System.out.println();
			}
   
	   
   }
}
