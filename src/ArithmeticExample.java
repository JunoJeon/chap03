
public class ArithmeticExample {

	public static void main(String[] args) {
		/*
		 * epoch time(unix time) : 1970/01/01 00:00:00 ~ 경과시간
		 * 
		 * GMT, UTC
		 */
		
		long current = System.currentTimeMillis()/1000; //초로변환
		
		long year = 0;
		long month = 0;
		long day = 0;
		long week = 0;
		
		long hour = current/60/60%24 + 9;
		long minute = current/60%60;
		long second = current%60;
		
		System.out.println(current);
		
		System.out.printf("%02d:%02d:%02d\n",hour, minute, second);
		System.out.printf("%04d:%02d:%02d:%02d\n",year, month, day, week);

	}

}
