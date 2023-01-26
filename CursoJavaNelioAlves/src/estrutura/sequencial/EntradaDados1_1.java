package estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaDados1_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String texto;
		int x;
		double y;
		
		texto = sc.next();
		x = sc.nextInt();
		y = sc.nextDouble(); // não esquecer de digitar o float no formato conforme o idioma do computador, nesse caso ex: 5,4 -> imprimirá 5.4
		
		System.out.println("Você digitou o texto: " + texto);
		System.out.println("Inteiro digitado: " + x);
		System.out.println("O float digitado foi: " + y);
		
	}

}
