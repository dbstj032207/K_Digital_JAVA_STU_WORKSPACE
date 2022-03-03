
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		int sum = 0;
		while (num < 21) {
			if(num % 2 != 0 && num % 3 != 0) {
				sum += num;
			}
			num++;
		}
		System.out.println("sum = " + sum);
	}

}
