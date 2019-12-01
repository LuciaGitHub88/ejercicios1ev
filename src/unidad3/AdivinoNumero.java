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
		
	System.out.println("Introduce tu número:");
		numcorrecto = teclado.nextInt();
		
	System.out.println("¿Cuál es el valor máximo?");
		valormax = teclado.nextInt();
	do {
		
		numprog = aleatorio.nextInt(valormax-valormin+1)+valormin;
		
		if (numprog==numcorrecto) {
			System.out.println("¿El número es "+numprog+"?");
			respuesta = teclado.next();
			if (respuesta.contentEquals("si")==true) {
				System.out.println("¡Qué bien, he acertado!");
			} else { 
				System.out.println("Creo que la suerte no te acompaña, he acertado.");		
			}
			
		} else if (numprog<numcorrecto && numprog>valormin) {
			System.out.println("¿El número es "+numprog+"?");
			respuesta = teclado.next();
				if (respuesta.contentEquals("si") ==true) {
					System.out.println("Creo que estás despistado, ¿tu número es mayor o menor?");
					respuesta = teclado.next();
	
					if (respuesta.contentEquals("mayor") != true) {
							System.out.println("Tienes que estar más atento, creo que tu número es mayor");
					}
				} else if (respuesta.contentEquals("no") == true){
					System.out.println("¿Tu número es mayor o menor?");
					respuesta = teclado.next();
					if (respuesta.contentEquals("mayor") != true) {
						System.out.println("Tienes que estar más atento, creo que tu número es mayor");
				}
	
		
		}
		valormin = numprog;

		
		}else if(numprog>numcorrecto&&numprog<valormax) {
	
			System.out.println("¿El número es " + numprog + "?");
			respuesta = teclado.next();
		
			if (respuesta.contentEquals("si") == true) {
				System.out.println("Creo que estás despistado, ¿tu número es mayor o menor?");
				respuesta = teclado.next();
				if (respuesta.contentEquals("menor") != true) {
					System.out.println("Tienes que estar más atento, creo que tu número es menor");
				}
			} else if (respuesta.contentEquals("no") == true){
				System.out.println("¿Tu número es mayor o menor?");
				respuesta = teclado.next();
					if (respuesta.contentEquals("menor") != true) {
						System.out.println("Tienes que estar más atento, creo que tu número es menor");
					}
			}
			valormax = numprog;
		}
	}while(numprog!=numcorrecto);

	teclado.close();	
}

}

