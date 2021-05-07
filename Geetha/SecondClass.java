package Geetha;
class ScopePackageDemo{
	public static void main(String[] args)
	{
		SecondClass sc = new SecondClass();
		sc.sample();

	}
}
public class SecondClass
	{
	protected void sample()
		{
			System.out.print("Hello i am inside");
		}
	}
