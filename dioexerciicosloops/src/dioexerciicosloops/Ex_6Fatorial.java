package dioexerciicosloops;

import java.util.Scanner;

public class Ex_6Fatorial {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int fatorial;
		int multiplicacao = 1;

		System.out.println("Fatorial: ");
		fatorial = teclado.nextInt();
		
		System.out.print(fatorial + "! = ");
		for (int i = fatorial; i >= 1; i--) {
			multiplicacao = multiplicacao * i;

		}
		System.out.println(multiplicacao);
	}

}
