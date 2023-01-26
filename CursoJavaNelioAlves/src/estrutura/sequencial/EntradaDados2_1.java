package estrutura.sequencial;

import java.util.Scanner;

public class EntradaDados2_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine(); // é necessário digitar essa linha vazia, pra consumir o <enter> apertado depois do número, para consumir
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados:");
		System.out.println("Número digitado: " + x);
		System.out.println("texto 1: " + s1);
		System.out.println("texto 2: " + s2);
		System.out.println("texto 3: " + s3);
		
	}

}
