package estrutura.sequencial;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double r, A;
		double pi = 3.14159;
		
		System.out.println("Digite o valor do raio (formato de número da máquina), para calcular a área do círculo: ");
		r = sc.nextDouble();
		A = pi * Math.pow(r, 2.0);
		System.out.printf("Valor do raio: " + r + ". Valor da área do círculo: %.4f%n", A);
		
	}

}
