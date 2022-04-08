package br.com.udemy.pratica2;

import java.util.Scanner;

public class Pratica1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int x = sc.nextInt();
		
		if(x > 0) {
			System.out.println("nao negativo");
		} else {
			System.out.println("negativo");
		}
		
		sc.close();
	}
}
