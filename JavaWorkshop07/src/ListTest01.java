import java.util.ArrayList;
import java.util.Random;

public class ListTest01 {

	public static void main(String[] args) {
		
//		int size = Integer.parseInt(args[0]);
		int size = 10;
		
		MakeList makelist = new MakeList();
		makelist.makeArrayList(size);
		
		ArrayList<Integer> list = null;
		list = makelist.getList();
		
		for (int i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("평균 : " + makelist.getAverage());

	}

}
