package dioexerciicosloops;
import java.util.Scanner;

public class Exe1NomeIdade {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        String nome;
        Integer idade;

        while (true) {
            System.out.println("Nome: ");
            nome = teclado.next();
            if (nome.equals("0")) break;
           System.out.println("Idade: ");
            idade = teclado.nextInt();
        }
            System.out.println("Programa encerrado!");
 
	}

}
