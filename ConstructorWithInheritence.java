class ConstructorWithInheritence{
	public static void main(String[] args) {
		Eras pen = new Eras(4);
		
	}
}
class Pencil{
	Pencil(){
		System.out.println("Kids use pencil to write");
	}
}
class Eras extends Pencil{
	Eras(){
		System.out.println("We erase our mistakes");
	}
	Eras(int n){
		this();
		System.out.println("Erase");
	}
}