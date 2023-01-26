package estrutura.sequencial;

public class SaidasDeDadosExercicios {
	
	public static void main(String[] args) {
		
		// exercício da aula 23
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products");
		System.out.printf(product1 + ", which price is $ ");
		System.out.printf("%.2f%n", price1);
		System.out.printf(product2 + ", whice price is $ ");
		System.out.printf("%.2f%n", price2);
		
		System.out.println();		
		System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);		
		System.out.println();
		
		System.out.printf("Measure with eight decimal places: ");
		System.out.printf("%.8f%n", measure);
		System.out.printf("US decimal point: %.3f", measure);
		
	}

}
