package estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaDados1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String text;
		text = sc.next();
		
		System.out.println("Você digitou: " + text);
		
		System.out.println("===================================");
		
		int x;
		x = sc.nextInt();
		
		System.out.println("Você digitou o número: " + x);
		
		System.out.println("===================================");
		
		Double j;
		j = sc.nextDouble(); // formato de número double/float de acordo com o idioma do pc
		// se quiser mudar, é preciso configurar o formato americano
		Locale.setDefault(Locale.US); // não funcionou
		
		System.out.println("Você digitou o número: " + j);
		
				
		// sempre fechar qdo não mais utilizar, para desalocar da memória
		sc.close();
		
	}

}
