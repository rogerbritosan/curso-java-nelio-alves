package outros.topicos;

import java.util.Scanner;

public class Bitwise {

	public static void main(String[] args) {
		
		// aula 57. Operadores bitwise
		// comparação bit a bit
		// usado em máscara de endereço de rede
		// placas de arduino
		// dispositivos embarcados

		int n1 = 89;
		int n2 = 60;

		System.out.println(n1 & n2); // 24 -> e
		System.out.println(n1 | n2); // 125 -> ou
		System.out.println(n1 ^ n2); // 101 -> ou exclusivo

		System.out.println("==========================");

		System.out.println("Uso do bitwise na prática:");

		Scanner sc = new Scanner(System.in);
		int mask = 32; // ou ob00100000 ou apenas ob100000
		System.out.println(
				"Testar se o bit do 6º grau bate com a máscara. Nesse exemplo, usado o número 32 (em bit), para testar. Digite:");
		int x = sc.nextInt();

		// usando o & bit a bit
		// testar por exemplo, com o número 113
		if ((x & mask) != 0) {
			System.out.println("6º bit é verdadeiro");
		} else {
			System.out.println("6º bit é falso");
		}

	}

}
