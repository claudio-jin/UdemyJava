package br.com.udemy.pratica;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosPratica2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double area;
		
		
		System.out.println("Informe o valor do raio:");
		double raio = sc.nextDouble();
		
		area = pi*Math.pow(raio, 2.0);
		
		Locale.setDefault(Locale.US);
		System.out.printf("A = %.4f", area);
	}
}
