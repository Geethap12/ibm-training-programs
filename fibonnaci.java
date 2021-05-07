class fibonnaci{
	public static void main(String[] args)
	{
	int a =0, b=1,c=0;
	System.out.println("The fibonnaci series are");
	System.out.print(a);
	System.out.print(b);
	while(c<=89)
	{
		c=a+b;
		System.out.print(c +"/t");
		a=b;
		b=c;

	}
}

}