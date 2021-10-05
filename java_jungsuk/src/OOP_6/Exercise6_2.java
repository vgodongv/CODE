package OOP_6;

public class Exercise6_2 {

	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3,false) ; // 기본 생성자
		SutdaCard c2 = new SutdaCard() ;
		
		System.out.println(c1.info());
		System.out.println(c2.info());

	}
	
	

}

class SutdaCard{
	int num; 
	boolean isKwang; // boolean의 기본값은 false

	SutdaCard(int num, boolean isKwang){ // 기본생성자
		this.num=num;
		this.isKwang=isKwang; 
	}
	
	SutdaCard(){
		this(1,true); //this()는 같은 클래스의 다른 생성자를 호출한다.
		
	}
	
	/*
	 * SutdaCard(){
	 * 
	 *  this.num=1; this.isKwang=true;
	 * 
	 * } 로 쓰는것도 가능
	 */
	
	String info() {
		return num + (isKwang? "K":"");
	}
}
