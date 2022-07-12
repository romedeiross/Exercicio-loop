package dioexerciicosloops;

import java.util.Scanner;

public class Ex3MaiorEMedia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Variáveis
		int numero;
		int maior = 0;
		int soma = 0;
		double media;

		int cont = 0;

		do {
			System.out.println("Digite um número: ");
			numero = teclado.nextInt();

			if (numero > maior)
				maior = numero;

			cont = cont + 1;

			soma = (soma + numero);
			media = (soma / 5);

		}

		while (cont < 5);
		System.out.println("O maior número digitado foi: " + maior);
		System.out.println("A soma dos números digitados é: " + soma);
		System.out.println("A média dos números digitado é: " + media);
	}

}
