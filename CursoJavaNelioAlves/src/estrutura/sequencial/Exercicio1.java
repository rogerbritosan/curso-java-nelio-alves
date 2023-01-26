package estrutura.sequencial;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		System.out.println("Digite um número inteiro: ");
		x = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite outro número inteiro: ");
		y = sc.nextInt();
		
		System.out.println("A soma de " + x + " + " + y + " = " + (x + y));
		
	}

}
