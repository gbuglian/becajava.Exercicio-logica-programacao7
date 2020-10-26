package exercico7;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int [] numeros = new int [10];
		
		for(int i = 0; i < 10 ; i++) {
			System.out.println("Digite o " + (i +1) + "º Número");
			numeros[i] = leitor.nextInt();
		}
		
		for(int i = 9; i >= 0 ; i--) {
			System.out.println(numeros[i]);
		}
	}

}
