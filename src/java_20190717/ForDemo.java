package java_20190717;

import java.lang.StringBuilder;

public class ForDemo {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
			sum += i;
			}
		}
		System.out.printf("1부터 10까지 짝수의 합은 %d입니다.\n", sum);
		
		String space = " ";
		for (int second = 1; second <= 9; second++) {
			for (int first = 2; first <= 9; first++) {
				if (first * second >= 10) {
				System.out.printf("%d * %d = %d%s%s", first, second, first * second, space, space);
				} else {
				System.out.printf("%d * %d = %d%s%s%s", first, second, first * second, space, space, space);	
				}
			}
			System.out.println();
		}
		
		System.out.println();

		for (int row = 5; row >= 1; row--) {
			for (int col = 1; col <= row; col++) {
				System.out.printf("%s", "*");
			}
			System.out.println();
		}
		
		System.out.println();

		StringBuilder test = new StringBuilder();
		char[] charArr = { 'a', 'b', 'c', 'd' };
//		System.out.println(test.append(charArr, 2));

		System.out.println();
		
		for (int second = 1; second <= 9; second++) {
			for (int first = 9; first >= 2; first--) {
				if (first * second >= 10) {
				System.out.printf("%d * %d = %d%s%s", first, second, first * second, space, space);
				} else {
				System.out.printf("%d * %d = %d%s%s%s", first, second, first * second, space, space, space);	
				}
			}
			System.out.println();
		}
		
	}
}
