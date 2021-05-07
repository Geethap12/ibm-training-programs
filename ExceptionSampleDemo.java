
class Exception{
	void sample(String UserName)throws UsernameNotFoundException{
		if(UserName.length()<=3){
			throw new UsernameNotFoundException(UserName);
		}
		else{
			System.out.println(UserName.length());
		}
	}
}
class ExceptionSampleDemo{
	public static void main(String[] args) throws UsernameNotFoundException {
		System.out.println("Enter a string ");
		new Exception().sample(new java.util.Scanner(System.in).nextLine());
	}
}
class UsernameNotFoundException extends Exception{
	UsernameNotFoundException(String UserName){
	super(UserName);
}

}