import java.util.Scanner;
class PassingStatus
{
	public static void main(String[] args)
	{
		int m1, m2,m3,total=0;
		char res='p';
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 subject marks of a student");
		m1= sc.nextInt();
		m2= sc.nextInt();
		m3= sc.nextInt();
		total = m1+m2+m3;
		if(m1<=40)
		{
			res='f';
		}
		if(m2<=40)
		{
			res='f';
		}
		if(m3<=40)
		{
			res='f';
		}
		if(total<=125)
		{
			res='f';
		}
		if(res=='f')
		{
			System.out.println("The student is failed");
		}
		else
		{
			System.out.println("The student is passed");
		}
	}
}
