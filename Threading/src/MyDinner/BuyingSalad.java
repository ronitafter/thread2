package MyDinner;

public class BuyingSalad extends Thread {

	private String Salad;

	public BuyingSalad(String salad) {
		Salad = salad;
	}

	public void eat() {
		System.out.println("Started eating the" + Salad);
		try {
			Thread.sleep(1000 * 10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Finished eating the " + Salad);


	}

	public String getSalad() {
		return Salad;
	}

	public void setSalad(String salad) {
		Salad = salad;
	}

	@Override
	public String toString() {
//		return String.format("Person:%s Salad: %s", super.toString(),Salad);
		return ("BuyingSalad [Salad=" + Salad + "]");
	}

	@Override
	public void run() {
		eat();

	}

}
