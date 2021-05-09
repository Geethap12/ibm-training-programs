class Fibonnaci{
	public static void main(String[] args)
	{
		System.out.println("Enter the n terms to be displayed");
		int n = new java.util.Scanner(System.in).nextInt();
		for(int i=1;i<=n;i++){
			System.out.println(fibcalc(i));
		}
	
	}
public static int fibcalc(int a){
			if(a<=2)
				return 1;
			else
				return (fibcalc(a-1)+fibcalc(a-2));

		}
}

