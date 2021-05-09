import java.util.Scanner;
class TrafficSignal
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the light");
		System.out.println("1.RED"+"\n"+ "2.GREEN" +"\n"+ "3.YELLO");
		String ch = sc.nextLine();
		ch.toLowerCase();
		switch(ch)
		{
			case "red" : System.out.println("STOP");
					break;
			case "green" : System.out.println("GO");
					break;
			case "yellow" :System.out.println("READY");
					break;
			default : System.out.println("INVALID INPUT");
		}

	}
}