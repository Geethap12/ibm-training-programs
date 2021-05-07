enum Numbers{
	POSITIVE(1), NEGATIVE(2);
	private int value;
	Numbers(int value){
		this.value=value;
	}
	int getvalues(){
		return this.value;
	}
}
class Myprogress{
	public static void main(String[] args) {
		System.out.println("My progress is ");
		for(Numbers num : Numbers.values())
		{
			System.out.println(num +","+ num.getvalues());
		}
	}
}