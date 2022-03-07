
public class Test03 {

	public static void main(String[] args) {
		int[][] arr2 = new int[4][5];
		
		int temp = 5;
	
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = temp;
			}
			
			if (temp >= 10) {
				temp = temp + 10;
			}else {
				temp = temp + 5;
			}
		}
		
		int cnt = 0;
		int sum = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				sum += arr2[i][j];
				cnt++;
			}
		}
		
		System.out.println("total=" + sum);
		System.out.println("average=" + ((float)sum/cnt));

		

	}

}
