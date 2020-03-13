package marco.treze;

import java.util.Scanner;

public class Teste {
	final static double PI = 3.14;
	public static void main(String[] args) {
		Scanner entradaDeDados = new Scanner(System.in);
		String nome;

		System.out.println("Entre com seu nome:");
		nome = entradaDeDados.next();

		System.out.println("Seu nome é " + nome);
	}
}
