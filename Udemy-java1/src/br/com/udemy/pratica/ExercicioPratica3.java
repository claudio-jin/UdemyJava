package br.com.udemy.pratica;

import java.util.Scanner;

public class ExercicioPratica3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		int diferenca;
		diferenca = a * b - c * d;
		
		System.out.println(diferenca);
	}
}