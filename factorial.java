class factorial {
	public static void main(String[] args)
	{
		System.out.println("Enter a number to find factorial");
		int n=new java.util.Scanner(System.in).nextInt();
		int fact = 1;
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of " + n+ "is" + fact);
	}
}