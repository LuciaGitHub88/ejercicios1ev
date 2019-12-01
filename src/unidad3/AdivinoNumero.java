package unidad3;

import java.util.Random;
import java.util.Scanner;

public class AdivinoNumero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();
		int numcorrecto;
		int valormax;
		int valormin = 0;
		int numprog;
		String respuesta;
		
	System.out.println("Introduce tu n�mero:");
		numcorrecto = teclado.nextInt();
		
	System.out.println("�Cu�l es el valor m�ximo?");
		valormax = teclado.nextInt();
	do {
		
		numprog = aleatorio.nextInt(valormax-valormin+1)+valormin;
		
		if (numprog==numcorrecto) {
			System.out.println("�El n�mero es "+numprog+"?");
			respuesta = teclado.next();
			if (respuesta.contentEquals("si")==true) {
				System.out.println("�Qu� bien, he acertado!");
			} else { 
				System.out.println("Creo que la suerte no te acompa�a, he acertado.");		
			}
			
		} else if (numprog<numcorrecto && numprog>valormin) {
			System.out.println("�El n�mero es "+numprog+"?");
			respuesta = teclado.next();
				if (respuesta.contentEquals("si") ==true) {
					System.out.println("Creo que est�s despistado, �tu n�mero es mayor o menor?");
					respuesta = teclado.next();
	
					if (respuesta.contentEquals("mayor") != true) {
							System.out.println("Tienes que estar m�s atento, creo que tu n�mero es mayor");
					}
				} else if (respuesta.contentEquals("no") == true){
					System.out.println("�Tu n�mero es mayor o menor?");
					respuesta = teclado.next();
					if (respuesta.contentEquals("mayor") != true) {
						System.out.println("Tienes que estar m�s atento, creo que tu n�mero es mayor");
				}
	
		
		}
		valormin = numprog;

		
		}else if(numprog>numcorrecto&&numprog<valormax) {
	
			System.out.println("�El n�mero es " + numprog + "?");
			respuesta = teclado.next();
		
			if (respuesta.contentEquals("si") == true) {
				System.out.println("Creo que est�s despistado, �tu n�mero es mayor o menor?");
				respuesta = teclado.next();
				if (respuesta.contentEquals("menor") != true) {
					System.out.println("Tienes que estar m�s atento, creo que tu n�mero es menor");
				}
			} else if (respuesta.contentEquals("no") == true){
				System.out.println("�Tu n�mero es mayor o menor?");
				respuesta = teclado.next();
					if (respuesta.contentEquals("menor") != true) {
						System.out.println("Tienes que estar m�s atento, creo que tu n�mero es menor");
					}
			}
			valormax = numprog;
		}
	}while(numprog!=numcorrecto);

	teclado.close();	
}

}

