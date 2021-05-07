interface Student{
	void marks();
	void rollno();
}
class Student1 implements Student{
	@Override
	public void marks(){
		System.out.println("First student marks is....");
	}
	@Override
	public void rollno(){
		System.out.println("First student roll no is...");
	}
}
class Student2 implements Student{
	@Override 
	public void marks(){
		System.out.println("Second student marks is...");
	}
	@Override
	public void rollno(){
		System.out.println("Second student roll no is...");
	}
	void hallticket(){
		System.out.println("Second student hallticket no is....");
	}
}
