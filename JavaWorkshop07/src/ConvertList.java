import java.util.ArrayList;

public class ConvertList {
	

	public ArrayList<Integer> convertList(int array[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = array.length; i > 0; i--) {
			list.add(array[i -1]);
		}
		
		return list;
	}
	
	
}