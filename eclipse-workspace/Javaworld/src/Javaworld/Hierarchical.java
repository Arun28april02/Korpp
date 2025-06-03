package Javaworld;
class GrandParent {
	void work() {
		System.out.println("Parent has two Kids ");
	}
}
class Girl extends GrandParent{
	void girl() {
		System.out.println("One is a Girl");
	}
}
class Boy extends GrandParent{
	void study() {
		System.out.println("One is a Boy");
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Boy b=new Boy();
     b.study();
     b.work();
     Girl g=new Girl();
     g.girl();
     g.work();     
     }
}
