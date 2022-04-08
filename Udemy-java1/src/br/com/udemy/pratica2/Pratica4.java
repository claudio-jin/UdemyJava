package br.com.udemy.pratica2;

import java.util.Scanner;

public class Pratica4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial: ");
		int x = sc.nextInt();
		
		System.out.println("Digite a hora final: ");
		int y = sc.nextInt();
		
		int duracao;
		if (x < y) {
			duracao = y - x;
		}
		else {
			duracao = 24 - x + y;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
		
	}
}
