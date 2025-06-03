package Javaworld;
class Libraryitem{
	void checkin() {
		System.out.println("The Library is opened");
	}
}
class Book extends Libraryitem {
	void readbook() {
		System.out.println("Students are Reading the Books");
	}
}
class TextBook extends Book{
	void solveExercises() {
		System.out.println("Students are Solving the Problems");
	}
}
public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TextBook tb=new TextBook();
      tb.checkin();
      tb.readbook();
      tb.solveExercises();
	}

}
