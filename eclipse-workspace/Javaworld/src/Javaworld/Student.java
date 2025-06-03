package Javaworld;

public class Student {
  String name;
  int marks;
  char grade;
  
  void setDetails(String name,int marks, char grade) {
	  this.name=name;
	  this.marks=marks;
	  this.grade=grade;
  }  
	  void display() {
		System.out.println("Student Name is   :"+name);
		System.out.println("Student Marks are :"+marks);
		System.out.println("Student Grade is  :"+grade);
	  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s=new Student();
      
        s.setDetails("Ramesh", 96,'A');
        s.display();  
        s.setDetails("Rajesh", 95, 'B');
        s.display();
	}
}
                                        