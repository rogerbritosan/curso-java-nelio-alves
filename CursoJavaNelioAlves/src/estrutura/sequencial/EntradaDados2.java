package estrutura.sequencial;

import java.util.Scanner;

public class EntradaDados2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados");
		System.out.println("texto 1: " + s1);
		System.out.println("texto 2: " + s2);
		System.out.println("texto 3: " + s3);
		
	}

}
