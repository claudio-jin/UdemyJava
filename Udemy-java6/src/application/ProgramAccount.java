package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramAccount {

	public static void main(String[] args) {
		
		//classe abstrata n?o pode ser instanciada
//		Account acc = new Account(1001, "Alex", 0.0);
		
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//Upcasting
		//Com o Upcasting, posso atribuir um objeto tipo filho para o pai
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//DownCasting
		//Converter um bjeto da superclasse para uma classe
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		
		//Instanceof verifica se a variavel ? do tipo do objeto informado
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;	//Vai dar erro
			acc5.loan(200.00);
			System.out.println("Loan!");
		}//false
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}
		
	}
}
