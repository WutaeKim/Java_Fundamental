package java_20190718;

public class ArrayDemo {
	public static void main(String[] args) {
		//int 배열 선언
		
		int[] a = new int[4];
		System.out.println(a);
		
		//배열 할당
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		
		//배열 출력
		int sum = 0;
		for (int i = 0; i < a.length; i++ ) {
			System.out.println(a[i]);
			sum += a[i];
		}
		System.out.printf("배열의 총 합은 %d입니다.%n%d라구요.%n", sum, sum);
		
		int[] b = {1000, 2000, 3000, 4000};
		
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		
		//배열 값 변경
		b[0] = 1;
		System.out.println(b[0]);
	}
}
