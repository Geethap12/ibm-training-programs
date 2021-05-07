
class RandomNumbers extends Thread{
	public static void main(String[] args) {
		int num;
		RandomNumbers rdm = new RandomNumbers();
		rdm.start();
		System.out.println(rdm.getRandom());
	}
		public int getRandom(){
			return this.num;
		}
	}
