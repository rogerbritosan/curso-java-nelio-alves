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
		//j = sc.nextInt(); // não funcionou
		j = sc.nextDouble(); // formato de número double/float de acordo com o idioma do pc
		// se quiser mudar, é preciso configurar o formato americano
		//Locale.setDefault(Locale.US); // não funcionou
		
		// se eu mandar imprimir assim, mesmo digitando número com vírgula, o sistema devolve o número com ponto
		// por conta de estar usando o println
		// usando o printf, o resultado mantém o número com vírgula
		
		System.out.printf("Você digitou o número: %.2f%n", j);
		// System.out.println("Você digitou o número: " + j);
		
		System.out.println("===================================");
		
		char i;
		i = sc.next().charAt(0); // vai pegar apenas o primeiro caracter
		System.out.println("Você digitou: " + i);
		
				
		// sempre fechar qdo não mais utilizar, para desalocar da memória
		sc.close();
		
	}

}
