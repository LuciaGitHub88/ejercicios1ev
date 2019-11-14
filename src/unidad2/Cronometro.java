package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cronometro {

	public static void main(String[] args) throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String nombre;
		long tiempo1;
		long tiempo2;
		float cronometro;

		System.out.print("Introduzca su nombre: ");
		tiempo1 = System.currentTimeMillis();
		nombre = teclado.readLine();
		tiempo2 = System.currentTimeMillis();
		cronometro = (tiempo2 - tiempo1) / 1000f;
		System.out.printf("Hola %s ha tardado %.3f", nombre, cronometro);
	}

}
