package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		//Comentado ap?s colocar a classe abstrata
//		Account acc1 = new Account(1001, "Alex", 1000.00);
//		acc1.withdraw(200.0);
//		System.out.println(acc1.getBalance());
		
		//Podemos instanciar filho com o tipo do pai
		Account acc2 = new SavingsAccount(1002, "Bob", 1000.00, 0.01);
		acc2.withdraw(200.00);
		System.out.println(acc2.getBalance());
		
		//Utilizando o metodo sobrescrito da classe pai
		Account acc3 = new BusinessAccount(1003, "Claud", 1000.00, 0.01);
		acc3.withdraw(200.00);
		System.out.println(acc3.getBalance());
	}

}
