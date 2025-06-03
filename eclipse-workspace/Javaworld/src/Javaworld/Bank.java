package Javaworld;
class Account {
	void openaccount() {
		System.out.println("Customer Account is Created");
	}
}
 class Savingsaccount extends Account{
	 void depositsaving() {
		 System.out.println("It is a DepositSaving Account");
	 }
 }
 class Currentaccount extends Account{
	 void issuecheckbook() {
		 System.out.println("check book is Issued");
	 }
 }
 public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Currentaccount c =new Currentaccount();
   
     c.openaccount();
     c.issuecheckbook();
    
     
     Savingsaccount s=new Savingsaccount();
     s.openaccount();
     s.depositsaving();
	}

}
