package unidad3;

import java.util.Scanner;

public class TrianguloFloyd {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numfilas = 0;
		int contador = 1;
		int x = 0;
		int y = 0;
		System.out.println("Introduzca el número de filas");
		numfilas = teclado.nextInt();
		for (x = 1; x <= numfilas; x++) {
			for (y = 1; y <= x; y++) {
				System.out.print(contador + " ");
				contador++;
			}
			System.out.println();
		}

		teclado.close();
	}

}
