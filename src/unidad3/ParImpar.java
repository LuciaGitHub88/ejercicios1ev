package unidad3;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un n�mero: ");
		int numero = teclado.nextInt();
		if (numero % 2 == 0) {
			System.out.print("El n�mero introducido es par");
		} else
			System.out.print("El n�mero introducido es impar");
		teclado.close();
	}

}
