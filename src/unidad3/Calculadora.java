package unidad3;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float num1;
		float num2;
		float resultado;
		int operacion;
		do {
			System.out.println("Escoja operación:\n1.Suma\n2.Resta\n3.Multiplicación\n4.División\n5.Salir");
			operacion = teclado.nextInt();

			switch (operacion) {
			case 1:
				System.out.println("Introduzca el primer número");
				num1 = teclado.nextFloat();
				System.out.println("Introduzca el segundo número");
				num2 = teclado.nextFloat();
				resultado = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + resultado);
				break;
			case 2:
				System.out.println("Introduzca el primer número");
				num1 = teclado.nextFloat();
				System.out.println("Introduzca el segundo número");
				num2 = teclado.nextFloat();
				resultado = num1 - num2;
				System.out.println(num1 + " - " + num2 + " = " + resultado);
				break;
			case 3:
				System.out.println("Introduzca el primer número");
				num1 = teclado.nextFloat();
				System.out.println("Introduzca el segundo número");
				num2 = teclado.nextFloat();
				resultado = num1 * num2;
				System.out.println(num1 + " * " + num2 + " = " + resultado);
				break;
			case 4:
				System.out.println("Introduzca el primer número");
				num1 = teclado.nextFloat();
				System.out.println("Introduzca el segundo número");
				num2 = teclado.nextFloat();
				resultado = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + resultado);
				break;
			case 5:
				break;
			}
		} while (operacion < 5);

		teclado.close();
	}

}
