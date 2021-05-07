abstract class Example{
	protected abstract void eat();
	abstract void sleep();
}
class Sample extends Example{
	@Override
	public void eat(){
		System.out.println("Eating...");
	}
	void sleep(){
		System.out.println("Sleeping...");
	}
}
class AbstractDemo{
	public static void main(String[] args) {
		Sample ex = new Sample();
		ex.eat();
		ex.sleep();
	}
}