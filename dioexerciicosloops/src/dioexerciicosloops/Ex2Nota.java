package dioexerciicosloops;

import java.util.Scanner;

public class Ex2Nota {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Integer nota;

		System.out.println("Digita uma nota: ");
		nota = teclado.nextInt();

		while (nota < 0 || nota > 10) {
			System.out.println("Nota inválida, digite uma nota entre 0 e 10: ");
			nota = teclado.nextInt();

		}
		System.out.println("Programa finalizado!");	
	}

}
