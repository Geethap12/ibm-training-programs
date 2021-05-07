interface Birds{
	void fly();
	void sound();
}
interface Birds11 extends Birds{
	void trees();
}
class Sparrow implements Birds11{
	@Override
	public void fly(){
		System.out.println("Birds have wings to fly");
	}
	@Override
	public void sound(){
		System.out.println("Sparrows make chirpping sound");
	}
	@Override
	public void trees(){
		System.out.println("Birds build nest in trees");
	}
}
class InterfaceDemo {
	public static void main(String[] args) {
		Sparrow sp = new Sparrow();
		sp.fly();
		sp.trees();
	}
}