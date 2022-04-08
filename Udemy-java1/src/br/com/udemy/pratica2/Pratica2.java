package br.com.udemy.pratica2;

import java.util.Scanner;

public class Pratica2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int x = sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("par");
		} else {
			System.out.println("impar");
		}
		
		sc.close();
	}

}
