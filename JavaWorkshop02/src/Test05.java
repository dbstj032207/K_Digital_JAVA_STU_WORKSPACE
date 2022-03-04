// java.lang 묵시적 import

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = (int)(Math.random()*6) + 1;
							// Math.random(): 0.0 ~ 0.9 사이의 값을 뽑아냄
							// (int)(Math.random()*n) + 1 -> 1 ~ n의 값을 뽑아냄
		System.out.println(value);
	}

}
