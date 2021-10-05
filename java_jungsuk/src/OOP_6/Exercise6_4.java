package OOP_6;

public class Exercise6_4 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println(" :"+s.name); 
		System.out.println(" :"+s.getTotal()); 
		System.out.println(" :"+s.getAverage());
	}

}

class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		// getAverage()는 int타입이라 그냥 3으로나누면 결과도 int형인 78나옴. 
		// 결과값타입을 float로 바꾸고싶으면 다음과 같은 두가지 방식 있음
		float a = (float)getTotal()/3;
		float b = getTotal()/3f;
		return (Math.round(a*10)/10f);
		//return b;
	}
}
