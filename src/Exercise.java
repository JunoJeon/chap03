
public class Exercise {
	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		
		double z = x % y;
		
		if (Double.isNaN(z)) {
			System.out.println("0.0 으로 나눌 수 없습니다.");
		}
		else {
			double result = z + 10;
			System.out.println("결과 : " + result);
		}
		
	}
	
	public static void main08(String[] args) {
		int x = 10;
		int y = 5;
		
		System.out.println( (x>7) && (y<=5) );
		System.out.println( (x%3 == 2) || (y%2 != 1) );
		
	}
	
	public static void main06(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop+lengthBottom) * height / 2.;
		
		System.out.println(area);
		
	}

	public static void main05(String[] args) {
		int num = (int)(Math.random()*5000 + 100);
		System.out.println(num);

		
//		num = num - num%100;
		num = num/100*100;
		System.out.println(num);

	}

}
