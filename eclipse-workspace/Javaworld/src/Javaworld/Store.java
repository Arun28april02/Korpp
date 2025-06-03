package Javaworld;
class Product{
	void showPrice(){
		System.out.println("Searching for Mobiles");
		}
	}
class ElectronicProduct extends Product{
	void showWarranty() {
		System.out.println("Customer is Asking for warranty");
	}
}
public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ElectronicProduct ep=new ElectronicProduct();
       ep.showPrice();
       ep.showWarranty();
	}
}
