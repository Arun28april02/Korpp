package Javaworld;

class Example
{
static int count=10;
static void display()
{
System.out.println("count is:"+count);	
}
}

public class Keywordstatic {

	public static void main(String[] args) {
		Example.count++;
		Example.display();

	}

}