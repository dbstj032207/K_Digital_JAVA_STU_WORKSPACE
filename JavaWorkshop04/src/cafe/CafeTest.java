package cafe;

public class CafeTest {

	public static void main(String[] args) {
		
		Cafe cafe = new Cafe();
		Coffee coffee1 = new Coffee("Americano", 4000);
		Coffee coffee2 = new Coffee("Caffelatte", 5000);
		Coffee coffee3 = new Coffee("Macchiato", 6000);
		
		cafe.setCoffeeList(coffee1);
		cafe.setCoffeeList(coffee2);
		cafe.setCoffeeList(coffee3);
		

		for (int i = 0; i < cafe.getIndex(); i++) {
			System.out.println(cafe.getCoffeeList()[i].getName() + 
					"\t" + cafe.getCoffeeList()[i].getPrice());
		}
		System.out.println();
		System.out.println("Coffee 가격의 합 : " + cafe.totalPrice());

	}

}
