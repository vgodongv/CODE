package OOP_6;

public class Exercise6_6 {

	    //[6-6] 두 점의 거리를 계산하는 메소드를 완성하시오 getDistance() .
	    //[Hint] 제곱근 계산은  Math.sqrt(double a)를 사용하면 된다 .

		// (x,y) (x1,y1) . 두 점 와 간의 거리를 구한다
		static double getDistance(int x, int y, int x1, int y1) {
		// 거리를 구하는 공식
			return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1)); 
		}
		public static void main(String args[]) {
		System.out.println(getDistance(1,1,2,2));
		
		
		
		MyPoint p = new MyPoint(1,1);
		// p (2,2) . 와 의 거리를 구한다
		System.out.println(p.getDistanceS(2,2));

		


	}

}

//[6-7] getDistance()를 MyPoint클래스에서  getDistanceS() 인스턴스 메서드로 정의하시오.

       class MyPoint {
         	int x;
 	        int y;
	       MyPoint(int x, int y) {
		    this.x = x;
		    this.y = y;
	}
	       double getDistanceS(int x1, int y1) {
	    	   return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1)); 
	       }
	       
	       
}
