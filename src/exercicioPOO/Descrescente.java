package exercicioPOO;

import java.util.Scanner;

public class Descrescente {
	Scanner leitor = new Scanner(System.in);

	public void Contar() {

		int[] numeros = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "º Número");
			numeros[i] = leitor.nextInt();
		}

		for (int i = 9; i >= 0; i--) {
			System.out.println(numeros[i]);
		}
		leitor.close();
	}
}
