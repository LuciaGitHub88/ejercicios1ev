package unidad3;

import java.util.Random;
import java.util.Scanner;

public class Dado {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		Scanner teclado = new Scanner(System.in);
		int lanzamientos = 0;
		int dado;
		int contador = 0;
		int lado1 = 0;
		int lado2 = 0;
		int lado3 = 0;
		int lado4 = 0;
		int lado5 = 0;
		int lado6 = 0;
		System.out.println("¿Cuántas veces quiere lanzar el dado?");
		lanzamientos = teclado.nextInt();

		for (contador = 1; contador <= lanzamientos; contador++) {
			dado = aleatorio.nextInt(6) + 1;

			switch (dado) {
			case 1:
				lado1++;
				break;
			case 2:
				lado2++;
				break;
			case 3:
				lado3++;
				break;
			case 4:
				lado4++;
				break;
			case 5:
				lado5++;
				break;
			case 6:
				lado6++;
				break;
			default:
				break;
			}

		}
		System.out.println("La cara 1 ha salido " + lado1 + " veces");
		System.out.println("La cara 2 ha salido " + lado2 + " veces");
		System.out.println("La cara 3 ha salido " + lado3 + " veces");
		System.out.println("La cara 4 ha salido " + lado4 + " veces");
		System.out.println("La cara 5 ha salido " + lado5 + " veces");
		System.out.println("La cara 6 ha salido " + lado6 + " veces");

		teclado.close();
	}
}
