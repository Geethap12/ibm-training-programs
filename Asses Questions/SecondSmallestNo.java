import java.util.*;
class SecondSmallestNo{
	public static void main(String[] args) {
		int a = new SecondSmallestNo().getSecondSmallest();
		System.out.println("The second smallest number is " + a);
		
	}
	int getSecondSmallest(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt(); 
		int []num = new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
			num[i]=sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(num[i]>num[j]){
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		return num[1];

	}
}