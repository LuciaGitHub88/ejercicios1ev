package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conversor {

	public static void main(String[] args) throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		float dolares;
		float euros;
		System.out.println("Euros ");
		String entrada = teclado.readLine();
		euros = Float.parseFloat(entrada);
		dolares = euros * 1.10f;
		System.out.printf("Dólares EEUU %.2f$", dolares);
	}

}
