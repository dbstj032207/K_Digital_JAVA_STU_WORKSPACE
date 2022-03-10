package cafe;

public class Cafe {


	private Coffee coffeeList[] = new Coffee[10];
	private int index = 0;
	
	public Cafe() {}

	
	public Coffee[] getCoffeeList() {
		return coffeeList;
	}

	public void setCoffeeList(Coffee coffee) {
		if(index < 10) {
			coffeeList[index] = coffee;
			index++;
		}else {
			System.out.println("더 이상 저장할 수 없습니다.");
		}
	}

	public int totalPrice() {
		int total = 0;
		for (int i = 0; i < index; i++) {
			total += coffeeList[i].getPrice();
		}
		return total;
	}


	public int getIndex() {
		return index;
	}


	public void setIndex(int index) {
		this.index = index;
	}
	
	
	

}
