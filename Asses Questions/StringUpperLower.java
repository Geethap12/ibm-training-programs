import java.util.*;
class StringUpperLower{
	public static void main(String[] args) {
		new StringUpperLower().stringUpLow();
		
	}
	void stringUpLow(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of strings in an array");
		int n = sc.nextInt();
		String arr[] = new String[n];
		System.out.println("Enter the strings");

		for(int i=0;i<=n;i++)
			arr[i]=sc.nextLine();
	}
}