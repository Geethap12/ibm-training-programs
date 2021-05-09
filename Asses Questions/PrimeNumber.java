import java.util.Scanner;
class PrimeNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer to print all the prime numbers up to the integer");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			int c=0;
			for(int j=i;j>=1;j--){
				if(i%j==0){
					c++;
				}
			}
			if(c==2){
				System.out.println(i);
			}
		}
	}
}