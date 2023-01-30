package outros.topicos;

public class FuncoesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original = "abcde FGHIJ ABC abc DEFG     ";
		
		System.out.println("Original: " + original);
		System.out.println("toLowerCase: -" + original.toLowerCase() + "-");
		System.out.println("toUpperCase: -" + original.toUpperCase() + "-");
		System.out.println("trim:  -" + original.trim() + "-");
		System.out.println("substring(2): " + original.substring(2));
		System.out.println("substring(2,9): " + original.substring(2,9));
		System.out.println("replace('a','x'): " + original.replace('a', 'x'));
		System.out.println("replace(\"abc\",\"xy\"): " + original.replace("abc", "xy"));
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		for(String part : vect) {
			System.out.println("Parte: " + part);
		}

	}

}
