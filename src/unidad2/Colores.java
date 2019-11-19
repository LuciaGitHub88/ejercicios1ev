package unidad2;

import java.util.Scanner;

public class Colores {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Componentes RGB:\n");
		System.out.print("Rojo: ");
		float rojo = teclado.nextFloat();
		System.out.print("Verde: ");
		float verde = teclado.nextFloat();
		System.out.print("Azul: ");
		float azul = teclado.nextFloat();

		float y = (float) ((0.299 * rojo) + (0.587 * verde) + (0.114 * azul));
		float i = (float) ((0.596 * rojo) - (0.275 * verde) - (0.321 * azul));
		float q = (float) ((0.212 * rojo) - (0.528 * verde) + (0.311 * azul));

		System.out.print("Componentes en el espacio YIQ:\n");
		System.out.printf("Y = %.2f\nI = %.2f\nQ = %.2f", y, i, q);
		teclado.close();
	}

}
