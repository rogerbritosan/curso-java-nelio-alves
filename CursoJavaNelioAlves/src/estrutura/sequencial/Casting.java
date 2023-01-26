package estrutura.sequencial;

public class Casting {
	
	public static void main(String[] args) {
		
		int x;
		double y; 
		
		x = 5;		
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		// Cálculo do trapézio
		System.out.println("Cálculo do trapézio:");
		
		double b, B, h, area;
		
		b = 6.0; // convenção sempre colocar o .0 em números double
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		/*
		 * se fosse float, colocar sempre o f após o número
		 * b = 6f;
		 * B = 8f;
		 * h = 5f;
		 * 
		 * area = (b + B) / 2f * h; precisa mesmo colocar o f no 2, nesse caso?
		 * 
		 * */
		
		System.out.println(area);
		
		System.out.println("========================");
		
		int a, c;
		double resultado;
		
		a = 5;
		c = 2;
		
		resultado = a / c;
		System.out.println(resultado); // número truncado
		
		// solução
		// casting
		resultado = (double) a / c;
		System.out.println(resultado);
		
		System.out.println("========================");
		
		double t;
		int j;
		
		t = 5.2;
		// j = t; // não deixa
		j = (int) t; // solução: casting com perda de informação
		
		System.out.println(j);
		
	}

}
