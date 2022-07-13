package dioexerciicosloops;

import java.util.Scanner;

public class Ex5_Tabuada {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int tabuada;

		System.out.println("Tabuada: ");
		tabuada = teclado.nextInt();

		System.out.println("Tabuada de: " + tabuada);

		for (int i = 0; i <= 100; i++) {
			System.out.println(tabuada + " X " + i + " =" + (tabuada * i));

		}

	}

}
