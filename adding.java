class Varargdemo
{
	public static void main(String[] args)
	{
		Varargdemo ref = new Varargdemo();
		System.out.println("The addition of numbers is" + ref.add(5,6));
		System.out.println("The addition of numbers is" + ref.add(5,6,7));
		System.out.println("The addition of numbers is" + ref.add(5,6,8,7));
		System.out.println("The addition of numbers is" + ref.add());
	}
	int add(int... n)
	{
		int len = n.length();
		for(int i=0;i<len;i++)
		{
			int sum = sum+n[i];
		}
		return sum;
	}
}