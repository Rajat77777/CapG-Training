package variables;

public class BankAccount {

	private double balance;
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public BankAccount deposit(double money) {
		if(money>0) {
			setBalance(getBalance()+money);
		}else {
			System.out.println("Invalid Money");
		}
		return this;
	}
	public void withdraw(double money) {
		if(money>0 && money <= getBalance()) {
			setBalance(getBalance()-money);
		}else {
			System.out.println("Invalid Money");
		}
		
	}
}
