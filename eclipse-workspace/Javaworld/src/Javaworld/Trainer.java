package Javaworld;

public class Trainer {
    String name;
    String qualification;
    int exp;
    void display() {
    	System.out.println("name         :"+name);
    	System.out.println("Qualification:"+qualification);
    	System.out.println("Experince    :"+exp);
    }
    public static void main(String[] args) {
       Trainer t1=new Trainer();
       t1.name="Arun";
       t1.qualification="Btech";
       t1.exp=1;
       t1.display();
       
  
	}

}
