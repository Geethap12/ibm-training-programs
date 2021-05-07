class ConstructorGetSet
{ 
	private int a,b;
	ConstructorGetSet(int a, int b){
		this.a = a;
		this.b = b;
	}
	public int getFirstNum(){
		return this.a;
	}
	public void setFirstNum(int a){
		 this.a=a;
	}
	public int getSecondNum(){
		return this.b;
	}
	public void setSecondNum(int b){
		 this.b=b;
	}
	public int add(int n, int m){
		int res=n+m;
		return res;
	}
}
class ConstructorMain
{
	public static void main(String[] args){
		ConstructorGetSet first = new ConstructorGetSet(6,8);
		System.out.println(first.add(5,6));
		System.out.println(first.getFirstNum() +"," + first.getSecondNum());
	}
}