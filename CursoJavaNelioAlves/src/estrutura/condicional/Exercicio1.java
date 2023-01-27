package estrutura.condicional;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número positivo ou negativo:");
		
		int x;
		x = sc.nextInt();
		
		if(x > 0) {
			System.out.println(x + " é positivo.");
		} else {
			System.out.println(x + " é negativo.");
		}
		
		sc.close();
		
	}

}
