import java.util.*;
class SumNumbers{
	public static void main(String[] args) {
		CalcSum cs = new CalcSum();
		int ans = cs.calculateSum();
		System.out.println("The sum = " +ans);
	}
}
class CalcSum{
	int calculateSum(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the last number");
		int n = sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++){
			if((i%3==0)|(i%5==0))
				sum=sum+i;
			
		}
		return sum;
	}
}