package unidad3;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca un lado del triángulo");
		float lado1 = teclado.nextFloat();
		System.out.println("Introduzca el segundo lado del triángulo");
		float lado2 = teclado.nextFloat();
		System.out.println("Introduzca el tercer lado del triángulo");
		float lado3 = teclado.nextFloat();

		if (((lado1 + lado2) > lado3) && ((lado2 + lado3) > lado1) && ((lado1 + lado3) > lado2)) {
			if ((lado1 != lado2) && (lado2 != lado3) && (lado1 != lado3)) {
				System.out.println("El triángulo es escaleno");
			} else if ((lado1 == lado2) && (lado2 == lado3)) {
				System.out.println("El triángulo es equilátero");
			} else
				System.out.println("El triángulo es isósceles");
		} else
			System.out.println("Los lados introducidos no pueden representar un triángulo");
		teclado.close();
	}
}
