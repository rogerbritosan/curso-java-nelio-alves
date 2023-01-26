package estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // padrão americano configurado
		Scanner sc = new Scanner(System.in);
		double A, B, C;		
		double triangulo, circulo, trapezio, quadrado, retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = A * C / 2.0;
		circulo = 3.14159 * Math.pow(C, 2.0);
		trapezio = (A + B) * C / 2.0;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.println("Valores digitados (usar ponto p/ decimais):");
		System.out.println(A + " " + B + " " + C);
		
		System.out.println();
		System.out.printf("Triângulo: %.3f%n", triangulo);
		System.out.printf("Círculo: %.3f%n", circulo);
		System.out.printf("Trapézio: %.3f%n", trapezio);
		System.out.printf("Quadrado: %.3f%n", quadrado);
		System.out.printf("Retângulo: %.3f%n", retangulo);
		
		
	}

}
