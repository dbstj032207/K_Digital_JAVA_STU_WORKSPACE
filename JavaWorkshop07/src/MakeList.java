import java.util.ArrayList;

public class MakeList {
	ArrayList<Integer> list;


	public MakeList() {
		list = new ArrayList<Integer>();
	}

	public void makeArrayList(int size) {
		for (int i = 0; i < size; i++) {
			list.add((int)(Math.random() * 10 ) + 10);
		}
	}
	
	public double getAverage() {
		double result = 0.0;
		double sum = 0;
		
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		result = sum / list.size();
		return result;
	}

	public ArrayList<Integer> getList() {
		return list;
	}

	
	
}
