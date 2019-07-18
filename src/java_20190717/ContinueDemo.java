package java_20190717;

public class ContinueDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			if( i == 6) {
				continue;
			}

			sum += i;
			System.out.println(sum);
		}
	
//		for (int first = 2)
		
	}
}
