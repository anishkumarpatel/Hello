public class Client {
	public static void main(String[] args) {
		Client cl = new Client();
		System.out.println("I am the main class");

		Adder ad = new Adder();
		ScalerThread t1 = new ScalerThread(ad);
		t1.start();

		Subtractor sb = new Subtractor();
		ScalerThread t2 = new ScalerThread(sb);
		t2.start();
	}
}

class Adder implements Runnable {

	@Override
	public void run() {
		System.out.println("I am the Adder class");
	}
}

class Subtractor implements Runnable {
	@Override
	public void run() {
// TODO Auto-generated method stub
		System.out.println("I am the Subtractor class");
	}
}
