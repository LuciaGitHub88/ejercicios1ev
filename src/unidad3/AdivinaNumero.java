package unidad3;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();
		int num2 = aleatorio.nextInt(100000 - 1000 + 1) + 1000;
		int num1 = aleatorio.nextInt(num2 - 1 + 1) + 1;
		System.out.println("n�mero 1 " + num1 + "\nn�mero 2 " + num2 + "\n");
		System.out.println("He pensado un n�mero entre 1 y " + num2 + ". Adivina cu�l es");
		int respuesta;

		do {
			respuesta = teclado.nextInt();

			if (respuesta == num1) {
				System.out.println("Has acertado, enhorabuena");
			} else if (respuesta > num1) {
				System.out.println("Mi n�mero es menor, vuelve a intentarlo");
			} else {
				System.out.println("Mi n�mero es mayor, vuelve a intentarlo");
			}

		} while (respuesta != num1);

		teclado.close();
	}
}
