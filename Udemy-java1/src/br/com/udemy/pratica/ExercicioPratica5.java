package br.com.udemy.pratica;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPratica5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2;
		int numPec1, numPec2;
		double val1, val2, result;
		
		
		System.out.println("Codigo 1: ");
		cod1 = sc.nextInt();
		
		System.out.println("Numero de peças 1: ");
		numPec1 = sc.nextInt();
		
		System.out.println("Valor unitaro da peça 1: ");
		val1 = sc.nextDouble();
		
		System.out.println("Codigo 2: ");
		cod2 = sc.nextInt();
		
		System.out.println("Numero de peças 2: ");
		numPec2 = sc.nextInt();
		
		System.out.println("Valor unitaro da peça 2: ");
		val2 = sc.nextDouble();
		
		result = (double) (numPec1 * val1) + (numPec2 * val2);
		
		System.out.printf("Valor a pagar: R$%.2f", result);

	}

}
