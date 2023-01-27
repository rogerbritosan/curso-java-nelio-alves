package estrutura.condicional;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número qualquer:");
		
		int x;
		x = sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.println(x + " é número par.");
		} else {
			System.out.println(x + " vc digitou um número ímpar.");
		}
		
		
		
	}

}
