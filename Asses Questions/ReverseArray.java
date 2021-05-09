import java.util.Scanner;
class ReverseArray{
	public static void main(String[] args) {
		new ReverseArray().getSorted();
	}
	void getSorted(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=scan.nextInt();
		int []num = new int[n];
		System.out.println("Enter the elements into an array");
		for(int i=0;i<n;i++){
			num[i]=scan.nextInt();
		}
		System.out.println("The reversed array is : ");
		for(int i=n-1;i>=0;i--){
			System.out.print(num[i]+ " ");
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(num[i]>num[j]){
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;

				}
			}
		}
		System.out.println("\nElements of an array in assesding order" );
		for(int i=0;i<n;i++)
			System.out.print(num[i]+ " ");
	}
}