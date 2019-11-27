package unidad3;

import java.util.Scanner;

public class Multiplicar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numtabla = 0;
		int numfallos = 0;
		int respuesta = 0;
		int contador = 0;
		int repetir = 0;
		do {
			System.out.println("¿Qué tabla desea repasar?");
			numtabla = teclado.nextInt();
			for (contador = 1; contador <= 10; contador++) {
				System.out.print(numtabla + " * " + contador + " = ");
				respuesta = teclado.nextInt();
				if (numtabla * contador != respuesta) {
					System.out.println("Su respuesta no es correcta el resultado es " + (numtabla * contador));
					numfallos++;
				}
			}
			if (numfallos > 1) {
				System.out.println("Ha suspendido");
			} else {
				System.out.println("Ha aprobado");
			}
			System.out.println("¿Qué desea hacer?:\n1.Repasar otra tabla\n2.Salir");
			repetir = teclado.nextInt();
		} while (repetir == 1);
		teclado.close();
	}

}
