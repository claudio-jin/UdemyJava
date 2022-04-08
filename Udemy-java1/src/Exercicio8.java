
public class Exercicio8 {
	public static void main(String[] args) {
		// Expressao ternaria
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

		// ou

		double preco1 = 34.5;
		double desconto1;
		if (preco1 < 20.0) {
			desconto1 = preco * 0.1;
		} else {
			desconto1 = preco * 0.05;
		}
		
		System.out.println(desconto);
		System.out.println(desconto1);

	}
}
