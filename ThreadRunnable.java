class ThreadRunnable{
	public static void main(String[] args) {
		Thread th = new Thread(new FirstTask());
		th.start();
		
	}
}
class FirstTask implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName()+ " Running.....1");
	}
}
class SecondTask implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName()+ " Running....2");
	}
}