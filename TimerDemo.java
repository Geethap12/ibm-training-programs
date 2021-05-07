class TimerDemo extends Thread{
	public static void main(String[] args) {
		TimerDemo td = new TimerDemo();
		td.start();
	}
	@Override
	public void run(){
		for(int i=0;i<=60;i++){
			System.out.print(i+"\r");
			try{
			Thread.sleep(1000);
		}catch(InterruptedException ie){
			System.out.println("Disturbed");
		}

		}
	}
}