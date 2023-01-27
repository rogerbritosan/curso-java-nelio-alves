package estrutura.condicional;

import java.util.Scanner;

public class EstruturaCondicional1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Que horas são?");
		int x = sc.nextInt();

		if (x < 12) {
			System.out.println("Bom dia!");
		} else {
			System.out.println("Boa noite!");
		}
		
		// fechar sempre
		sc.close();

	}

}
