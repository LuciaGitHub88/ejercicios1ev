package unidad3;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el a�o");
		int a�o = teclado.nextInt();
		if (a�o % 4 == 0 && (a�o % 400 == 0 && a�o % 100 == 0)) {
			System.out.print("El a�o es bisiesto");
		} else
			System.out.print("El a�o no es bisiesto");
		teclado.close();
	}

}
