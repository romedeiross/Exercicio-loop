package exercicio_Arrays;

public class Ex1_Ordem_Inversa_vetor {

	public static void main(String[] args) {
		int[] vetor = { 2, 6, 9, 15, -1, -9 };
		int i;

		System.out.println("Vetor: ");
		int cont = 0;
		while (cont < (vetor.length)) {
			System.out.print(vetor[cont] + " ");
			cont++;
		}
		System.out.println("\nVetor: ");
		for (i = (vetor.length - 1); i >= 0; i--) {

			System.out.print(vetor[i] + " ");
		}

	}
}
