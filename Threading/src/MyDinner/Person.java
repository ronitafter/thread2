package MyDinner;

public class Person {

	private String name;

	public Person(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public void orderingShushi() {
		System.out.println(name + " is ordering sushi"); 
	}
	
	public void orderingSalad() {
		System.out.println(name + " is ordering a salad"); 
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
	
	

}
