package Javaworld;

class Example1 extends Thread {
      public void run() {
    	  for (int i = 1; i <= 10; i++)
    	  System.out.println("Thread 1 :"+i);
      }
}
class Example2 extends Thread{
	public void run() {
		for(int i = 10; i >= 1; i--)
		System.out.println("Thread 2 :"+ i);
	}
}
class MultiThread{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Example1 t=new Example1();
   Example2 e=new Example2();
   t.start();
   e.start();
	}

}
