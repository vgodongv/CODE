package OOP_6;

public class Exercise6_6 {

	    //[6-6] �� ���� �Ÿ��� ����ϴ� �޼ҵ带 �ϼ��Ͻÿ� getDistance() .
	    //[Hint] ������ �����  Math.sqrt(double a)�� ����ϸ� �ȴ� .

		// (x,y) (x1,y1) . �� �� �� ���� �Ÿ��� ���Ѵ�
		static double getDistance(int x, int y, int x1, int y1) {
		// �Ÿ��� ���ϴ� ����
			return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1)); 
		}
		public static void main(String args[]) {
		System.out.println(getDistance(1,1,2,2));
		
		
		
		MyPoint p = new MyPoint(1,1);
		// p (2,2) . �� �� �Ÿ��� ���Ѵ�
		System.out.println(p.getDistanceS(2,2));

		


	}

}

//[6-7] getDistance()�� MyPointŬ��������  getDistanceS() �ν��Ͻ� �޼���� �����Ͻÿ�.

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
