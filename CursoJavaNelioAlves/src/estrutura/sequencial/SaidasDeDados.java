package estrutura.sequencial;

import java.util.Locale;

import javax.swing.JOptionPane;

public class SaidasDeDados {
	
	public static void main(String[] args) {
		
		// Configurar para o formato de número americano
		Locale.setDefault(Locale.US);
		
		System.out.println("Bem-vindo ao curso Java do Nelio Alves!");
		System.out.print("Olá, ");
		System.out.println("Roger");
		
		System.out.println("----------------");
		
		int y = 39;		
		System.out.println("Quantos anos vc tem " + y + ".");
		
		double x = 12.3458;
		double j = 86.4214;
		double i = 56.2341;
		double pi = 3.14159265358979323846264338327950288419716939937510582097494459230;
		System.out.printf("Valor do x: %.2f%n", x);
		System.out.printf("Valor do j: %.2f%n", j);
		System.out.printf("Valor do i: %.2f%n", i);
		System.out.printf("Valor de pi com 2 casas decimais: %.2f%n", pi);
		System.out.printf("Valor de pi com 5 casas decimais: %.5f%n", pi);
		System.out.printf("Valor de pi com 10 casas decimais: %.10f%n", pi);
		System.out.printf("Valor de pi com 20 casas decimais: %.20f%n", pi);
		
		// %.2f -> "2" significa 2 casas decimais
		// %n -> pula linha
		
	}
	
}
