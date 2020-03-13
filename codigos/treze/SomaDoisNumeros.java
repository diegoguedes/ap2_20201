package marco.treze;

import java.util.Scanner;

public class SomaDoisNumeros {
	public static void main(String[] args) {
		int numero1, numero2, soma;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com o primeiro numero");
		numero1 = entrada.nextInt();

		System.out.println("Entre com o segundo numero");
		numero2 = entrada.nextInt();

		soma = numero1 + numero2;

		System.out.println("A soma é " + soma);
	}
}
