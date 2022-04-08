
public class OperadoresBitwise {

	public static void main(String[] args) {
		//Compara com os valores binarios de cada numero
		//programação de baixo nivel para redes ou arduino
		
		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2);	//24		e
		System.out.println(n1 | n2);	//125		ou
		System.out.println(n1 ^ n2);	//101		xor
		
		int test = 113;
		int mask = 32;
		
		if ((test & mask) != 0) {
			System.out.println("6th bit is true");
		}else {
			System.out.println("6th bit is false");
		}
		
	}
}
