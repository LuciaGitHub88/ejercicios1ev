package unidad3;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el año");
		int año = teclado.nextInt();
		if (año % 4 == 0 && (año % 400 == 0 && año % 100 == 0)) {
			System.out.print("El año es bisiesto");
		} else
			System.out.print("El año no es bisiesto");
		teclado.close();
	}

}
