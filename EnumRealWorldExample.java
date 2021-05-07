enum Fruits{
	MANGO(2), APPLE(3),KIWI(4);
	private int quantity;
	Fruits(int quantity){
		this.quantity=quantity;
	}
	int getquantity(){
		return this.quantity;
	}
}
class FruitsQuantity{
	void getquant(){
		System.out.println("The quantities of the availables fruits are");
		Fruits []quan = Fruits.values();
		for(Fruits quant : quan){
			System.out.println(quant + "quantity is  " + quant.getquantity());
		}
	}
}
class EnumRealWorldExample{
	public static void main(String[] args) {
		new FruitsQuantity().getquant();
	}
}
		