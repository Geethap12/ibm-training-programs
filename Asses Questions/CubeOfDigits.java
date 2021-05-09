class CubeOfDigits{
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter a number more than 1 digit");
		int n = scan.nextInt();
		int sum=0;
		while(n!=0)
		{
			int a = n%10;
			sum += a*a*a;
			n/=10;
		}
		System.out.println(sum);
	}
}