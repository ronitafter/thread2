package MyDinner;

public class BuyingSushi extends Thread {
	private String sushi;

	public BuyingSushi(String sushi) {
		this.sushi = sushi;

	}

	public void eatSushi() {
//		Thread.sleep(1000 * 60 * 40);
		// 1000 - 1 second
		// 60 - 60 seconds
		// 40 -40 minutes
		System.out.println("Started eating the " + sushi);
		try {
			Thread.sleep(1000 * 15);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Finished eating the " + sushi);

	}

	public String getFood() {
		return sushi;
	}

	public void setFood(String food) {
		this.sushi = food;
	}

	@Override
	public String toString() {
		return "SushiBar [food=" + sushi + "]";
	}

	@Override
	public void run() {
		eatSushi();
	}

}
