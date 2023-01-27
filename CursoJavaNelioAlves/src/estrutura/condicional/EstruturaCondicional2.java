package estrutura.condicional;

import java.util.Scanner;

public class EstruturaCondicional2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as horas:");
		
		int x;
		x = sc.nextInt();
		
		if(x < 12) {
			System.out.println("Bom dia!");
		} else {
			if(x < 18) {
				System.out.println("Boa tarde");
			} else {
				System.out.println("Boa noite");
			}
		}
		
	}

}
