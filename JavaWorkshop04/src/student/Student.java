package student;

public class Student {
	
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	
	public Student() {}
	public Student(String name, int korean, int english, int math, int science) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	
	
	public double getAvg() {
		double avg;
		avg = (korean + english + math + science) / 4; 
		return avg;
	}
	
	
	public String getGrade() {
		String grade;
		if( 90 <= getAvg() && getAvg() <= 100 ) {
			grade = "A 학점";
		}else if( 70 <= getAvg() && getAvg() < 90 ) {
			grade = "B 학점";
		}else if( 50 <= getAvg() && getAvg() < 70 ) {
			grade = "C 학점";
		}else if( 30 <= getAvg() && getAvg() < 50 ) {
			grade = "D 학점";
		}else {
			grade = "F 학점";
		}
		
		
		return grade;
	}
	
	
	

}
