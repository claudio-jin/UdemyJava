package application;

import entities.Client;

public class Program9 {

	public static void main(String[] args) {
		//Equals
		
		String a = "Maria";
		String b = "Alex";
		
		System.out.println(a.equals(b));
		
		//Hashcode
		String c = "Maria";
		String d = "Alex";
		
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		
		System.out.println("Cliente");
		
		Client c1 = new Client("Claudio", "claudiojin@hotmail.com");
		Client c2 = new Client("Claudio", "rafael@hotmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		//para comparar referencias de memoria
		System.out.println(c1 == c2);
		
	}
}
