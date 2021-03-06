package entities;
//O uso do final evita que voc? possa criar uma subclasse de savings accoount
public final class SavingsAccount extends Account{

	private Double interestRate;
	
	public SavingsAccount() {
		super();	
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	//O uso do final no m?todo diz que n?o pode ser sobreposto novamente
	@Override
	public final void withdraw(double amount) {
		balance -= amount;
	}
}
