package MyDinner;

public class ASyncTester {

	public static void main(String[] args) {

		Person person = new Person("Ronit");
		
		person.orderingShushi();
		BuyingSushi buyingSushi = new BuyingSushi("Sushi");
//		buyingSushi.run();
		buyingSushi.start();


		person.orderingSalad();
		BuyingSalad buyingSalad = new BuyingSalad("Salad");
//		Thread buyingSalad
//		buyingSalad.run();
		buyingSalad.start();


		while(buyingSushi.isAlive() || buyingSalad.isAlive()) {
			System.out.println(".");
			try {
				Thread.sleep(1000*2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("The Food was delicious!");
	}
}
