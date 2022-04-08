package br.com.udemy.pratica;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPratica4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//As vezes da erro de input quando coloca valor double
		//para sempre inputar valor com '.', deve se colocar o locale antes do scanner
		Scanner sc = new Scanner(System.in);
		
		int num, horas;
		double val, sal;
		
		System.out.println("Numero do funcionario");
		num = sc.nextInt();
		
		System.out.println("Horas trabalhadas");
		horas = sc.nextInt();
		
		System.out.println("Valor por hora trabalhada");
		val = (double) sc.nextDouble();
		
		sal = horas * val;
		
		System.out.printf("Number: %d", num);
		
		
		System.out.printf("\nSalary = U$%.2f", sal);
		
		sc.close();
	}
}
