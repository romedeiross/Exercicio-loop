package dioexerciicosloops;
import java.util.Scanner;

public class Ex4_ParImpar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int qntNumeros;
		int numero;
		int qntPares = 0; 
		int qntImpares = 0;
		
		System.out.println("Informe a quantidade de números inteiros: ");
		qntNumeros = teclado.nextInt();
		
		int cont = 0;
		
		do {
			
			System.out.println("número: ");
			numero = teclado.nextInt();
			cont++;
			
			if (numero % 2 == 0) 
				qntPares++;
			
			else 				
				qntImpares++;
			
		}while (cont < qntNumeros);
		
		System.out.println("Quantidades de números Pares: " + qntPares);
		System.out.println("Quantidades de números Impares: " + qntImpares);

	}

}
