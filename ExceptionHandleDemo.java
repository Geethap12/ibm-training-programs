import java.io.IOException;
class ExceptionHandleDemo {
	public static void main(String[] args)throws ArithmeticException{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res = new ExceptionHandleDemo().divide(a,b);
		System.out.println(res);
	}
	int divide(int a1, int b1){
		return a1/b1;
	}
}

