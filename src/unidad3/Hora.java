package unidad3;

import java.util.Scanner;

public class Hora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca la hora\n");
		System.out.print("Hora: ");
		float hora = teclado.nextFloat();
		while (hora < 0 || hora > 23) {
			System.out.print("Formato de hora incorrecto, ha de ser entre 0 y 23.\nVuelva a introducir la hora");
			hora = teclado.nextFloat();
		}
		System.out.print("Introduzca los minutos\n");
		System.out.print("Minutos: ");
		float minuto = teclado.nextFloat();
		while (minuto < 0 || minuto > 59) {
			System.out.print("Formato de minutos incorrecto, ha de ser entre 0 y 59.\nVuelva a introducir los minutos");
			minuto = teclado.nextFloat();
		}
		System.out.print("Introduzca los segundos\n");
		System.out.print("Segundos: ");
		float segundo = teclado.nextFloat();
		while (segundo < 0 || segundo > 59) {
			System.out
					.print("Formato de segundos incorrecto, ha de ser entre 0 y 59.\nVuelva a introducir los segundos");
			segundo = teclado.nextFloat();
		}
		if (segundo == 59) {
			segundo = 0;
			minuto += 1;
		} else {
			segundo += 1;
		}
		if (minuto > 59) {
			minuto = 0;
			hora += 1;
		}
		if (hora > 23) {
			hora = 0;

		}
		System.out.printf("Al segundo siguiente son las %02.0f:%02.0f:%02.0f", hora, minuto, segundo);
		teclado.close();
	}

}
