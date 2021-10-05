package OOP_6;

public class Exercise6_2 {

	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3,false) ; // �⺻ ������
		SutdaCard c2 = new SutdaCard() ;
		
		System.out.println(c1.info());
		System.out.println(c2.info());

	}
	
	

}

class SutdaCard{
	int num; 
	boolean isKwang; // boolean�� �⺻���� false

	SutdaCard(int num, boolean isKwang){ // �⺻������
		this.num=num;
		this.isKwang=isKwang; 
	}
	
	SutdaCard(){
		this(1,true); //this()�� ���� Ŭ������ �ٸ� �����ڸ� ȣ���Ѵ�.
		
	}
	
	/*
	 * SutdaCard(){
	 * 
	 *  this.num=1; this.isKwang=true;
	 * 
	 * } �� ���°͵� ����
	 */
	
	String info() {
		return num + (isKwang? "K":"");
	}
}
