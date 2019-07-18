package java_20190717;

public class WhileDemo {
	public static void main(String[] args) {
		
		int second = 1;
		while (second <= 9) {
			int first = 2;
			while (first <= 9) {
				if (first * second >= 10) {
					System.out.printf("%d * %d = %d%s%s", first, second, first * second, " ", " ");
				} else {
					System.out.printf("%d * %d = %d%s%s%s", first, second, first * second, " ", " ", " ");
				}
				first++;

			}
			System.out.println();
			second++;
		}
	}
}
