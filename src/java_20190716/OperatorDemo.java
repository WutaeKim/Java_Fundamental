package java_20190716;
//ctrl + shift + f => 자동으로 줄 맞추기
public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10, b = 23;
		int c = 0;
		double d;
		System.out.println(c);
		
		c = a - b;
		System.out.println(c);
		
		c = a * b;
		System.out.println(c);

		c = b / a;
		System.out.println(c);

		d = (double)b / (double)a;
		System.out.println(d);

		d = (double)(b / a);
		System.out.println(d);

		c = b % a;
		System.out.println(c);
		
		a += b; //a = a + b
		System.out.println(a);
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		a++;
		b++;
		System.out.println(a++);
		System.out.println(b++);
		System.out.println(a);
		System.out.println(b);
		
		++a;
		++b;
		System.out.println(++a);
		System.out.println(++b);
		
		//대입 후 증가
		c = a++;
		System.out.println(c);
		//증가 후 대입
		c = ++a;
		System.out.println(c);
		
		a = 10;
		b = 20;
		boolean isSuccess = false;
		isSuccess = a > b;
		System.out.println(isSuccess);
		isSuccess = a < b;
		System.out.println(isSuccess);
		isSuccess = a >= b;
		System.out.println(isSuccess);
		isSuccess = a <= b;
		System.out.println(isSuccess);
		isSuccess = a == b;
		System.out.println(isSuccess);
		isSuccess = a != b;
		System.out.println(isSuccess);
		
		a = 10;
		b = 10;
		//short circuit 발생
		//a && b => a가 false이면 b연산을 하지 않음
		//a || b => a가 true이면 b연산을 하지 않음
		isSuccess = (a != b) && (++a == b++);
		System.out.println(a);
		System.out.println(b);
		System.out.println(isSuccess);

		isSuccess = (a != b) || (++a == b++);
		System.out.println(a);
		System.out.println(b);
		System.out.println(isSuccess);
		System.out.println(!isSuccess);
		
		//비트연산 : 1은 true, 0은 false
		//00000111 & 00000101
		//00000111 | 00000101
		System.out.println(7 & 5);
		System.out.println(7 | 5);
		
		
	}
}
