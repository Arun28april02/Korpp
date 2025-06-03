package Javaworld;
class OverLoad {
	void count(int a) {
		System.out.println("10 Animals"+a);
	}
    //@Overloading
	void count(int a, int b) 
	{
		System.out.println("5 Dogs" +a + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   OverLoad a=new OverLoad();
   a.count(10,20);
   a.count(10);
	}
	}

