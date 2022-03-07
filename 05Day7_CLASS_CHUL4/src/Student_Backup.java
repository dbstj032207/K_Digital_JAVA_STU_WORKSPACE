//
//public class Student_Backup {
//	
////	정보 은닉화(Encapsulation)
////
////	  - 1. 멤버변수에 접근제한 걸기
////
////	  - 2. 각 멤버변수에 접근하는 get, set함수 만들기
////
////	  - 3. 다른 클래스에서 get, set을 통해서 변수 접근, 사용
//	
//	private String name;
//	private int age;
//	private String address;
//	
//	
////    함수의 문법
////
////    - 클래스 블럭에 위치
////
////    - [접근제한자] [리턴타입(반환값) - 반환값이 없는 경우 void명시] [함수이름(식별자)] (매개변수) { 
////			동작 코드 
////		}
//	
//	public void setName(String name) {	
//		// 다른 클래스에서 접근가능, 리턴 값 없음, 문자열 1개 받아서 사용
//		System.out.println("setName함수 호출됨 ==================");
//		this.name = name;
//	}
//	
//	public String getName() {
//		// 다른 클래스에서 접근 가능, String(문자열) 1개 리턴, 매개변수는 없음 
//		System.out.println("getName함수 호출됨 ==================");
//		return this.name;
//	}
//	
//	public void setAge(int age) {
//		if(age > 0) {
//			this.age = age;
//		} else {
//			System.out.println("나이가 0살 보다 아래입니다. 설정할 수 없습니다.");
//		}
//	}
//	
//	public int getAge() {
//		return age;
//	}
//
//	public void setAddress(String address) {	
//		this.address = address;
//	}
//	
//	public String getAddress() {
//		return this.address;
//	}
//	
//	// 생성자
//	public Student_Backup(String name, int age, String address) {
//		super();
//		this.name = name;
//		if(age > 0) {
//			this.age = age;
//		}
//		this.address = address;
//	}
//
//	public Student_Backup() {
//		super();
//	}
//	
//	
//	
//	
//	
//}
//
//	
//	
//	
//	
//	
//
