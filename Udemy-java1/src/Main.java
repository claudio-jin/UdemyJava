import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		
		double x = 10.35784;
		
		System.out.println(y);
		
		System.out.println(x);
		
		//Imprime algo formatado
		System.out.printf("%.2f%n", x);  //retorna o valor com virgula
		//%n quebra a linha
		//%.2f formata o valor
		Locale.setDefault(Locale.US);	//configurar a saida
		
		System.out.printf("%.4f%n", x);
		
		System.out.println("RESULTADO = " + x + " METROS");
		
		//print não quebra a linha
		System.out.print("Hello world!");		
		//println quebra a linha
		System.out.println("Good morning!");
		
		
		System.out.printf("RESULTADO = %.2f metros%n ", x);
		
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
