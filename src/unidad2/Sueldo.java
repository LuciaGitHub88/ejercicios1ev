package unidad2;

import java.util.Scanner;

public class Sueldo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Sueldo: ");
		float sueldo = teclado.nextFloat();
		System.out.print("Venta 1: ");
		float venta1 = teclado.nextFloat();
		System.out.print("Venta 2: ");
		float venta2 = teclado.nextFloat();
		System.out.print("Venta 3: ");
		float venta3 = teclado.nextFloat();

		System.out.printf(
				"Total a cobrar: %.2f€\nSueldo: %.2f€\nVenta 1: %.2f€\nVenta 2: %.2f€\nVenta 3: %.2f€\nTotal comisiones: %.2f€",
				sueldo + (venta1 * 0.1) + (venta2 * 0.1) + (venta3 * 0.1), sueldo, venta1 * 0.1, venta2 * 0.1,
				venta3 * 0.1, (venta1 * 0.1) + (venta2 * 0.1) + (venta3 * 0.1));
		teclado.close();
	}

}
