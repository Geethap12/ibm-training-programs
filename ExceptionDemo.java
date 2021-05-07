class ExceptionDemo{
	public static void main(String[] args)throws NullPointerException{
		new ExceptionDemo().sum();
		
	}
	void sum(){
		this.sum();
	}
}