public class Slow extends Thread {
	public static void pause(int t) throws InterruptedException {
		Thread.sleep(t);
	}
}
