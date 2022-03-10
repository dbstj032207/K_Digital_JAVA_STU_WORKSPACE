package cafe;

public class Coffee {

	private String name;
	private int price;
	
	public Coffee() {}

	public Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Coffee(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Coffee [name=" + name + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
}
