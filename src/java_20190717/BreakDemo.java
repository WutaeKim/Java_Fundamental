package java_20190717;

import java.lang.StringBuilder;
//김우태
public class BreakDemo {
	public static void main(String[] args) {
		int sum = 0;
		// 바깥쪽 while 블럭의 label. label 사용 안하면 합은 105가 된다
		test: while (sum < 100) {
			for (int i = 1; i <= 10; i++) {
				if (i == 6)
					break test;
				sum += i;

			}
		}
		System.out.printf("1부터 5까지의 합은 %d입니다.\n", sum);
		System.out.println();

		String space = " ";

		outter: for (int second = 1; second <= 9; second++) {
			for (int first = 2; first <= 9; first++) {
				if ((first == 4) && (second == 8)) {
					break outter;
				}
				if (first * second >= 10) {
					System.out.printf("%d * %d = %d%s%s", first, second, first * second, space, space);
				} else {
					System.out.printf("%d * %d = %d%s%s%s", first, second, first * second, space, space, space);
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println(); 

		for (int second = 1; second <= 9; second++) {
			for (int first = 2; first <= 9; first++) {
				if ((first == 4) && (second == 8)) {
					break;
				}
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
