class MethodsDemo {
	public static void main(String[] args)
	{ 
		int product = 0;
		product = new MethodsDemo().input();
		System.out.println("The product is =" + product);
	}
	int input()
	{
		System.out.println("Enter two numbers");
		int a = new java.util.Scanner(System.in).nextInt();
		int b = new java.util.Scanner(System.in).nextInt();
		int prod = new MethodsDemo().multiply(a,b);
		return prod;
	}
	int multiply(int c, int d)
	{
		int mul = c*d;
		return mul;
	}
}