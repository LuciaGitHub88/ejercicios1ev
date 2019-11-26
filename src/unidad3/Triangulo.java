package unidad3;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca un lado del tri�ngulo");
		float lado1 = teclado.nextFloat();
		System.out.println("Introduzca el segundo lado del tri�ngulo");
		float lado2 = teclado.nextFloat();
		System.out.println("Introduzca el tercer lado del tri�ngulo");
		float lado3 = teclado.nextFloat();

		if (((lado1 + lado2) > lado3) && ((lado2 + lado3) > lado1) && ((lado1 + lado3) > lado2)) {
			if ((lado1 != lado2) && (lado2 != lado3) && (lado1 != lado3)) {
				System.out.println("El tri�ngulo es escaleno");
			} else if ((lado1 == lado2) && (lado2 == lado3)) {
				System.out.println("El tri�ngulo es equil�tero");
			} else
				System.out.println("El tri�ngulo es is�sceles");
		} else
			System.out.println("Los lados introducidos no pueden representar un tri�ngulo");
		teclado.close();
	}
}
