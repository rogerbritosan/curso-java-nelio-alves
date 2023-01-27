package estrutura.condicional;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A,B;
		
		System.out.println("Digite um número:");
		A = sc.nextInt();
		System.out.println("Digite outro:");
		B = sc.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("São múltiplos entre si.");
		} else {
			System.out.println("Não são múltiplos entre si");
		}
		
		sc.close();
		
	}

}
