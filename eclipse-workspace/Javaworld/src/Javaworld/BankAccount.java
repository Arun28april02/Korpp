package Javaworld;

public class BankAccount {
	void dispay(String account) {
		System.out.println("Account Type   :"+account);
	}
	void display(String name, double num) {
		System.out.println("Name : "+name+",  Account num : "+num);
	}
    void display(String city, float ifsccode, int pin) {
    	System.out.println("City   : "+city+",  IFSCCode : "+ifsccode+",  PIN  : "+pin);
    }
    void display(String city, float ifsccode, int pin, int price) {
    	System.out.println("City   : "+city+",  IFSCCode : "+ifsccode+",  PIN  : "+pin+" " +price);
    }
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
    BankAccount b=new BankAccount();
    b.dispay("Current Account");
    b.display("Arun", 123456);
    b.display("hyd", 562387, 500001);
    b.display("hyd", 562387, 500001,127);
    
	}

}
