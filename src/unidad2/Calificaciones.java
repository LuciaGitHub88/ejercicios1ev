package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calificaciones {

	public static void main(String[] args) throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Matem�ticas nota ex�men:");
		float mexamen = Float.parseFloat(teclado.readLine());
		System.out.print("Matem�ticas nota tarea 1:");
		float mtarea1 = Float.parseFloat(teclado.readLine());
		System.out.print("Matem�ticas nota tarea 2:");
		float mtarea2 = Float.parseFloat(teclado.readLine());
		System.out.print("Matem�ticas nota tarea 3:");
		float mtarea3 = Float.parseFloat(teclado.readLine());

		float mediamatematicas = mexamen * 0.9f + (((mtarea1 + mtarea2 + mtarea3) / 3f) * 0.1f);
		System.out.printf("Su nota media de Matem�ticas es de: %.2f\n", mediamatematicas);

		System.out.print("F�sica nota ex�men:");
		float fexamen = Float.parseFloat(teclado.readLine());
		System.out.print("F�sica nota tarea 1:");
		float ftarea1 = Float.parseFloat(teclado.readLine());
		System.out.print("F�sica nota tarea 2:");
		float ftarea2 = Float.parseFloat(teclado.readLine());

		float mediafisica = fexamen * 0.8f + (((ftarea1 + ftarea2) / 2f) * 0.2f);
		System.out.printf("Su nota media de F�sica es de: %.2f\n", mediafisica);

		System.out.print("Qu�mica nota ex�men:");
		float qexamen = Float.parseFloat(teclado.readLine());
		System.out.print("Qu�mica nota tarea 1:");
		float qtarea1 = Float.parseFloat(teclado.readLine());
		System.out.print("Qu�mica nota tarea 2:");
		float qtarea2 = Float.parseFloat(teclado.readLine());
		System.out.print("Qu�mica nota tarea 3:");
		float qtarea3 = Float.parseFloat(teclado.readLine());

		float mediaquimica = qexamen * 0.85f + (((qtarea1 + qtarea2 + qtarea3) / 3f) * 0.15f);
		System.out.printf("Su nota media de Qu�mica es de: %.2f\n", mediaquimica);

		System.out.printf("Su nota global es de: %.2f", ((mediamatematicas + mediafisica + mediaquimica) / 3f));
	}

}
