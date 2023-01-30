package outros.topicos;

import java.util.Scanner;

public class MaiorNumero {
	
	
	
	public static void main(String[] args) {
		
		// Maior número
		// 60. Funções (sintaxe)
		
		System.out.println("Digite 3 números inteiros:");
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int numMaior = 0;
		
		if(num1 > num2 && num1 > num3) {
			numMaior = num1; 
		} else if (num2 > num3) {
			numMaior = num2;
		} else {
			numMaior = num3;
		}
		
		System.out.println("Número maior: " + numMaior);
		
		sc.close();
		
	}

}
