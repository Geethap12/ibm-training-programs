class MultithreadsDemo extends Thread{
	public static void main(String[] args) {
		MultithreadsDemo mt1 = new MultithreadsDemo();
		MultithreadsDemo mt2 = new MultithreadsDemo();
		MultithreadsDemo mt3 = new MultithreadsDemo();

		mt1.setName("FirtstThread");
		mt2.setName("SecondThread");
		mt3.setName("ThirdThread");
		mt1.start();
		mt2.start();
		mt3.start();
	}
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName() + " running");
	}

	}
