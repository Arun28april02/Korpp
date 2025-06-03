package Javaworld;

abstract class Atm{
	abstract void withdrawl(double amount);
	abstract void deposit(double amount);
	abstract void checkBalance();
	 void welcome() {
		System.out.println("Welcome to The Bank");
	}
}
class BankAtm extends Atm{
	private double balance=10000;

	@Override
	public void withdrawl(double amount) {
		if(amount>balance) {
			System.out.println("Insufficient Balance");
		}else {
			balance-=amount;
			System.out.println("withdrawl :"+amount);
		}
	}
	@Override
	public void deposit(double amount) {
		balance +=amount;
		System.out.println("Deposited  :"+amount);
	}
	@Override
	public void checkBalance() {
		System.out.println("Balance  :"+ balance);
	}
}
public class Abstract_Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     BankAtm b=new BankAtm();
     b.welcome();
     b.withdrawl(30000);
     b.deposit(5000);
     b.checkBalance();
	}

}
