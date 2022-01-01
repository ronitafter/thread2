package MyDinner;

public class SyncTester {
	
	public static void main(String[] args) {
		
		Person person = new Person("Ronit");
		
		person.orderingShushi();	
		BuyingSushi buyingSushi = new BuyingSushi("Sushi");
		buyingSushi.eatSushi();
		
		person.orderingSalad();
		BuyingSalad buyingSalad = new BuyingSalad("Salad");
		buyingSalad.eat();
		
	
	
		
	}
}
	
	