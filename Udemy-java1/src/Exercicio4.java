import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		
		System.out.println("Voce digitou: " + x);
		
		char z;
		z = sc.next().charAt(0);
		System.out.println(z);
		
		sc.close();
	}
}
