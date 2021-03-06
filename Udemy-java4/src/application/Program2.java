package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		//array de objeto
		Product[] vect = new Product[n];
		
		for(int i = 0; i<n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
			//Quando criamos um vetor
			//cada campo do vetor se torna uma referencia/ponteiro
			//para o campo heap, sendo necessario instanciar cada objeto atribuido no vetor
		}
		
		double sum = 0.0;
		for (int i = 0; i<n; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum/n;
		System.out.printf("Average price = %.2f%n", avg);
		
		sc.close();
	}
}
