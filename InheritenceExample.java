class Animals{
	void walk(){
		System.out.println("Animals have 4 legs to walk");
	}
	void smell(){
		System.out.println("Animals can smell");
	}
}
class Dog extends Animals{
	void barks(){
		System.out.println("Dog's Bark");
	}
	void walk(int n){
		System.out.println("Dog's have 4 legs to walk");
	}
}
class Lion extends Animals{
	void roar(){
		System.out.println("Lion roars");
	}
}
class Lion1 extends Lion{

}
class InheritenceExample{
	public static void main(String[] args) {
		Dog dg = new Dog();
		dg.legs(3);

	new Lion1().smell();
	}
}