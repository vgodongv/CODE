package OOP_6;

public class Exercise6_4 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "ȫ�浿";
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
		// getAverage()�� intŸ���̶� �׳� 3���γ����� ����� int���� 78����. 
		// �����Ÿ���� float�� �ٲٰ������ ������ ���� �ΰ��� ��� ����
		float a = (float)getTotal()/3;
		float b = getTotal()/3f;
		return (Math.round(a*10)/10f);
		//return b;
	}
}
